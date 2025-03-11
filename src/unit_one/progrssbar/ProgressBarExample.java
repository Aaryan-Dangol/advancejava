package unit_one.progrssbar;


import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarExample extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;
    private Timer timer;
    private int progress = 0;

    public ProgressBarExample() {
        setTitle("JProgressBar Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a progress bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true); // Show progress text
        add(progressBar);

        // Create a start button
        startButton = new JButton("Start");
        add(startButton);

        // Add action listener to the button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startProgress();
            }
        });

        // Create a timer to simulate progress
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progress < 100) {
                    progress++;
                    progressBar.setValue(progress);
                } else {
                    timer.stop();
                    JOptionPane.showMessageDialog(ProgressBarExample.this, "Task Completed!");
                }
            }
        });
    }

    private void startProgress() {
        progress = 0;
        progressBar.setValue(progress);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ProgressBarExample().setVisible(true);
        });
    }
}