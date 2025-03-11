package unit_one.jTable;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;


public class CustomJTableExample extends JFrame {
    public CustomJTableExample() {
        setTitle("Custom JTable Example");
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

        // Custom cell renderer
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 2) { // Highlight Age column
                    c.setBackground(Color.YELLOW);
                } else if(column == 1) {
                    c.setBackground(Color.BLUE);
                }else c.setBackground(Color.GREEN);
                return c;
            }
        };

        // Apply renderer to all columns
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CustomJTableExample().setVisible(true);
        });
    }
}