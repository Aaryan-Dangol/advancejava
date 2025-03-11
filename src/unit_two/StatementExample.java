package unit_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatementExample {
    public static void main(String[] args) {
        try {
            // Load the driver
           // Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
            // Create a statement
            Statement st = con.createStatement();
            String insertionSql="INSERT INTO students (student_id, first_name, last_name) VALUES (4, 'Futta Prasad', 'Phuyal');";
             st.execute(insertionSql);
            System.out.println("Inserted students into the database");
            // Execute a query
            String sql = "SELECT * FROM students";
            ResultSet rs = st.executeQuery(sql);
            List<Student> studentList = new ArrayList<Student>();
            // Process the result
            while (rs.next()) {
                System.out.println("First Name: " + rs.getString("first_name") + ", Last Name: " + rs.getString("last_name")+ "ID: " + rs.getInt("student_id"));
              studentList.add(new Student(rs.getInt("student_id"), rs.getString("first_name"), rs.getString("last_name")));
            }
            // Close resources
            rs.close();
            st.close();
            con.close();
            System.out.println(studentList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}