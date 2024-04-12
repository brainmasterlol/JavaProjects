package MVC.Model.Inventory.Entitys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Device {
    private String deviceBrand;
    private String deviceModel;
    private Integer deviceStorage;
    private String deviceRegistrationDate;

    public Device(String deviceBrand, String deviceModel, Integer deviceStorage) {
        this.deviceBrand = deviceBrand;
        this.deviceModel = deviceModel;
        this.deviceStorage = deviceStorage;
        this.deviceRegistrationDate = formatRegistrationDate(LocalDateTime.now());
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

    public Integer getDeviceStorage() {
        return deviceStorage;
    }

    public void setDeviceStorage(Integer deviceStorage) {
        this.deviceStorage = deviceStorage;
    }

    public String getDeviceRegistrationDate() {
        return deviceRegistrationDate;
    }

    public void setDeviceRegistrationDate(String deviceRegistrationDate) {
        this.deviceRegistrationDate = deviceRegistrationDate;
    }

    private String formatRegistrationDate(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }

    public void showInformation(){
        System.out.println(getDeviceBrand() + " " + getDeviceModel() + ", " + getDeviceStorage() + "GB" + ", " + getDeviceRegistrationDate());
    }
}
