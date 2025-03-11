package unit_two.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreationTest {
    public static void main(String[] args) throws SQLException {
        JdbcConnectionInitiation JdbcConnectionInitiation = new JdbcConnectionInitiation();
        Connection conn = JdbcConnectionInitiation.getConnection();

        Statement stmt = conn.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT)";
        stmt.execute(createTableSQL);

        stmt.close();
        JdbcConnectionInitiation.closeConnection();
    }
}
