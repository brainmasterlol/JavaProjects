package MVC.Controller.Inventory;

import MVC.Model.Data.Brands;
import MVC.Model.DeviceInventory.DeviceInventory;
import MVC.Model.Inventory.Entitys.Device;
import MVC.Model.Inventory.Factory.DeviceFactory;
import MVC.View.Inventory.Menu;
import MVC.View.Inventory.RegistrationInventory;
import MVC.View.Inventory.ShowInventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryController implements ActionListener {
    private Menu menu;
    private RegistrationInventory registrationInventory;
    private ShowInventory showInventory;
    private Device device;
    private DeviceFactory deviceFactory;
    private DeviceInventory deviceInventory;
    private Brands deviceBrands;

    public InventoryController(Menu menu, RegistrationInventory registrationInventory, ShowInventory showInventory, Device device, DeviceFactory deviceFactory, DeviceInventory deviceInventory, Brands deviceBrands) {
        this.menu = menu;
        this.registrationInventory = registrationInventory;
        this.showInventory = showInventory;
        this.device = device;
        this.deviceFactory = deviceFactory;
        this.deviceInventory = deviceInventory;
        this.deviceBrands = deviceBrands;
    }

    public void initialize(){
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.menu.getShowInventoryBtn()){
            showInventory.getInventoryFrame().setVisible(true);

            /*// Agregar dispositivos al modelo de tabla (actualizar la tabla)
            for (Device device : inventory.returnInventoryAsList()) {
                inventoryView.addDeviceToTable(device);
            }
            inventoryFrame.pack();
            inventoryFrame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla*/


        }
    }
}
