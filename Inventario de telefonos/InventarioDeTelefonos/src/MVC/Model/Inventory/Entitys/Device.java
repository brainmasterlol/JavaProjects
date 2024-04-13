package MVC.Model.Inventory.Entitys;

import java.time.LocalDateTime;

public abstract class Device {
    private String deviceBrand;
    private String deviceModel;
    private String deviceStorage;
    private LocalDateTime deviceRegistrationDate;

    public Device(String deviceBrand, String deviceModel, String deviceStorage, LocalDateTime deviceRegistrationDate) {
        this.deviceBrand = deviceBrand;
        this.deviceModel = deviceModel;
        this.deviceStorage = deviceStorage;
        this.deviceRegistrationDate = deviceRegistrationDate;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceStorage() {
        return deviceStorage;
    }

    public void setDeviceStorage(String deviceStorage) {
        this.deviceStorage = deviceStorage;
    }

    public LocalDateTime getDeviceRegistrationDate() {
        return deviceRegistrationDate;
    }

    public void setDeviceRegistrationDate(LocalDateTime deviceRegistrationDate) {
        this.deviceRegistrationDate = deviceRegistrationDate;
    }

    public void showInformation(){
        System.out.println(getDeviceBrand() + " " + getDeviceModel() + ", " + getDeviceStorage() + "GB" + ", " + getDeviceRegistrationDate());
    }
}
