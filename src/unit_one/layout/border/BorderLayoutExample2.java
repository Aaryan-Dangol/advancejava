package unit_one.layout.border;

import javax.swing.*;import java.awt.*;
public class BorderLayoutExample2 {
public static void main(String[] args) {
    JFrame frame = new JFrame("BorderLayout Example 2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
// Set BorderLayout with gaps
    JPanel panel = new JPanel(new BorderLayout(10, 10));
// Add components to the panel
    panel.add(new JButton("North"), BorderLayout.NORTH);
    panel.add(new JButton("South"), BorderLayout.SOUTH);
    panel.add(new JButton("East"), BorderLayout.EAST);
    panel.add(new JButton("West"), BorderLayout.WEST);
    panel.add(new JButton("Center"), BorderLayout.CENTER);
// Add the panel to the frame
    frame.add(panel);
// Display the frame
    frame.setVisible(true);
}
}