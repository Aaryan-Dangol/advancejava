package unit_one.jpanel;

import javax.swing.*;import javax.swing.border.TitledBorder;import java.awt.*;

public class JPanelBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel with Border");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel with a titled border
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder("Input Panel"));
        panel.setLayout(new GridLayout(2, 2));

        // Add components to the panel
        panel.add(new JLabel("Name:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Age:"));
        panel.add(new JTextField());

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }}