package Colecciones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FrecuenciaPalabrasQuijote {
  public static void main(String[] args) throws IOException {
    List<String> lineas= Files.readAllLines(Paths.get("quijote.txt"));
    Map<String,Integer> frecuencias= new HashMap<>();
    for (String s:lineas) {
      for (String pal:s.split(" ")) {
        if(sanear(pal.toUpperCase())!=null) {
          String nueva=sanear(pal.toUpperCase());
          if(!frecuencias.containsKey(nueva)){
            frecuencias.put(nueva,1);
          } else {
            int anteriores=frecuencias.get(nueva);
            frecuencias.put(nueva,anteriores+1);
          }
        }
      }
    }
    for (Map.Entry<String,Integer> entrada:frecuencias.entrySet()
         ) {
      System.out.println(entrada.getKey() + " - " + entrada.getValue());
    }
    System.out.println("QUIJOTE aparece " + frecuencias.get("QUIJOTE"));
  }

  private static String sanear(String cadena) {
    int indice=0;
    if("".equals(cadena)){
      return null;
    }
    char[] caracteres=cadena.toCharArray();
    while(!Character.isLetter(caracteres[indice])){
      indice++;
      if(indice== caracteres.length){
        return null;
      }
    }
    String salida="";
    while(Character.isLetter(caracteres[indice])){
      salida+=caracteres[indice];
      indice++;
      if(indice== caracteres.length) break;
    }
    return salida;
  }
}
