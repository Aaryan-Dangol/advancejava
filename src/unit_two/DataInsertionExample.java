package unit_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsertionExample {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
            Statement st = connection.createStatement();
           String ramInsertion="insert into employee(name,department,address,salaray,isActive) values('Ram','JAVA','TOKHA',1200.00,true)";
           st.execute(ramInsertion);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
