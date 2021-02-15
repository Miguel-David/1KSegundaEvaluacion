package Ejercicio5CuentaPalabras;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Conlista implements Informador {
  List<String> palabras=new ArrayList<>();
  @Override
  public void anyadeInfo(String s) {
   palabras.add(s);
  }

  @Override
  public String obtenInfo() {
    return String.join(", ",palabras);
  }

  @Override
  public void quitarInfo(String s) {
    String elegida=(String) JOptionPane.showInputDialog(null,
            "¿Cuál quieres borrar?",
            "Borrar",
            JOptionPane.WARNING_MESSAGE,
            null,
            palabras.toArray(),palabras.toArray()[0]);
    palabras.remove(elegida);
  }
}
