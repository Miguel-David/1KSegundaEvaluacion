package SwingInicios;

import javax.swing.*;
import java.awt.*;

public class IMC {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Calculador índice de masa corporal");
    ventana.setSize(400, 300);
    JPanel panelIMC = new JPanel();
    panelIMC.setLayout(new FlowLayout());
    JTextField escribirAltura = new JTextField(20);
    JTextField escribirPeso = new JTextField(20);
    JLabel altura = new JLabel("Escribe tu ALTURA actual: ");
    JLabel peso = new JLabel("Escribe tu PESO actual: ");
    JButton boton = new JButton("Cálculo IMC");
    boton.addActionListener(e -> {
      JOptionPane.showMessageDialog(null, escribirAltura.getText());
    });
    panelIMC.add(altura);
    panelIMC.add(escribirAltura);
    panelIMC.add(peso);
    panelIMC.add(escribirPeso);
    panelIMC.add(boton);
    ventana.add(panelIMC);
    ventana.setVisible(true);
  }
}


