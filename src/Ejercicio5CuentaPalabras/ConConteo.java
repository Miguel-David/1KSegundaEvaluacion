package Ejercicio5CuentaPalabras;

import java.util.Map;
import java.util.TreeMap;

public class ConConteo implements Informador {
  Map<String,Integer> palabras=new TreeMap<>();
  @Override
  public void anyadeInfo(String s) {
    if(!palabras.containsKey(s)){
      palabras.put(s,1);
    } else {
      int vecesVistaAntes=palabras.get(s);
      palabras.put(s,vecesVistaAntes+1);
    }
  }

  @Override
  public String obtenInfo() {
    String salida="";
    for (String s:palabras.keySet()) {
      salida+=s+" - "+palabras.get(s)+"\n";
    }
    return salida;
  }

  @Override
  public void quitarInfo(String s) {
    palabras.remove(s);
  }
}
