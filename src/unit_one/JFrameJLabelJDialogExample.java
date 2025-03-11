package unit_one;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameJLabelJDialogExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JFrame, JLabel, and JDialog Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JLabel
        JLabel label = new JLabel("Click the button to show a dialog.");
        frame.add(label);
// Create a button to show the dialog
        JButton button = new JButton("Show Dialog");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Create a modal JDialog
                JDialog dialog = new JDialog(frame, "Dialog", true);
                dialog.setSize(200, 100);
                dialog.add(new JLabel("This is a dialog."));
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