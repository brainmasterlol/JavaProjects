package MVC.Controller.Inventory;

import MVC.Model.Data.Brands;
import MVC.Model.DeviceInventory.DeviceInventory;
import MVC.Model.Inventory.Entitys.Device;
import MVC.Model.Inventory.Factory.DeviceFactory;
import MVC.View.Inventory.Menu;
import MVC.View.Inventory.RegistrationInventory;
import MVC.View.Inventory.ShowInventory;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class InventoryController implements ActionListener {
    private ShowInventory showInventory;
    private DeviceInventory deviceInventory;

    public InventoryController(ShowInventory showInventory, DeviceInventory deviceInventory) {
        this.showInventory = showInventory;
        this.deviceInventory = deviceInventory;
    }

    public void updateInventoryTable(){
        // Obtener el modelo de tabla desde la interfaz gráfica (ShowInventory)
        DefaultTableModel tableModel = showInventory.getInventoryTableModel();
        // Limpiar la tabla
        tableModel.setRowCount(0);
        // Obtener la lista de dispositivos del inventario
        List<Device> allDevices = deviceInventory.returnInventoryAsList();

        // Obtener la lista de dispositivos del inventario
        for (Device device : allDevices) {

            // Crear una fila con la información del dispositivo
            Object[] rowData = {
                    device.getDeviceBrand(),
                    device.getDeviceModel(),
                    device.getDeviceStorage(),
                    device.getDeviceRegistrationDate()
            };
            // Agregar la fila al modelo de la tabla
            showInventory.getInventoryTableModel().addRow(rowData);
//            showInventory.getInventoryTable().repaint();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    /*private void addDeviceToTable(Device device) {
        // Formateador de fecha y hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        */
    }
}