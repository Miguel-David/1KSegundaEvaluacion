package Tema6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CuentaQenQuijote {
  public static void main(String[] args) throws IOException {
    List<String> lineas= Files.readAllLines(Paths.get("quijote.txt"));
    System.out.println(lineas.size());
    List<String> palabras=new ArrayList<>();
    for (String linea:lineas) {
      String[] palabrasEnLinea=linea.split(" ");
      for (String p:palabrasEnLinea) {
        palabras.add(p);
      }
    }
    System.out.println(palabras.size());
    List<String> unicas=new ArrayList<>();
    for (String p:palabras) {
      if(p.toUpperCase().startsWith("Q") && !unicas.contains(p.toUpperCase())){
        unicas.add(p.toUpperCase());

      }
    }
    unicas.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    unicas.forEach(System.out::println);


  }
}
