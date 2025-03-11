package unit_one.jlabel;

import javax.swing.*;

public class JLabelExample3 {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JLabel Example 3");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Load an image icon
        ImageIcon icon = new ImageIcon("/home/bishranta/Videos/RCL /techspireFirstSem/AdvancedJavaDemos/src/Screenshot from 2024-07-07 23-27-33.png");
// Create a JLabel with text and icon
        JLabel label = new JLabel("Java Swing", icon, JLabel.CENTER);
// Set the horizontal alignment of the text and icon
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
// Add the label to the frame
        frame.add(label);
// Display the frame
        frame.setVisible(true);
    }
}