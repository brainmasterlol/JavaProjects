package MVC.View.Inventory;

import MVC.Model.DeviceInventory.DeviceInventory;
import MVC.Model.Inventory.Entitys.Device;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ShowInventory {
    private JPanel inventoryPanel;
    private JTable inventoryTable;
    private DefaultTableModel inventoryTableModel;
    private JFrame inventoryFrame;

    public ShowInventory() {
        this.inventoryFrame = new JFrame("Inventory");
        inventoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventoryFrame.setLayout(new BorderLayout());
        inventoryFrame.add(inventoryPanel, BorderLayout.CENTER);

        // Configurar el modelo de tabla con las columnas deseadas
        String[] columnNames = {"Brand", "Model", "Storage(GB)", "Date Time"};
        inventoryTableModel = new DefaultTableModel(columnNames, 0);
        // Crear la tabla y asociar el modelo de tabla
        inventoryTable = new JTable(inventoryTableModel);
        // Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(inventoryTable);
        // Configurar el diseño del panel de inventario
        inventoryPanel = new JPanel(new BorderLayout());
        inventoryPanel.add(scrollPane, BorderLayout.CENTER);


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

    public void addDeviceToTable(Device device) {
        // Formateador de fecha y hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Agregar el dispositivo al modelo de tabla
        Object[] rowData = {
                device.getDeviceBrand(),
                device.getDeviceModel(),
                device.getDeviceStorage() + "GB",
                device.getDeviceRegistrationDate()
        };
        inventoryTableModel.addRow(rowData); // Agregar fila al modelo de tabla
    }
}
