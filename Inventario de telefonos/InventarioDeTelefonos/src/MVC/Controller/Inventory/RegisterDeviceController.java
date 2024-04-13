package MVC.Controller.Inventory;

import MVC.Model.Data.Brands;
import MVC.Model.Data.DateTime.Day;
import MVC.Model.Data.DateTime.Month;
import MVC.Model.Data.DateTime.Year;
import MVC.Model.Data.IPhone.IPhoneModels;
import MVC.Model.Data.Samsung.SamsungModels;
import MVC.Model.Data.Storage;
import MVC.Model.DeviceInventory.DeviceInventory;
import MVC.Model.Inventory.Entitys.Device;
import MVC.Model.Inventory.Factory.DeviceFactory;
import MVC.View.Inventory.RegistrationInventory;
import MVC.View.Inventory.ShowInventory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class RegisterDeviceController {
    private RegistrationInventory registrationInventory;
    private DeviceFactory deviceFactory;
    private ShowInventory showInventory;
    private InventoryController inventoryController;
    private DeviceInventory deviceInventory;

    public RegisterDeviceController(RegistrationInventory registrationInventory, DeviceFactory deviceFactory, ShowInventory showInventory, InventoryController inventoryController, DeviceInventory deviceInventory) {
        this.registrationInventory = registrationInventory;
        this.registrationInventory.getRegisterBtn().addActionListener(e -> registerDevice());
        this.registrationInventory.getShowInventoryBtn().addActionListener(e -> showInventory());
        this.deviceFactory = deviceFactory;
        this.showInventory = showInventory;
        this.inventoryController = inventoryController;
        this.deviceInventory = deviceInventory;
    }

    private void registerDevice() {
        try{
            getDataFromRegistrationForm();
            inventoryController.updateInventoryTable();
            System.out.println("Device registered correctly!");
        } catch (Exception e){
            System.err.println("An error ocurred");
        }
    }

    private void getDataFromRegistrationForm(){
        String brandValue = (String) this.registrationInventory.getBrandCmb().getSelectedItem();
        String modelValue = (String) this.registrationInventory.getModelCmb().getSelectedItem();
        String storageValue = (String) this.registrationInventory.getStorageCmb().getSelectedItem();

        String dayValue = (String) this.registrationInventory.getDayCmb().getSelectedItem();
        String monthValue = (String) this.registrationInventory.getMonthCmb().getSelectedItem();
        String yearValue = (String) this.registrationInventory.getYearCmb().getSelectedItem();
        LocalDateTime dateTimeValue = convertToDateTime(dayValue, monthValue, yearValue);

        createDeviceController(brandValue, modelValue, storageValue, dateTimeValue);
    }

    private LocalDateTime convertToDateTime(String dayValue, String monthValue, String yearValue){
        int dayToInt = Integer.parseInt(dayValue);
        int monthToInt = Integer.parseInt(monthValue);
        int yearToInt = Integer.parseInt(yearValue);

        LocalDateTime dateTime = LocalDateTime.of(yearToInt, monthToInt, dayToInt, LocalDateTime.now().getHour(), LocalDateTime.now().getMinute());
        return dateTime;
    }

    private void createDeviceController(String brandValue, String modelValue, String storageValue, LocalDateTime dateTimeValue){
        Device device = deviceFactory.createDevice(brandValue, modelValue, storageValue, dateTimeValue);
        System.out.println("Dispositivo registrado: " + device.getDeviceBrand());
        deviceInventory.addDeviceToInventory(device);
    }

    /*private String formatRegistrationDate(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }*/

    private void showInventory() {
        this.showInventory.getInventoryFrame().setVisible(true);
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
