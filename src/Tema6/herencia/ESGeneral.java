package Tema6.herencia;

import javax.swing.*;

public class ESGeneral {
  public static int leeEnteroSeguro(String mensaje) {
    boolean numeroCorrecto = false;
    int numero = 0;
    while (!numeroCorrecto) {
      String entrada = null;
      while (entrada == null) {
        entrada = JOptionPane.showInputDialog(mensaje);
      }
      try {
        numero = Integer.parseInt(entrada);
        numeroCorrecto = true;
      } catch (Exception e) { //Exception e absolutamente prohibida. Se sabrá el porqué el 22 de febrero
        JOptionPane.showMessageDialog(null, "ERROR" + entrada + "No me vale");
      }
    }
    return numero;
  }
}
