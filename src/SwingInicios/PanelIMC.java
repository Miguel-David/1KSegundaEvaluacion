package SwingInicios;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelIMC {
  JPanel panel;
  JTextField pesoTexto;
  JTextField alturaTexto;
  PanelIMC(){
    panel=new JPanel(new GridLayout(0,3,10,10));
    panel.add(new JLabel("Introduzca su peso"));
    pesoTexto =new JTextField();
    pesoTexto.setHorizontalAlignment(SwingConstants.RIGHT);
    panel.add(pesoTexto);
    panel.add(new JLabel("kg."));
    panel.add(new JLabel("Introduzca su altura"));
    alturaTexto =new JTextField();
    alturaTexto.setHorizontalAlignment(SwingConstants.RIGHT);
    panel.add(alturaTexto);
    panel.add(new JLabel("cm."));
    panel.setBorder(new EmptyBorder(10,10,10,10));
  }

  public JPanel getPanel() {
    return panel;
  }

}
