package Tema6.DialogosUsuario;

import javax.swing.*;

public class LecturaSeguraEntero {
  //Hasta el 22 de febrero se copia/pega este método
  public static int leeEnteroSeguro() {
    boolean numeroCorrecto = false;
    int numero = 0;
    while (!numeroCorrecto) {
      String entrada = null;
      while (entrada == null) {
        entrada = JOptionPane.showInputDialog("Edad (No le des a Cancelar)");
      }
      try {
        numero = Integer.parseInt(entrada);
        numeroCorrecto = true;
      } catch (Exception e) { //Exception e absolutamente prohibida. Se sabrá el porqué el 22 de febrero
        JOptionPane.showMessageDialog(null, "¿De qué vas?. " + entrada + "No me vale");
      }
    }
    return numero;
  }

  public static void main(String[] args) {
      int numero=leeEnteroSeguro();
      System.out.println(numero);

  }
}
