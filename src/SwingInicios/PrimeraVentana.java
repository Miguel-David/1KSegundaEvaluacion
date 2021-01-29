package SwingInicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeraVentana {
  private static JFrame ventana;
  public static void main(String[] args) {
    ventana = new JFrame("Mi primera Ventana");
    ventana.setSize(600, 800);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel=new JPanel();
    JLabel etiqueta=new JLabel("Mi etiqueta");
    JButton boton=new JButton("No me pulses!");
    boton.addActionListener(e -> JOptionPane.showMessageDialog(ventana,"QUE NO ME PULSES"));
    JTextField txtBox = new JTextField(20);
    JCheckBox chkBox = new JCheckBox("Márcame", true);
    ButtonGroup radioGroup = new ButtonGroup();
    JRadioButton rb1 = new JRadioButton("Alicante", true);
    JRadioButton rb2 = new JRadioButton("Valencia");
    JRadioButton rb3 = new JRadioButton("Castellón");
    radioGroup.add(rb1);
    radioGroup.add(rb2);
    radioGroup.add(rb3);
    panel.add(rb1);
    panel.add(rb2);
    panel.add(rb3);
    panel.add(chkBox);
    panel.add(txtBox);
    panel.add(boton);
    panel.add(etiqueta);
    ventana.add(panel);
    ventana.setVisible(true);
  }
}
