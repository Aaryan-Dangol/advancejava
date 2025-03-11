package unit_one.buttons.jbutton;

import javax.swing.*;

public class JButtonIconExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JButton with Icon Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Load an icon
       // ImageIcon icon = new ImageIcon("path/to/your/icon.png");
        ImageIcon icon = new ImageIcon("/home/bishranta/Videos/RCL /techspireFirstSem/AdvancedJavaDemos/src/Screenshot from 2024-07-07 23-27-33.png");
// Create a JButton with an icon
        JButton button = new JButton(icon);
// Add the button to the frame
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}