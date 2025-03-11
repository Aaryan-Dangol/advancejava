package unit_one.borderlayouts.grid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Display panel at the top
        JTextArea display = new JTextArea(3, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.ITALIC, 18));
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(display);
        mainPanel.add(scrollPane, BorderLayout.NORTH);

        // Button panel with GridLayout
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Variables to store operation and numbers
        final double[] num1 = {0};
        final String[] operator = {""};

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.setFont(new Font("XYZ", Font.PLAIN, 16));
            btn.setPreferredSize(new Dimension(50, 50));

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = btn.getText();

                    if ("0123456789.".contains(text)) {
                        display.append(text);
                    } else if ("/*-+".contains(text)) {
                        num1[0] = Double.parseDouble(display.getText().trim());
                        operator[0] = text;
                        display.append(" " + text + " ");
                    } else if ("=".equals(text)) {
                        try {
                            String[] parts = display.getText().split(" ");
                            double num2 = Double.parseDouble(parts[2]);
                            double result = 0;

                            switch (operator[0]) {
                                case "+":
                                    result = num1[0] + num2;
                                    break;
                                case "-":
                                    result = num1[0] - num2;
                                    break;
                                case "*":
                                    result = num1[0] * num2;
                                    break;
                                case "/":
                                    if (num2 != 0) {
                                        result = num1[0] / num2;
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                                        display.setText("");
                                        return;
                                    }
                                    break;
                            }

                            JOptionPane.showMessageDialog(frame, "Result: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
                            display.setText("");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(frame, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                            display.setText("");
                        }
                    }
                }
            });

            buttonPanel.add(btn);
        }

        // Add a back button to clear the screen
        JButton backButton = new JButton("C");
        backButton.setFont(new Font("Arial", Font.PLAIN, 16));
        backButton.setPreferredSize(new Dimension(50, 50));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        buttonPanel.add(backButton);

        // Add the button panel to the main panel
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Display the frame
        frame.setVisible(true);
    }
}
