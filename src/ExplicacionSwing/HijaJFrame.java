package ExplicacionSwing;

import javax.swing.*;

public class HijaJFrame extends JFrame {
  HijaJFrame(){
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(300,500);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  public static void main(String[] args) {
    HijaJFrame nueva=new HijaJFrame();
  }
}
