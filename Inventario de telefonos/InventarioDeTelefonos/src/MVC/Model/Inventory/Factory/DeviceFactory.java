package MVC.Model.Inventory.Factory;

import MVC.Model.Inventory.Entitys.Device;
import MVC.Model.Inventory.Entitys.IPhone;
import MVC.Model.Inventory.Entitys.Samsung;
import java.time.LocalDateTime;

public class DeviceFactory {
    public static Device createDevice(String deviceBrand, String deviceModel, String deviceStorage, LocalDateTime deviceRegistrationDate){
        if (deviceBrand.equalsIgnoreCase("iPhone")) {
            Device device = new IPhone(deviceBrand, deviceModel, deviceStorage, deviceRegistrationDate);
            System.out.println("Nuevo iPhone creado: " + device);
            return device;
        } else if (deviceBrand.equalsIgnoreCase("Samsung")) {
            Device device = new Samsung(deviceBrand, deviceModel, deviceStorage, deviceRegistrationDate);
            System.out.println("Nuevo Samsung creado: " + device);
            return device;
        } else {
            //Cambiar argumento por uno personalizado
            throw new IllegalArgumentException("Tipo de teléfono no soportado: " + deviceBrand);
        }
    }
}
