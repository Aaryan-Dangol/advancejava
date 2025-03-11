package unit_one.jspinner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSpinnerCustomExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JSpinner Custom Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a SpinnerNumberModel with custom range (1 to 10, step 1)
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 10, 1);
        JSpinner spinner = new JSpinner(model);
// Create a button to display the selected value
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Selected value: " + spinner.getValue());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Select a number (1-10):"));
        frame.add(spinner);
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}