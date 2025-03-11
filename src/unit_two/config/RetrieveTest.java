package unit_two.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveTest {
    public static void main(String[] args) throws SQLException {
        JdbcConnectionInitiation JdbcConnectionInitiation = new JdbcConnectionInitiation();
        Connection conn = JdbcConnectionInitiation.getConnection();

        Statement stmt = conn.createStatement();
        String readDataSQL = "SELECT * FROM users";
        ResultSet resultSet = stmt.executeQuery(readDataSQL);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        resultSet.close();
        stmt.close();
        JdbcConnectionInitiation.closeConnection();
    }
}
