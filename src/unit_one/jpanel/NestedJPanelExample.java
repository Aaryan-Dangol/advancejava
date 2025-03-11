package unit_one.jpanel;

import javax.swing.*;import java.awt.*;

public class NestedJPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Top panel
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.YELLOW);
        topPanel.add(new JLabel("Top Panel"));

        // Center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.CYAN);
        centerPanel.add(new JLabel("Center Panel"));

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.GREEN);
        bottomPanel.add(new JLabel("Bottom Panel"));

        // Add sub-panels to the main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Display the frame
        frame.setVisible(true);
    }}