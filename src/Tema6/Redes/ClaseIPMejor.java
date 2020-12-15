package Tema6.Redes;

import javax.swing.*;

public class ClaseIPMejor {
  public static void main(String[] args) {
    String entrada= JOptionPane.showInputDialog("Introduce la IP");
    DireccionIP ip=new DireccionIP(entrada);
    JOptionPane.showMessageDialog(null,"La IP es de clase "+ip.clase());
  }
}
