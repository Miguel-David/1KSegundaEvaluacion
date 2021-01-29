package SwingInicios;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelCalcular {
  JPanel panel;
  JButton boton;
  JLabel resultado;
  JLabel grado;
  PanelIMC panelIMC;

  public PanelCalcular(BMI bmi) {
    panel=new JPanel(new GridLayout(0,1));
    boton=new JButton("Calcular");
    panel.add(boton);
    resultado=new JLabel("Introduzca los datos");
    resultado.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(resultado);
    grado=new JLabel("");
    grado.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(grado);
    panel.setBorder(new EmptyBorder(10,10,10,10));
    this.panelIMC=panelIMC;
    boton.addActionListener(e->bmi.calcular());
  }

  public void error(String mensaje) {
    this.resultado.setForeground(Color.RED);
    this.resultado.setText(mensaje);
    this.grado.setText("");
  }


  public JPanel getPanel() {
    return panel;
  }

  public void show(double imc, String grade) {
    this.resultado.setForeground(Color.BLACK);
    this.resultado.setText(String.format("Tu IMC es %.2f",imc));
    this.grado.setText(grade);
  }
}