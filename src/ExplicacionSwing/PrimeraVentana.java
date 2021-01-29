package ExplicacionSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeraVentana {
  public static void main(String[] args) {
    JFrame ventana=new JFrame("Mi programa");
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    JPanel panel=new JPanel(new GridLayout(0,2,10,10));
    ventana.add(panel);
    JLabel etiqueta=new JLabel("Escribe tu nombre");
    JLabel etiqueta2=new JLabel("Escribe tu Apellido");
    JTextField entrada=new JTextField(20);
    JTextField entrada2=new JTextField(20);
    JButton boton=new JButton("Saludo");
    boton.addActionListener(e -> JOptionPane.showMessageDialog(null,"HOLA "+entrada.getText()+" "+entrada2.getText()));
    panel.add(etiqueta);
    panel.add(entrada);
    panel.add(etiqueta2);
    panel.add(entrada2);
    panel.add(boton);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
  }
}
