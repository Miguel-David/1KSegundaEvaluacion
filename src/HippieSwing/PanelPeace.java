package HippieSwing;

import javax.swing.*;
import java.awt.*;

public class PanelPeace extends JPanel {
  private final JLabel simbolo=new JLabel("☮");
  PanelPeace(){
    add(simbolo);
    simbolo.setOpaque(true);
    simbolo.setHorizontalAlignment(SwingConstants.CENTER);
    Font fuente=new Font(Font.SANS_SERIF, Font.BOLD,  120);
    simbolo.setFont(fuente);
  }

  public void setColorLetra(Color c){
    simbolo.setForeground(c);
  }
  public void setFondoLetra(Color c){
    simbolo.setBackground(c);
  }

  public static void main(String[] args) {
    JFrame ventana=new JFrame();
    PanelPeace panelPeace=new PanelPeace();
    panelPeace.setColorLetra(Color.BLUE);
    panelPeace.setFondoLetra(Color.magenta);


    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.add(panelPeace);
    ventana.setLocationRelativeTo(null);
    ventana.pack();
    ventana.setVisible(true);
  }
}
