package unit_one.layout.flow;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
// Set FlowLayout with default alignment (CENTER)
        JPanel panel = new JPanel(new FlowLayout());
// Add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
// Add the panel to the frame
        frame.add(panel);
// Display the frame
        frame.setVisible(true);
    }
}