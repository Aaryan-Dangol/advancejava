package unit_one.color_fonts.font;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class FontExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color
        this.setBackground(Color.LIGHT_GRAY);
        
        // Create custom fonts
        Font plainFont = new Font("Serif", Font.PLAIN, 20);
        Font boldFont = new Font("SansSerif", Font.BOLD, 24);
        Font italicFont = new Font("Monospaced", Font.ITALIC, 18);
        Font boldItalicFont = new Font("Dialog", Font.BOLD | Font.ITALIC, 22);
        
        // Draw text with different fonts
        g.setFont(plainFont);
        g.setColor(Color.BLACK);
        g.drawString("Plain Text (Serif, 20)", 20, 50);
        
        g.setFont(boldFont);
        g.setColor(Color.BLUE);
        g.drawString("Bold Text (SansSerif, 24)", 20, 100);
        
        g.setFont(italicFont);
        g.setColor(Color.RED);
        g.drawString("Italic Text (Monospaced, 18)", 20, 150);
        
        g.setFont(boldItalicFont);
        g.setColor(Color.GREEN);
        g.drawString("Bold & Italic Text (Dialog, 22)", 20, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FontExample());
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}