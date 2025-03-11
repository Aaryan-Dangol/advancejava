package unit_one.layout.grid;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example - Dynamic Columns");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(0, 3)); // Dynamic rows, 3 columns

        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }
}