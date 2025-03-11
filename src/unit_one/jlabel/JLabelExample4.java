package unit_one.jlabel;

import javax.swing.*;

public class JLabelExample4 {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JLabel Example 4");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JLabel with HTML-formatted text
        JLabel label = new JLabel("<html> <b>JLabel</b> with <i>HTML</i> formatting.</p></html>");
// Add the label to the frame
        frame.add(label);
// Display the frame
        frame.setVisible(true);
    }
}