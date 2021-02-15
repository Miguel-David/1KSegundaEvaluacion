package Ejercicio5CuentaPalabras;

import javax.swing.*;

public class AnyadirdorComas implements Informador{
  String s="";
  @Override
  public void anyadeInfo(String s) {
    if(this.s.length()==0){
      this.s=s;
    } else {
      this.s=this.s+", "+s;
    }
  }

  @Override
  public String obtenInfo() {
    return this.s;
  }

  @Override
  public void quitarInfo(String s) {
    JOptionPane.showMessageDialog(null,"No puedo Borrar");
  }
}

