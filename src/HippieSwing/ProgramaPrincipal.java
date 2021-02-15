package HippieSwing;

import javax.swing.*;

import java.awt.*;
import java.util.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProgramaPrincipal {
  static PanelBotones panelBotones;
  static PanelPeace[] panelPeace=new PanelPeace[5];
  static JLabel label=new JLabel("");
  List<String> pulsados=new ArrayList<>();
  public static void main(String[] args) {
    ProgramaPrincipal programaPrincipal=new ProgramaPrincipal();
    panelBotones=new PanelBotones(programaPrincipal);
    panelPeace=new PanelPeace[5];
    for (int i = 0; i < panelPeace.length; i++) {
      panelPeace[i]=new PanelPeace();
    }
    JPanel simbolos=new JPanel();

    JFrame ventana=new JFrame();
    ventana.setLayout(new GridLayout(0,1));
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.add(panelBotones);
    for (PanelPeace p:panelPeace
         ) {
    simbolos.add(p);

    }
    ventana.add(simbolos);
    ventana.setLocationRelativeTo(null);
    ventana.pack();
    ventana.setVisible(true);
  }

  public void hanPulsadoColor(PanelBotones.Colores color) {
    if(color.getSitio().equals(PanelBotones.Sitio.FONDO)) {
      for (PanelPeace p:panelPeace
           ) {
        p.setFondoLetra(color.getColor());
      }
    } else {
      for (PanelPeace p:panelPeace
      ) {
        p.setColorLetra(color.getColor());
      }}
  }
}
