package EjemplosColecciones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PalabrasEspejo {
  public static void main(String[] args) throws IOException {
    List<String> lineas= Files.readAllLines(Paths.get("texto.txt"));
    lineas.remove(0); //Explicacion problema
    for (int i = 0; i < lineas.size(); i++) {
      String palabraPrimera= lineas.get(i);
      for (int j = i+1; j < lineas.size(); j++) {
        if(reverse(palabraPrimera).equals(lineas.get(j))){
          System.out.println(palabraPrimera + " - " + lineas.get(j));
        }
      }
    }
    System.out.println("-------------");
    Map<String,String> vistas=new HashMap<>();
    for (String s:lineas) {
      if(vistas.containsKey(s)) {
        System.out.println(s + " - " + reverse(s));
      } else {
        vistas.put(reverse(s),s);
      }
    }
    System.out.println("-------------");
    vistas.entrySet().forEach(e->System.out.println(e.getKey()+" - "+e.getValue()));
  }
  static String reverse(String palabra){
    String salida="";
    for (char c:palabra.toCharArray()
         ) {
      salida=c+salida;
    }
    return salida;
  }
}
