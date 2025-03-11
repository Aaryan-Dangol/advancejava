package unit_two.rowset;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class CachedRowSetExample {
    public static void main(String[] args) {
// Database connection details
        String url = "jdbc:mysql://localhost:3306/morgan"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password
        try {
// Step 1: Create a CachedRowSet object
            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
// Step 2: Set connection properties
            rowSet.setUrl(url);
            rowSet.setUsername(username);
            rowSet.setPassword(password);
// Step 3: Set the SQL query to fetch data from the Employees table
            rowSet.setCommand("SELECT * FROM Employees");
// Step 4: Execute the query and populate the RowSet
            rowSet.execute();
// Step 5: Disconnect from the database (RowSet is now offline)
            System.out.println("Employee Data (Offline):");
            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String name = rowSet.getString("name");
                String department = rowSet.getString("department");
                double salary = rowSet.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
            }
// Step 6: Update a row offline
            rowSet.absolute(1); // Move to the first row
            rowSet.updateDouble("salary", 77000.00); // Update the salary
            rowSet.updateRow();
// Step 7: Reconnect to the database and push changes
            //The acceptChanges() method reconnects to the database and updates the changes.
            rowSet.acceptChanges();
            System.out.println("Salary updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}