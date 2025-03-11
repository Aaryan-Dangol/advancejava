package unit_one.jTable;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class BasicJTableExample extends JFrame {
    public BasicJTableExample() {
        setTitle("Basic JTable Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Table data
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
                {1, "John Doe", 25},
                {2, "Jane Smith", 30},
                {3, "Sam Brown", 22}
        };

        // Create a JTable
        JTable table = new JTable(data, columnNames);
        // Add scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BasicJTableExample().setVisible(true);
        });
    }
}