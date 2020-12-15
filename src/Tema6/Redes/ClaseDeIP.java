package Tema6.Redes;

import javax.swing.*;

public class ClaseDeIP {
  public static void main(String[] args) {
    int byteMasGrande=leeEnteroSeguro("1º Byte");
    int byteSegundoMasGrande=leeEnteroSeguro("2º Byte");
    int byteTerceroMasGrande=leeEnteroSeguro("3º Byte");
    int byteMasChiquitin=leeEnteroSeguro("4º Byte");
    if(byteMasGrande>=0 && byteMasGrande<=127){
      JOptionPane.showMessageDialog(null,"Es de clase A");
    } else if(byteMasGrande>=128 && byteMasGrande<=191){
      JOptionPane.showMessageDialog(null,"Es de clase B");
    } else if(byteMasGrande>=192 && byteMasGrande<=223){
      JOptionPane.showMessageDialog(null,"Es de clase C");
    } else {
      JOptionPane.showMessageDialog(null,"No lo hemos dao");
    }
  }
  public static int leeEnteroSeguro(String pregunta) {
    boolean numeroCorrecto = false;
    int numero = 0;
    while (!numeroCorrecto) {
      String entrada = null;
      while (entrada == null) {
        entrada = JOptionPane.showInputDialog(pregunta);
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
}
