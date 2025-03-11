package unit_one.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombinedAllButtonExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Combined All Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create components
        JButton button = new JButton("Click Me");
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        JCheckBox checkBox = new JCheckBox("Check Me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
//        ButtonGroup group = new ButtonGroup();
//        group.add(radioButton1);
//        group.add(radioButton2);
// Add action listeners
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Toggle button is " + (toggleButton.isSelected() ? "ON" : "OFF"));
            }
        });
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Checkbox is " + (checkBox.isSelected() ? "checked" : "unchecked"));
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(button);
        frame.add(toggleButton);
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
// Display the frame
        frame.setVisible(true);
    }
}