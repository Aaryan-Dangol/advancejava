package unit_one.color_fonts;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ColorAndFontExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color
        this.setBackground(Color.WHITE);
        
        // Create a custom font
        Font customFont = new Font("Arial", Font.BOLD | Font.ITALIC, 30);
        g.setFont(customFont);
        
        // Draw text with gradient color
        GradientPaint gradient = new GradientPaint(
                0,
                0,
                Color.BLACK,
                getWidth(),
                getHeight(),
                Color.YELLOW);
        ((Graphics2D) g).setPaint(gradient);
        g.drawString("Gradient Text", 50, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color and Font Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ColorAndFontExample());
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}