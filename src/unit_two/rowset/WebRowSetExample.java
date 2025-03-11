package unit_two.rowset;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;


/*
How Is It Disconnected?
Connected Phase

Executes the SQL query to fetch data.
Retrieves the result set into memory.
Immediately disconnects from the database.
Disconnected Phase

Stores data locally in memory.
Allows XML serialization and deserialization without needing a database connection.
Reconnected Phase (Optional)

When writing changes back to the database using acceptChanges().
Not used in this example, but can be added.
 */
public class WebRowSetExample {
    public static void main(String[] args) {
// Database connection details
        String url = "jdbc:mysql://localhost:3306/morgan"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password
        try {
// Step 1: Create a WebRowSet object
            WebRowSet rowSet = RowSetProvider.newFactory().createWebRowSet();
// Step 2: Set connection properties
            rowSet.setUrl(url);
            rowSet.setUsername(username);
            rowSet.setPassword(password);
// Step 3: Set the SQL query to fetch data from the Employees table
            rowSet.setCommand("SELECT * FROM Employees");
// Step 4: Execute the query and populate the RowSet
            rowSet.execute();
// Step 5: Write the RowSet data to an XML file
            try (FileWriter writer = new FileWriter("employees.xml")) {
                rowSet.writeXml(writer);
                System.out.println("Data written to employees.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }
// Step 6: Read the RowSet data from the XML file
            WebRowSet rowSetFromXml = RowSetProvider.newFactory().createWebRowSet();
            try (FileReader reader = new FileReader("employees.xml")) {
                rowSetFromXml.readXml(reader);
                System.out.println("Data successfully read from employees.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }

// Step 7: Iterate through the RowSet and display the data
            System.out.println("Employee Data (From XML):");
            while (rowSetFromXml.next()) {
                int id = rowSetFromXml.getInt("id");
                String name = rowSetFromXml.getString("name");
                String department = rowSetFromXml.getString("department");
                double salary = rowSetFromXml.getDouble("salary");
                System.out.println("ID: " + id +
                        ", Name: " + name +
                        ", Department: " + department +
                        ", Salary: " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}