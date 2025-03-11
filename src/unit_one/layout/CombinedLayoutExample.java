package unit_one.layout;

import javax.swing.*;
import java.awt.*;

public class CombinedLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
// Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
// Top panel with FlowLayout
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(new JLabel("Welcome to the Application"));
        topPanel.setBackground(Color.decode("#43B7BA"));
// Center panel with GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        centerPanel.add(new JLabel("Name:"));
        centerPanel.add(new JTextField());
        centerPanel.add(new JLabel("Email:"));
        centerPanel.add(new JTextField());
        centerPanel.add(new JLabel("Password:"));
        centerPanel.add(new JPasswordField());
// Bottom panel with FlowLayout
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(new JButton("Submit"));
        bottomPanel.add(new JButton("Cancel"));
        bottomPanel.setBackground(Color.CYAN);
// Add sub-panels to the main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
// Add the main panel to the frame
        frame.add(mainPanel);
// Display the frame
        frame.setVisible(true);
    }
}