package unit_one.progrssbar;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndeterminateProgressBarExample extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;
    private JButton stopButton;

    public IndeterminateProgressBarExample() {
        setTitle("Indeterminate JProgressBar Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create an indeterminate progress bar
        progressBar = new JProgressBar();
        progressBar.setIndeterminate(true); // Set to indeterminate mode
        progressBar.setStringPainted(true); // Show progress text
        progressBar.setString("Processing...");
        add(progressBar);

        // Create start and stop buttons
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        add(startButton);
        add(stopButton);

        // Add action listeners
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setIndeterminate(true);
                progressBar.setString("Processing...");
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setIndeterminate(false);
                progressBar.setString("Stopped");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new IndeterminateProgressBarExample().setVisible(true);
        });
    }
}