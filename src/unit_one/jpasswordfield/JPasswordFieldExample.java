package unit_one.jpasswordfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JPasswordField Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JPasswordField
        JPasswordField passwordField = new JPasswordField(20);
// Create a button to display the password
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword();
                JOptionPane.showMessageDialog(frame, "You entered: " + new String(password));
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Enter your password:"));
        frame.add(passwordField);
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}