package unit_two.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionExample {
    public static void main(String[] args) throws SQLException {
        JdbcConnectionInitiation JdbcConnectionInitiation = new JdbcConnectionInitiation();
        Connection conn = JdbcConnectionInitiation.getConnection();

        Statement stmt = conn.createStatement();
        String insertDataSQL = "INSERT INTO users (name, age) VALUES ('Futta Prasad Phuyal', 23)";
        stmt.execute(insertDataSQL);

        stmt.close();
        JdbcConnectionInitiation.closeConnection();
    }
}
