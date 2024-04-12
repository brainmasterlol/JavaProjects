package View;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame {
    public HomeFrame(){
        frameInit();
        setUndecorated(true);
        setContentPane(new HomeForm().getBackgroundPanel());
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }
}
