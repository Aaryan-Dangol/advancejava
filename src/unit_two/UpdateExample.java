package unit_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/morgan",
                            "root",
                            "password");
            Statement st = connection.createStatement();
            String updateQuery="update employee set isActive=false where id=6";
             st.executeUpdate(updateQuery);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
