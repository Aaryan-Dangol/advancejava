package unit_one.buttons.jcheckbox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JCheckBox
        JCheckBox checkBox = new JCheckBox("Check Me");
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Checkbox is checked");
                } else {
                    JOptionPane.showMessageDialog(frame, "Checkbox is unchecked");
                }
            }
        });
// Add the checkbox to the frame
        frame.add(checkBox);
// Display the frame
        frame.setVisible(true);
    }
}