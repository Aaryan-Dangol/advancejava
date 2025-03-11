package unit_one.events.adapter;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends JFrame {
    JLabel label;

    public MouseAdapterExample() {
        setTitle("MouseAdapter Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Click or hover over this window");
        label.setBounds(100, 100, 250, 30);
        add(label);

        // Use MouseAdapter to handle specific events
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the Window");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the Window");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}