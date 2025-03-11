package unit_two.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionInitiation {
    // JDBC driver and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/morgan";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "password";

    // Connection object
    private Connection conn;

    // Constructor to initialize the connection
    public JdbcConnectionInitiation() {
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("**********DATABASE CONNECTED ***********");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Getter method to access the connection
    public Connection getConnection() {
        return conn;
    }

    // Close the connection
    public void closeConnection() {
        try {
            if (conn != null) conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}