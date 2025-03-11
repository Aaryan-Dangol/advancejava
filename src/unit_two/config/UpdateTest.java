package unit_two.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 Execute, ExecuteUpdate & ExecuteQuery

execute(): Used for DDL (Data Definition Language) statements like CREATE, ALTER, and DROP.
 Returns true if the first result is a ResultSet, false if it is an update count or there are no results.

executeUpdate(): Used for DML (Data Manipulation Language) statements like INSERT,
UPDATE, DELETE. Returns the number of affected rows.

executeQuery(): Used for SELECT statements.
 Returns a ResultSet containing the query results.
 */
public class UpdateTest {
    public static void main(String[] args) throws SQLException {
        JdbcConnectionInitiation jdbcSetup = new JdbcConnectionInitiation();
        Connection conn = jdbcSetup.getConnection();

        Statement stmt = conn.createStatement();
        String updateDataSQL = "UPDATE users SET age = 35 WHERE name = 'Futta Prasad Phuyal'";
        stmt.execute(updateDataSQL);

        stmt.close();
        jdbcSetup.closeConnection();
    }
}
