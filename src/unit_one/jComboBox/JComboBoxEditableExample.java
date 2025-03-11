package unit_one.jComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxEditableExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Editable JComboBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create an editable JComboBox
        String[] items = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setEditable(true);
// Create a button to display the selected or entered item
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Selected/Entered item: " + comboBox.getSelectedItem());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Select or enter an option:"));
        frame.add(comboBox);
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}