package MVC.View.Inventory;

import javax.swing.*;
import java.awt.*;

public class RegistrationInventory {
    private JPanel registerDevicePanel;
    private JComboBox brandCmb;
    private JComboBox modelCmb;
    private JComboBox storageCmb;
    private JComboBox dayCmb;
    private JComboBox monthCmb;
    private JComboBox yearCmb;
    private JButton RegisterBtn;
    private JButton showInventoryBtn;
    private JFrame registrationFrame;

    public RegistrationInventory() {
        this.registrationFrame = new JFrame("Register Inventory");
        this.registrationFrame.setLayout(new BorderLayout());
        this.registrationFrame.add(registerDevicePanel, BorderLayout.CENTER);
        this.registrationFrame.pack();
        this.registrationFrame.setLocationRelativeTo(null);
    }


    public JPanel getRegisterDevicePanel() {
        return registerDevicePanel;
    }

    public void setRegisterDevicePanel(JPanel registerDevicePanel) {
        this.registerDevicePanel = registerDevicePanel;
    }

    public JComboBox getBrandCmb() {
        return brandCmb;
    }

    public void setBrandCmb(JComboBox brandCmb) {
        this.brandCmb = brandCmb;
    }

    public JComboBox getModelCmb() {
        return modelCmb;
    }

    public void setModelCmb(JComboBox modelCmb) {
        this.modelCmb = modelCmb;
    }

    public JComboBox getStorageCmb() {
        return storageCmb;
    }

    public void setStorageCmb(JComboBox storageCmb) {
        this.storageCmb = storageCmb;
    }

    public JComboBox getDayCmb() {
        return dayCmb;
    }

    public void setDayCmb(JComboBox dayCmb) {
        this.dayCmb = dayCmb;
    }

    public JComboBox getMonthCmb() {
        return monthCmb;
    }

    public void setMonthCmb(JComboBox monthCmb) {
        this.monthCmb = monthCmb;
    }

    public JComboBox getYearCmb() {
        return yearCmb;
    }

    public void setYearCmb(JComboBox yearCmb) {
        this.yearCmb = yearCmb;
    }

    public JButton getRegisterBtn() {
        return RegisterBtn;
    }

    public void setRegisterBtn(JButton registerBtn) {
        RegisterBtn = registerBtn;
    }

    public JButton getShowInventoryBtn() {
        return showInventoryBtn;
    }

    public void setShowInventoryBtn(JButton showInventoryBtn) {
        this.showInventoryBtn = showInventoryBtn;
    }

    public JFrame getRegistrationFrame() {
        return registrationFrame;
    }

    public void setRegistrationFrame(JFrame registrationFrame) {
        this.registrationFrame = registrationFrame;
    }
}
