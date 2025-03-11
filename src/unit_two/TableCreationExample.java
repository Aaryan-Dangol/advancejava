package unit_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TableCreationExample {
    public static void main(String[] args) {
        try {
            // Load the driver
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/morgan",
                            "root",
                            "password");
            // Create a statement
            Statement st = con.createStatement();
            String employeeCreationQuery="CREATE TABLE IF NOT EXISTS employee (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), department varchar(10),address varchar(50), salaray numeric(10,2) , isActive BOOLEAN)";
            st.execute(employeeCreationQuery);
            // Close resources
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
