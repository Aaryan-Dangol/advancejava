package unit_one.jdialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModelessDialogExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Modeless JDialog Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a button to show the dialog
        JButton button = new JButton("Show Modeless Dialog");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Create a modeless JDialog
                JDialog dialog = new JDialog(frame, "Modeless Dialog", false);
                dialog.setSize(200, 100);
                dialog.add(new JLabel("This is a modeless dialog."));
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