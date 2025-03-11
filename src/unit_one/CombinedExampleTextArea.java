package unit_one;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CombinedExampleTextArea {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Combined Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JLabel commentLabel = new JLabel("Comments:");
        JTextArea commentArea = new JTextArea(10, 20);
        commentArea.setLineWrap(true);
        commentArea.setWrapStyleWord(true);
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());
                String comments = commentArea.getText();
                String message = "Name: " + name + "\nPassword: " + password.toUpperCase().concat(String.valueOf(new Random(131313).nextGaussian())) + "\nComments: " + comments;
                JOptionPane.showMessageDialog(frame, message);
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(commentLabel);
        frame.add(new JScrollPane(commentArea));
        frame.add(submitButton);
// Display the frame
        frame.setVisible(true);
    }
}