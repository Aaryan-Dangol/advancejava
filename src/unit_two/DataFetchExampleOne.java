package unit_two;

import java.sql.*;

public class DataFetchExampleOne {
    public static void main(String[] args) {
        try{
            Connection connection
                    = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/morgan",
                            "root",
                            "password");
            Statement st = connection.createStatement();
            String allFetch="select * from employee ";
            String fetchquery="select * from employee where id=6";
            ResultSet rs = st.executeQuery(fetchquery);
            //ResultSet rs = st.executeQuery(allFetch);
            while(rs.next()){
                System.out.println("******************************");
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("department"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getDouble("salaray"));
                System.out.println(rs.getBoolean("isActive"));
                System.out.println("******************************");
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
