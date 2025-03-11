package unit_one.color_fonts;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class ColorExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color for the panel
        this.setBackground(Color.WHITE);
        
        // Draw a rectangle with a custom color
        g.setColor(new Color(255, 0, 0)); // Red
        g.fillRect(50, 50, 100, 100);
        
        // Draw text with a custom color
        g.setColor(new Color(0, 0, 255)); // Blue
        g.drawString("Hello, World!", 50, 200);
        
        // Draw a shape with RGB color
        g.setColor(new Color(0, 128, 128)); // Teal
        g.fillOval(200, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ColorExample());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}