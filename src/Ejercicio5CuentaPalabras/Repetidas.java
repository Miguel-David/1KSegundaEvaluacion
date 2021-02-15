package Ejercicio5CuentaPalabras;

import java.util.ArrayList;
import java.util.List;

public class Repetidas implements Informador {
  List<String> listaPalabras=new ArrayList<>();
  @Override
  public void anyadeInfo(String s) {
    listaPalabras.add(s);
  }

  @Override
  public String obtenInfo() {
    return String.join(",",listaPalabras);
  }

  @Override
  public void quitarInfo(String s) {
    listaPalabras.remove(s);
  }
}

