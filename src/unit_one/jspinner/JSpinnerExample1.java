package unit_one.jspinner;

import javax.swing.*;
import java.awt.*;

public class JSpinnerExample1 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JSpinner Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create a JSpinner with default model (numeric range)
        JSpinner spinner = new JSpinner();


        // Add a label to display the spinner value
        JLabel label = new JLabel("Value: " + spinner.getValue());

        // Add a ChangeListener to update the label when the spinner value changes
        spinner.addChangeListener(e -> label.setText("Value: " + spinner.getValue()));

        // Add components to the frame
        frame.add(spinner);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}