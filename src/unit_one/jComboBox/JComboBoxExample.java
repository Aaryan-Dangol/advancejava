package unit_one.jComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JComboBox with items
        String[] items = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
// Create a button to display the selected item
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Selected item: " + comboBox.getSelectedItem());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Select an option:"));
        frame.add(comboBox);
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}