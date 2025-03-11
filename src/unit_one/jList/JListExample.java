package unit_one.jList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListExample {
    public static void main(String[] args) {
// Create a JFrame
        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a JList with items
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
// Create a button to display the selected items
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedItems = new StringBuilder("Selected items:\n");
                for (String item : list.getSelectedValuesList()) {
                    selectedItems.append(item).append("\n");
                }
                JOptionPane.showMessageDialog(frame, selectedItems.toString());
            }
        });
// Add components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Select one or more items:"));
        frame.add(new JScrollPane(list)); // Add scroll pane for the list
        frame.add(button);
// Display the frame
        frame.setVisible(true);
    }
}