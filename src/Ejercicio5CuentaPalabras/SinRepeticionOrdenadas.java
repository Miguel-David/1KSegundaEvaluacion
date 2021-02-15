package Ejercicio5CuentaPalabras;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SinRepeticionOrdenadas implements Informador {
  Set<String> listaPalabras=new TreeSet<>();
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
