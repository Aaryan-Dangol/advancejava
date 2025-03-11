package unit_one.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLabTask {
    public static void main(String[] args) {
        // 1. Create JFrame
        JFrame frame = new JFrame("Swing Components Lab");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 2. Header Panel (NORTH)
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Swing Components Lab");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(titleLabel);
        frame.add(headerPanel, BorderLayout.NORTH);

        // 3. Form Panel (CENTER)
        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        formPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);
        
        formPanel.add(new JLabel("Age:"));
        JTextField ageField = new JTextField();
        formPanel.add(ageField);
        
        formPanel.add(new JLabel("Gender:"));
        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        formPanel.add(genderBox);

        frame.add(formPanel, BorderLayout.CENTER);

        // 4. Button Panel (SOUTH)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // 5. Action Listeners
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
                genderBox.setSelectedIndex(0);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // 6. Show Frame
        frame.setVisible(true);
    }
}
