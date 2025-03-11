package unit_one.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class AdvancedGraphicsExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Define common stroke
        g2d.setStroke(new BasicStroke(3)); // Thicker lines
        
        // Define starting positions and spacing
        int padding = 20; // Margin from edges
        int spacing = 30; // Space between shapes
        
        // Draw a line (diagonal across top-left area)
        g2d.setColor(Color.BLUE);
        g2d.draw(new Line2D.Double(padding, padding, 200, 100));

        // Draw a rounded rectangle (centered properly)
        int rectX = padding + 10;
        int rectY = 120;
        int rectWidth = 150;
        int rectHeight = 60;
        g2d.setColor(Color.RED);
        g2d.draw(new RoundRectangle2D.Double(rectX, rectY, rectWidth, rectHeight, 15, 15));

        // Draw an ellipse (circle) below the rectangle
        int ellipseX = rectX + rectWidth / 4;
        int ellipseY = rectY + rectHeight + spacing;
        int ellipseSize = 60;
        g2d.setColor(Color.GREEN);
        g2d.fill(new Ellipse2D.Double(ellipseX, ellipseY, ellipseSize, ellipseSize));

        // Draw an arc on the bottom-left side
        int arcX = padding;
        int arcY = ellipseY + ellipseSize + spacing;
        int arcWidth = 100;
        int arcHeight = 80;
        g2d.setColor(Color.ORANGE);
        g2d.draw(new Arc2D.Double(arcX, arcY, arcWidth, arcHeight, 45, 270, Arc2D.OPEN));

        // Draw another diagonal line to balance design
        g2d.setColor(Color.MAGENTA);
        g2d.draw(new Line2D.Double(ellipseX + ellipseSize + 30, padding, 250, arcY + arcHeight));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Improved Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new AdvancedGraphicsExample());
        frame.setSize(400, 400); // Increased size for better spacing
        frame.setVisible(true);
    }
}
