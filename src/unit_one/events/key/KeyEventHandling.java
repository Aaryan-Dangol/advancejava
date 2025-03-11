package unit_one.events.key;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Handling");
        frame.setBounds(500, 150, 400, 400);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        textField.setBounds(60, 80, 150, 25);
// Register KeyListener to the text field
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == 'm') {
                    JOptionPane.showMessageDialog(null, "The 'a' key was typed!");
                }
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
              // JOptionPane.showMessageDialog(null, String.format("%s was pressed", keyEvent.getKeyChar()));
                //JOptionPane.showMessageDialog(null, String.format("%s was pressed %s", textField.getText(),"students"));
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                //JOptionPane.showMessageDialog(null, String.format("%s was relsease", textField.getText()));

            }
        });
        frame.add(textField);
        frame.setVisible(true);
    }
}