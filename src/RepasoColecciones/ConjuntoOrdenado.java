package RepasoColecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrdenado {
  public static void main(String[] args) {
    Set<String> colores=new TreeSet<>();
    colores.add("Azul");
    colores.add("Azul");
    colores.add("Azul");
    System.out.println(colores.size());
    colores.add("Turquesa");
    colores.add("Verde");
    colores.add("Rojo");
    colores.add("Lila");
    colores.add("Aguamarina");
    colores.add("Amarillo");
    colores.forEach(System.out::println);
    /*Set<String> palabrasLargas=new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(o1.length()!=o2.length()){
          return Integer.compare(o1.length(),o2.length());
        }
        return -o1.compareTo(o2);
      }
    });*/
    Set<String> palabrasLargas=new TreeSet<>((o1, o2) -> {
      if(o1.endsWith("ar") || o1.endsWith("er") || o1.endsWith("ir")){
        return -1;
      }
      if(o1.length()!=o2.length()){
        return Integer.compare(o1.length(),o2.length());
      }
      return -o1.compareTo(o2);
    });
    palabrasLargas.add("a");
    palabrasLargas.add("alcantarilla");
    palabrasLargas.add("alguacil");
    palabrasLargas.add("magia");
    palabrasLargas.add("zakansas");
    palabrasLargas.add("algo");
    palabrasLargas.forEach(System.out::println);
  }
}
