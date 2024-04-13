package MVC.Model.Inventory.Entitys;

import java.time.LocalDateTime;

public class Samsung extends Device{
    public Samsung(String deviceBrand, String deviceModel, String deviceStorage, LocalDateTime deviceRegistrationDate) {
        super(deviceBrand, deviceModel, deviceStorage, deviceRegistrationDate);
    }

    @Override
    public void showInformation() {
        super.showInformation();
    }
}
