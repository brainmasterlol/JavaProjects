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

public class MenuController implements ActionListener {
    private Menu menu;
    private RegistrationInventory registrationInventory;
    private RegisterDeviceController registerDeviceController;
    private ShowInventory showInventory;
    private Device device;
    private DeviceFactory deviceFactory;
    private DeviceInventory deviceInventory;
    private Brands deviceBrands;

    public MenuController(Menu menu, RegistrationInventory registrationInventory, RegisterDeviceController registerDeviceController, ShowInventory showInventory) {
        this.menu = menu;
        this.menu.getShowInventoryBtn().addActionListener(this);
        this.menu.getRegisterDeviceBtn().addActionListener(this);
        this.registrationInventory = registrationInventory;
        this.registrationInventory.getBrandCmb().addActionListener(e -> this.registerDeviceController.handleBrandSelection());
        this.registerDeviceController = registerDeviceController;
        this.showInventory = showInventory;
    }

    public void displayMenu() {
        this.menu.getMenuFrame().setVisible(true);
    }

    private void displayRegistrationForm() {
        this.registerDeviceController.clearComboBox();
        this.registerDeviceController.updateRegistrationFormComboBox();
        this.registrationInventory.getRegistrationFrame().setVisible(true);
    }

    private void displayInventory() {
        // Lógica para mostrar el inventario
        // Por ejemplo:
        // new InventoryController().showInventory();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.menu.getShowInventoryBtn()){
            displayInventory();
            /*// Agregar dispositivos al modelo de tabla (actualizar la tabla)
            for (Device device : inventory.returnInventoryAsList()) {
                inventoryView.addDeviceToTable(device);
             */
        } else if (e.getSource() == this.menu.getRegisterDeviceBtn()){
            displayRegistrationForm();
        }
    }

}
