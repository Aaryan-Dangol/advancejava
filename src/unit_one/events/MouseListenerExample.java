package unit_one.events;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample() {
        setTitle("MouseListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Click anywhere!");
        label.setBounds(130, 100, 200, 30);
        add(label);

        addMouseListener(this); // Register MouseListener to the frame
        setVisible(true);
    }

    public static void main(String[] args) {

        new MouseListenerExample();
    }

    // Override MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {

        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered Window");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited Window");
    }
}