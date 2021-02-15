package Ejercicio5CuentaPalabras;

import javax.swing.*;

public class PanelSalida extends  JPanel{
  JTextArea texto;
  PanelSalida(ProgramaPrincipal programaPrincipal){
    texto=new JTextArea(5,20);
    texto.setLineWrap(true);
    add(texto);
  }
  public void anyadeInfo(String aMostrar){
    texto.setText(aMostrar);
  }
}
