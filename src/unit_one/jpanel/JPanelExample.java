package unit_one.jpanel;

import javax.swing.*;import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(new JLabel("Hello, World!"));
        panel.add(new JButton("Click Me"));

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }}