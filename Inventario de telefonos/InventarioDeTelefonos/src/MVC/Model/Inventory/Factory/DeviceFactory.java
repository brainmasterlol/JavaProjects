package MVC.Model.Inventory.Factory;

import MVC.Model.Inventory.Entitys.Device;
import MVC.Model.Inventory.Entitys.IPhone;
import MVC.Model.Inventory.Entitys.Samsung;

import java.time.LocalDate;

public class DeviceFactory {
    public static Device createDevice(String deviceBrand, String deviceModel, Integer deviceStorage, LocalDate deviceRegistrationDate){
        if (deviceBrand.equalsIgnoreCase("iPhone")) {
            return new IPhone(deviceBrand, deviceModel, deviceStorage);
        } else if (deviceBrand.equalsIgnoreCase("Samsung")) {
            return new Samsung(deviceBrand, deviceModel, deviceStorage);
        } else {
            //Cambiar argumento por uno personalizado
            throw new IllegalArgumentException("Tipo de teléfono no soportado: " + deviceBrand);
        }
    }
}
