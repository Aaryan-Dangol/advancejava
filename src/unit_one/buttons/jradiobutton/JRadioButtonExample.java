package unit_one.buttons.jradiobutton;

import javax.swing.*;

public class JRadioButtonExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a ButtonGroup
        ButtonGroup group = new ButtonGroup();
// Create JRadioButtons
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");
// Add radio buttons to the ButtonGroup
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
// Add radio buttons to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
// Display the frame
        frame.setVisible(true);
    }
}