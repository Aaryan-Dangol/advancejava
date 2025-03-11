package unit_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/morgan";
        String user = "root";
        String password = "password";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
            //code logic here

        } catch (SQLException e) {
            System.out.println("Cannot connect to the database!");
            e.printStackTrace();
        }
    }
}
