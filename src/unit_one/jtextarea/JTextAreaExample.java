package unit_one.jtextarea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JTextArea
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
// Create a button to display the input
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You entered:\n" +
                        textArea.getText());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(),
                BoxLayout.Y_AXIS));
        frame.add(new JLabel("Enter your comments:"));
        frame.add(new JScrollPane(textArea)); // Add scroll pane for text area
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}