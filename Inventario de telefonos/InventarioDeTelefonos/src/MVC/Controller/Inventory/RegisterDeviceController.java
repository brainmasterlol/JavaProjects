package MVC.Controller.Inventory;

import MVC.Model.Data.Brands;
import MVC.Model.Data.DateTime.Day;
import MVC.Model.Data.DateTime.Month;
import MVC.Model.Data.DateTime.Year;
import MVC.Model.Data.IPhone.IPhoneModels;
import MVC.Model.Data.Samsung.SamsungModels;
import MVC.Model.Data.Storage;
import MVC.View.Inventory.RegistrationInventory;

import java.util.Arrays;
import java.util.List;

public class RegisterDeviceController {
    private RegistrationInventory registrationInventory;

    public RegisterDeviceController(RegistrationInventory registrationInventory) {
        this.registrationInventory = registrationInventory;
        this.registrationInventory.getRegisterBtn().addActionListener(e -> registerDevice());
        this.registrationInventory.getShowInventoryBtn().addActionListener(e -> showInventory());
    }

    private void registerDevice() {
        // Lógica para mostrar el inventario
        // Por ejemplo:
        // new InventoryController().showInventory();
    }

    private void showInventory() {
        // Lógica para mostrar el inventario
        // Por ejemplo:
        // new InventoryController().showInventory();
    }

    public void handleBrandSelection() {
        String selectedBrand = (String) this.registrationInventory.getBrandCmb().getSelectedItem();
        updateModelComboBox(selectedBrand);
    }

    // Método para actualizar el combo box de modelos según la marca seleccionada
    private void updateModelComboBox(String brand) {
        this.registrationInventory.getModelCmb().removeAllItems(); // Limpiar los elementos actuales del combo box de modelos

        // Agregar modelos según la marca seleccionada
        if (brand != null) {
            if ("iPhone".equals(brand)){
                IPhoneModels[] iPhoneModels = IPhoneModels.values();
                for (IPhoneModels models : iPhoneModels) {
                    this.registrationInventory.getModelCmb().addItem(models.getDisplayName());
                }
            } else if ("Samsung".equals(brand)) {
                SamsungModels[] samsungModels = SamsungModels.values();
                for (SamsungModels models : samsungModels) {
                    this.registrationInventory.getModelCmb().addItem(models.getDisplayName());
                }
            }
        }
    }

    public void clearComboBox(){
        this.registrationInventory.getBrandCmb().removeAllItems();
        this.registrationInventory.getModelCmb().removeAllItems();
        this.registrationInventory.getStorageCmb().removeAllItems();
        this.registrationInventory.getDayCmb().removeAllItems();
        this.registrationInventory.getMonthCmb().removeAllItems();
        this.registrationInventory.getYearCmb().removeAllItems();
    }

    public void updateRegistrationFormComboBox(){
        Arrays.stream(Brands.values())
                .map(Brands::getDisplayName)
                .forEach(brand -> this.registrationInventory.getBrandCmb().addItem(brand));
        Arrays.stream(Storage.values())
                .map(Storage::getDisplayName)
                .forEach(storage -> this.registrationInventory.getStorageCmb().addItem(storage));
        Arrays.stream(Day.values())
                .map(Day::getDisplayName)
                .forEach(day-> this.registrationInventory.getDayCmb().addItem(day));
        Arrays.stream(Month.values())
                .map(Month::getDisplayName)
                .forEach(month -> this.registrationInventory.getMonthCmb().addItem(month));
        Arrays.stream(Year.values())
                .map(Year::getDisplayName)
                .forEach(year -> this.registrationInventory.getYearCmb().addItem(year));
    }
}
