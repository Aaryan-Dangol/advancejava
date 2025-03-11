package unit_one.jtextfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JTextField
        JTextField textField = new JTextField(20);
// Create a button to display the input
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You entered: " + textField.getText());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Enter your name:"));
        frame.add(textField);
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}