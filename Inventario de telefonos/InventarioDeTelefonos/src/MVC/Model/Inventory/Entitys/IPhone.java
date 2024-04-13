package MVC.Model.Inventory.Entitys;

import java.time.LocalDateTime;

public class IPhone extends Device{
    public IPhone(String deviceBrand, String deviceModel, String deviceStorage, LocalDateTime deviceRegistrationDate) {
        super(deviceBrand, deviceModel, deviceStorage, deviceRegistrationDate);
    }

    @Override
    public void showInformation() {
        super.showInformation();
    }
}
