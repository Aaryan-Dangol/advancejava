package unit_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MutiValueInsertionExample {
    public static void main(String[] args) {
        try{
            Connection connection
                    = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/morgan",
                            "root",
                            "password");
            Statement st = connection.createStatement();
            String insertionQuery="insert into employee(name,department,address,salaray,isActive) values('Shyam','Python','Jungle',120.00,true),('Hari','React','Forest',12.00,true),('Krishna','UI','Brindaban',0.00,true),('Govinda','Java','Ocean',1.00,true),('Futta Prasad Phuyal','JAVA','Kathmandu',20.00,false)";
            st.execute(insertionQuery);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
