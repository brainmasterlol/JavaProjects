package Main;

import MVC.Controller.Inventory.InventoryController;
import MVC.Controller.Inventory.MenuController;
import MVC.Controller.Inventory.RegisterDeviceController;
import MVC.Model.DeviceInventory.DeviceInventory;
import MVC.Model.Inventory.Factory.DeviceFactory;
import MVC.View.Inventory.Menu;
import MVC.View.Inventory.RegistrationInventory;
import MVC.View.Inventory.ShowInventory;

public class Main {
    public static void main(String[] args) {
        Menu menuView = new Menu();
        RegistrationInventory registratitionView = new RegistrationInventory();
        ShowInventory showInventory = new ShowInventory();
        DeviceFactory deviceFactory = new DeviceFactory();
        DeviceInventory deviceInventory = new DeviceInventory();
        InventoryController inventoryController = new InventoryController(showInventory, deviceInventory);
        RegisterDeviceController registerDeviceController = new RegisterDeviceController(registratitionView, deviceFactory, showInventory, inventoryController, deviceInventory);
        MenuController menuController = new MenuController(menuView, registratitionView, registerDeviceController, showInventory);

        menuController.displayMenu();
    }
}
