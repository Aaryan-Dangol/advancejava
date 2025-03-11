package unit_one.events;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample extends JFrame implements MouseMotionListener {
    JLabel label;

    public MouseMotionListenerExample() {
        setTitle("MouseMotionListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Move the mouse!");
        label.setBounds(130, 100, 200, 30);
        add(label);

        addMouseMotionListener(this); // Register MouseMotionListener to the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }

    // Override MouseMotionListener methods
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
        System.out.println(" WHY DID YOU MOVE ME?????????????");
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
       System.out.println(" HELP !!! Someone is dragging me!!!!!!! ");
    }
}