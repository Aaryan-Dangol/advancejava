package unit_one.jlabel;

import javax.swing.JLabel;
import javax.swing.JFrame;

public class JLabelExample1 {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JLabel Example 1");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JLabel with text
        JLabel label = new JLabel("Hello, World!");
// Add the label to the frame
       frame.add(label);
// Display the frame
        frame.setVisible(true);
    }
}