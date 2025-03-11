package unit_one.buttons.jbutton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JButton
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });
// Add the button to the frame
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}