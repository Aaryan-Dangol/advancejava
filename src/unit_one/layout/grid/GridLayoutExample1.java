package unit_one.layout.grid;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example - 3x2 Grid");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        frame.setVisible(true);
    }
}
