package unit_one.graphics;

import javax.swing.*;
import java.awt.*;

public class BasicGraphicsExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(10, 10, 190, 190); // Draw a line
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 50); // Draw a rectangle outline
        g.setColor(Color.GREEN);
        g.fillRect(150, 50, 50, 50); // Fill a rectangle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BasicGraphicsExample());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
