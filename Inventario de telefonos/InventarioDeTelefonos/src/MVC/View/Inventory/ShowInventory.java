package MVC.View.Inventory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ShowInventory {
    private JPanel inventoryPanel;
    private JTable inventoryTable;
    private DefaultTableModel inventoryTableModel;
    private JFrame inventoryFrame;

    public ShowInventory() {
        this.inventoryFrame = new JFrame("Inventory");
        this.inventoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.inventoryFrame.setLayout(new BorderLayout());

        String[] columnNames = {"Brand", "Model", "Storage(GB)", "Date Time"};
        this.inventoryTableModel = new DefaultTableModel(columnNames, 0);
        this.inventoryTable = new JTable(inventoryTableModel);
        JScrollPane scrollPane = new JScrollPane(inventoryTable);
        this.inventoryPanel = new JPanel(new BorderLayout());
        this.inventoryPanel.add(scrollPane, BorderLayout.CENTER);

        this.inventoryFrame.add(inventoryPanel, BorderLayout.CENTER);
        this.inventoryFrame.pack();
        this.inventoryFrame.setLocationRelativeTo(null);
    }

    public JPanel getInventoryPanel() {
        return inventoryPanel;
    }

    public void setInventoryPanel(JPanel inventoryPanel) {
        this.inventoryPanel = inventoryPanel;
    }

    public JTable getInventoryTable() {
        return inventoryTable;
    }

    public void setInventoryTable(JTable inventoryTable) {
        this.inventoryTable = inventoryTable;
    }

    public DefaultTableModel getInventoryTableModel() {
        return inventoryTableModel;
    }

    public void setInventoryTableModel(DefaultTableModel inventoryTableModel) {
        this.inventoryTableModel = inventoryTableModel;
    }

    public JFrame getInventoryFrame() {
        return inventoryFrame;
    }

    public void setInventoryFrame(JFrame inventoryFrame) {
        this.inventoryFrame = inventoryFrame;
    }
}
