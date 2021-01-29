package SwingInicios;

import javax.swing.*;
import java.awt.*;

public class BMI {
  JFrame ventana;
  PanelIMC panelIMC;
  PanelCalcular panelCalcular;

  BMI() {
    ventana=new JFrame("Calculadora de IMC");
    ventana.setLayout(new GridLayout(0,1));
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    panelIMC=new PanelIMC();
    ventana.add(panelIMC.getPanel());
    panelCalcular=new PanelCalcular(this);
    ventana.add(panelCalcular.getPanel());
    ventana.pack();
    ventana.setLocationRelativeTo(null);

  }
  public static void main(String[] args) {
    BMI bmi=new BMI();
    bmi.show();
  }

  private void show() {
    ventana.setVisible(true);
  }

  public void calcular() {
    String pesoTexto=panelIMC.pesoTexto.getText();
    if(!comprueba(pesoTexto)){
      panelCalcular.error("Peso no reconocido");
      return;
    }
    String alturaTexto=panelIMC.alturaTexto.getText();
    if(!comprueba(alturaTexto)){
      panelCalcular.error("Altura no reconocida");
      return;
    }
    Data data=new Data(Integer.parseInt(pesoTexto),Integer.parseInt(alturaTexto));
    panelCalcular.show(data.getIMC(),data.getGrade());
  }

  private boolean comprueba(String texto) {
    try {
      int n=Integer.parseInt(texto);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
