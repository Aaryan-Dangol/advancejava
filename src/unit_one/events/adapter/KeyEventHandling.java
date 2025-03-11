package unit_one.events.adapter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Handling");
        frame.setBounds(500, 150, 400, 400);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.green);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        textField.setBounds(60, 80, 150, 25);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                  // Handle key pressed event
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null, "The Enter key was pressed !");
                }
            }
        });



        frame.add(textField);
        frame.setVisible(true);
    }
}