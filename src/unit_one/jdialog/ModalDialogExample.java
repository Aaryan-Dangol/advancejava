package unit_one.jdialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalDialogExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Modal JDialog Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a button to show the dialog
        JButton button = new JButton("Show Modal Dialog");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Create a modal JDialog
                JDialog dialog = new JDialog(frame, "Modal Dialog", true);
                dialog.setSize(200, 100);
                dialog.add(new JLabel("This is a modal dialog."));
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });
// Add the button to the frame
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}