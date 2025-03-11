package unit_two.rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class JdbcRowSetExample {
    public static void main(String[] args) {
// Database connection details
        String url = "jdbc:mysql://localhost:3306/morgan"; // Replace withyour database URL
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password
        try {
// Step 1: Create a JdbcRowSet object
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
// Step 2: Set connection properties
            rowSet.setUrl(url);
            rowSet.setUsername(username);
            rowSet.setPassword(password);
// Step 3: Set the SQL query to fetch data from the Employees table
            rowSet.setCommand("SELECT * FROM Employees");
// Step 4: Execute the query and populate the RowSet
            rowSet.execute();
// Step 5: Iterate through the RowSet and display the data
            System.out.println("Employee Data:");
            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String name = rowSet.getString("name");
                String department = rowSet.getString("department");
                double salary = rowSet.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
            }
// Step 6: Close the RowSet (optional, as it will be closed automatically when the connection is closed)
            rowSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}