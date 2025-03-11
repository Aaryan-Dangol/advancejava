package unit_one.jdialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDialogExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Input Dialog Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JLabel
        JLabel label = new JLabel("Your input will appear here.");
        frame.add(label);
// Create a button to show the input dialog
        JButton button = new JButton("Enter Input");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Create a modal JDialog with a text field
                JDialog dialog = new JDialog(frame, "Input Dialog", true);
                dialog.setSize(300, 150);
                dialog.setLayout(new BoxLayout(dialog.getContentPane(), BoxLayout.Y_AXIS));
                JTextField textField = new JTextField(20);
                JButton submitButton = new JButton("Submit");
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
// Update the JLabel with the input
                        label.setText("You entered: " + textField.getText());
                        dialog.dispose(); // Close the dialog
                    }
                });
                dialog.add(new JLabel("Enter some text:"));
                dialog.add(textField);
                dialog.add(submitButton);
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });
// Add the button to the frame
        frame.add(button);
// Set layout and display the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setVisible(true);
    }
}