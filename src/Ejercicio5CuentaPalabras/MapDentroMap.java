package Ejercicio5CuentaPalabras;

import java.util.HashMap;
import java.util.Map;

public class MapDentroMap {
  public static void main(String[] args) {
    Map<String,Map<String,Integer>> mapaLioso=new HashMap<>();
    mapaLioso.put("Ejemplo",new HashMap<>());
    Map<String,Integer> valor=mapaLioso.get("Ejemplo");
    valor.put("Juan",34);

  }
}
