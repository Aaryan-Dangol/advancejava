package unit_one.jframe;

import javax.swing.*;
import java.awt.*;

public class CustomizedFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Customized JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
// Set layout manager
        frame.setLayout(new FlowLayout());
// Add components
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Welcome to Customized JFrame!");
        frame.add(label);
        frame.add(button);
// Set background color
        frame.getContentPane().setBackground(Color.RED);
//        frame.setVisible(true);
    }
}