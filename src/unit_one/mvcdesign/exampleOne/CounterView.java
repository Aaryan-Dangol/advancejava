package unit_one.mvcdesign.exampleOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private final JLabel counterLabel = new JLabel("0");
    private final JButton incrementButton = new JButton("Increment");
    private final JButton resetButton = new JButton("Reset");
    private final JButton decrementButton = new JButton("Decrement");
    private final JButton incrementByTwo = new JButton("Add 2");

    public CounterView() {
        // Set up the UI
        setTitle("MVC Counter Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        counterLabel.setFont(new Font("Arial", Font.ITALIC, 24));
        add(counterLabel);
        add(incrementButton);
        add(resetButton);
        add(decrementButton);
        add(incrementByTwo);
    }

    public void setCounterValue(int value) {
        counterLabel.setText(String.valueOf(value));
    }

    public void addIncrementListener(ActionListener listener) {
        incrementButton.addActionListener(listener);
    }

    public void addResetListener(ActionListener listener) {
        resetButton.addActionListener(listener);
    }

    public void addDecrementListener(ActionListener listener) {
        decrementButton.addActionListener(listener);
    }

    public void incrementByTwoListener(ActionListener listener) {
        incrementByTwo.addActionListener(listener);
    }
}