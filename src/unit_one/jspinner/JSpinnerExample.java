package unit_one.jspinner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSpinnerExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JSpinner Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JSpinner
        JSpinner spinner = new JSpinner();
        spinner.setPreferredSize(new Dimension(100, 30));
        // Create a button to display the selected value
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Selected value: " + spinner.getValue());
            }
        });

        // Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));
        frame.add(new JLabel("Select a number:"));
        frame.add(spinner);
        frame.add(button);

        // Display the frame
        frame.setVisible(true);
    }
}
