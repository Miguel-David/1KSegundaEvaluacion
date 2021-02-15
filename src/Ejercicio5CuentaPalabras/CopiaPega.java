package Ejercicio5CuentaPalabras;

import javax.swing.*;

public class CopiaPega implements Informador {
  String s;
  @Override
  public void anyadeInfo(String s) {
    this.s=s;
  }

  @Override
  public String obtenInfo() {
    return s;
  }

  @Override
  public void quitarInfo(String s) {
    JOptionPane.showMessageDialog(null,"No puedo Borrar");
  }
}
