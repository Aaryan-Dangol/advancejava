package unit_one.buttons.jtogglebutton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JToggleButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JToggleButton
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Toggle button is ON");
                } else {
                    JOptionPane.showMessageDialog(frame, "Toggle button isOFF");
                }
            }
        });
// Add the toggle button to the frame
        frame.add(toggleButton);
// Display the frame
        frame.setVisible(true);
    }
}