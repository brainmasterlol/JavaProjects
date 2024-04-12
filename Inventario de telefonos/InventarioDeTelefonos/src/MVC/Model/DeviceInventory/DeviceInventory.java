package MVC.Model.DeviceInventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import MVC.Model.Inventory.Entitys.Device;

public class DeviceInventory {
    private Map<String, List<Device>> inventory;
    private List<Device> inventoryList;

    public DeviceInventory(){
        this.inventory = new HashMap<>();
        this.inventoryList = new ArrayList<>();
    }

    public void addDeviceToInventory(Device device){
        String devBranch = device.getDeviceBrand();
        if (!inventory.containsKey(devBranch)) {
            inventory.put(devBranch, new ArrayList<>());
        }
        inventory.get(devBranch).add(device);
    }

    public List<Device> returnInventoryAsList() {
        List<Device> allDevices = new ArrayList<>();
        for (List<Device> devices : inventory.values()) {
            allDevices.addAll(devices);
        }
        return allDevices;
    }

    public void showInventory() {
        System.out.println("Devices Inventory:");
        for (Map.Entry<String, List<Device>> entry : inventory.entrySet()) {
            String devBranch = entry.getKey();
            List<Device> devices = entry.getValue();
            System.out.println("Tipo: " + devBranch);
            for (Device device : devices) {
                device.showInformation();
            }
            System.out.println();
        }
    }
}

