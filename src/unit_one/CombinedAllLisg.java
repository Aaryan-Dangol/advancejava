package unit_one;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombinedAllLisg {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("Combined All Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JLabel commentLabel = new JLabel("Comments:");
        JTextArea commentArea = new JTextArea(5, 20);
        commentArea.setLineWrap(true);
        commentArea.setWrapStyleWord(true);
        JLabel spinnerLabel = new JLabel("Select a number (1-10):");
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        JLabel comboBoxLabel = new JLabel("Select an option:");
        String[] comboBoxItems = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(comboBoxItems);
        JLabel listLabel = new JLabel("Select one or more items:");
        String[] listItems = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(listItems);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder message = new StringBuilder();
                message.append("Name: ").append(nameField.getText()).append("\n");
                message.append("Password: ").append(new String(passwordField.getPassword())).append("\n");
                message.append("Comments: ").append(commentArea.getText()).append("\n");
                message.append("Selected number: ").append(spinner.getValue()).append("\n");
                message.append("Selected option: ").append(comboBox.getSelectedItem()).append("\n");
                message.append("Selected items:\n");
                for (String item : list.getSelectedValuesList()) {
                    message.append(item).append("\n");
                }
                JOptionPane.showMessageDialog(frame, message.toString());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(commentLabel);
        frame.add(new JScrollPane(commentArea));
        frame.add(spinnerLabel);
        frame.add(spinner);
        frame.add(comboBoxLabel);
        frame.add(comboBox);
        frame.add(listLabel);
        frame.add(new JScrollPane(list));
        frame.add(submitButton);
// Display the frame
        frame.setVisible(true);
    }
}