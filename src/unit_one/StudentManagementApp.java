package unit_one;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Model Class
class Student {
    String name, phone, dob, gender, department, semester, email;
    public Student(String name, String phone, String dob, String gender, String department, String semester, String email) {
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.department = department;
        this.semester = semester;
        this.email = email;
    }
}




// View Class
class StudentView extends JFrame {
    DefaultTableModel tableModel;
    JTable studentTable;
    JButton addButton, viewButton;
    
    public StudentView() {
        setTitle("Student Management");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        String[] columnNames = {"Name", "Phone", "DOB", "Gender", "Department", "Semester", "Email"};
        tableModel = new DefaultTableModel(columnNames, 0);
        studentTable = new JTable(tableModel);
        
        addButton = new JButton("Add Student");
        viewButton = new JButton("View Student");
        
        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(viewButton);
        
        add(new JScrollPane(studentTable), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
    }
}

// Controller Class
class StudentController {
    private StudentView view;
    
    public StudentController(StudentView view) {
        this.view = view;
        
        view.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAddStudentDialog();
            }
        });
    }
    
    private void showAddStudentDialog() {
        JTextField nameField = new JTextField(10);
        JTextField phoneField = new JTextField(10);
        JTextField dobField = new JTextField(10);
        JTextField genderField = new JTextField(10);
        JTextField departmentField = new JTextField(10);
        JTextField semesterField = new JTextField(10);
        JTextField emailField = new JTextField(10);
        
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.add(new JLabel("Name:")); panel.add(nameField);
        panel.add(new JLabel("Phone:")); panel.add(phoneField);
        panel.add(new JLabel("DOB:")); panel.add(dobField);
        panel.add(new JLabel("Gender:")); panel.add(genderField);
        panel.add(new JLabel("Department:")); panel.add(departmentField);
        panel.add(new JLabel("Semester:")); panel.add(semesterField);
        panel.add(new JLabel("Email:")); panel.add(emailField);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Student", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Object[] row = {nameField.getText(), phoneField.getText(), dobField.getText(),
                            genderField.getText(), departmentField.getText(),
                            semesterField.getText(), emailField.getText()};
            view.tableModel.addRow(row);
        }
    }
}

// Main Class
public class StudentManagementApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentView view = new StudentView();
            new StudentController(view);
            view.setVisible(true);
        });
    }
}
