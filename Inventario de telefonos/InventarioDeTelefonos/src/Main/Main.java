package Main;

import MVC.Controller.Inventory.MenuController;
import MVC.Controller.Inventory.RegisterDeviceController;
import MVC.Model.Data.Brands;
import MVC.Model.DeviceInventory.DeviceInventory;
import MVC.Model.Inventory.Entitys.IPhone;
import MVC.Model.Inventory.Entitys.Samsung;
import MVC.View.Inventory.Menu;
import MVC.View.Inventory.RegistrationInventory;
import MVC.View.Inventory.ShowInventory;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Menu menuView = new Menu();
        RegistrationInventory registratitionView = new RegistrationInventory();
        ShowInventory showInventory = new ShowInventory();
        RegisterDeviceController registerDeviceController = new RegisterDeviceController(registratitionView);
        MenuController menuController = new MenuController(menuView, registratitionView, registerDeviceController, showInventory);

        menuController.displayMenu();
    }
}
