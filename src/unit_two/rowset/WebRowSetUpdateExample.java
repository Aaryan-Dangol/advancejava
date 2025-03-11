package unit_two.rowset;

import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.RowSetProvider;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
The initial data is fetched from the database.
The data is saved into an XML file (employees.xml).
The program reads the data from XML (disconnected mode).
Employee's salary is updated in-memory (disconnected state).
The program reconnects and pushes changes to the database.
 */

public class WebRowSetUpdateExample {
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

            // Step 5: Write the RowSet data to an XML file (simulate disconnected state)
            try (FileWriter writer = new FileWriter("employeesUpdateTest.xml")) {
                rowSet.writeXml(writer);
                System.out.println("Data written to employeesUpdateTest.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Step 6: Read the RowSet data from the XML file (simulate disconnected access)
            WebRowSet rowSetFromXml = RowSetProvider.newFactory().createWebRowSet();
            try (FileReader reader = new FileReader("employeesUpdateTest.xml")) {
                rowSetFromXml.readXml(reader);
                System.out.println("Data successfully read from employees.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Step 7: Modify a row in the disconnected state
            if (rowSetFromXml.next()) { // Move to the first row
                System.out.println("Updating salary for Employee ID: " + rowSetFromXml.getInt("id"));
                rowSetFromXml.updateDouble("salary", 90000.00); // Change salary
                rowSetFromXml.updateRow(); // Apply the change locally
                System.out.println("Salary updated in disconnected mode.");
            }

            // Step 8: Sync changes back to the database
            rowSetFromXml.setUrl(url); // Reconnect to the database
            rowSetFromXml.setUsername(username);
            rowSetFromXml.setPassword(password);
            rowSetFromXml.acceptChanges(); // Push updates to the database
            System.out.println("Changes synchronized back to the database.");


//            try (Connection conn = DriverManager.getConnection(url, username, password)) {
//                conn.setAutoCommit(false); //  Disable AutoCommit
//                rowSetFromXml.acceptChanges(conn); // ✅ Use explicit connection
//                conn.commit(); // ✅ Commit manually
//                System.out.println("Changes synchronized back to the database.");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }


            // Step 9: Display updated data
            System.out.println("Updated Employee Data (From XML):");
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
