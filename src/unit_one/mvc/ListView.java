package unit_one.mvc;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ListView {
    private final JFrame frame;
    private final JList<String> list;
    private final DefaultListModel<String> listModel;
    private final JButton addButton;

    public ListView() {
        frame = new JFrame("MVC Example 1");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        addButton = new JButton("Add Item");

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(list), BorderLayout.CENTER);
        frame.add(addButton, BorderLayout.SOUTH);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void updateList(List<String> items) {
        listModel.clear();
        for (String item : items) {
            listModel.addElement(item);
        }
    }
}