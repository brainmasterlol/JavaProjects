package MVC.View.Inventory;

import MVC.Model.Inventory.Entitys.Device;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JPanel menuPanel;
    private JButton registerDeviceBtn;
    private JButton showInventoryBtn;
    private JFrame menuFrame;

    public Menu() {
        this.menuFrame = new JFrame("Menu");
        this.menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.menuFrame.setLayout(new BorderLayout());
        this.menuFrame.add(this.menuPanel, BorderLayout.CENTER);
        this.menuFrame.pack();
        this.menuFrame.setLocationRelativeTo(null);
    }

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public void setMenuPanel(JPanel menuPanel) {
        this.menuPanel = menuPanel;
    }

    public JButton getRegisterDeviceBtn() {
        return registerDeviceBtn;
    }

    public void setRegisterDeviceBtn(JButton registerDeviceBtn) {
        this.registerDeviceBtn = registerDeviceBtn;
    }

    public JButton getShowInventoryBtn() {
        return showInventoryBtn;
    }

    public void setShowInventoryBtn(JButton showInventoryBtn) {
        this.showInventoryBtn = showInventoryBtn;
    }

    public JFrame getMenuFrame() {
        return menuFrame;
    }

    public void setMenuFrame(JFrame menuFrame) {
        this.menuFrame = menuFrame;
    }
}
