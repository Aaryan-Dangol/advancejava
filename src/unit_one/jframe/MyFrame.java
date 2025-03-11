package unit_one.jframe;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("BCA 6th Advanced Java Frame");
        setSize(400, 300); // Set window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on window close
        setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {

        new MyFrame(); // Create an instance of MyFrame
    }
}