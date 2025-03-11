package unit_one.jlabel;

import javax.swing.*;

public class JLabelIcon {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JLabel Example 2");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Load an image icon
       // ImageIcon icon = new ImageIcon("path/to/your/image.png");
        ImageIcon icon = new ImageIcon("/home/bishranta/Pictures/Screenshots/Screenshot from 2024-07-07 23-27-33.png");

// Create a JLabel with the icon
        JLabel label = new JLabel(icon);
// Add the label to the frame
        frame.add(label);
// Display the frame
        frame.setVisible(true);
    }
}