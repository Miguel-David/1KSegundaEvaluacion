package RepasoColecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos {
  public static void main(String[] args) {
    Set<String> palabras=new HashSet<>();
    //Primera propiedad: No tiene duplicados
    palabras.add("Azul");
    palabras.add("Azul");
    palabras.add("Azul");
    palabras.add("Azul");
    palabras.add("Azul");
    palabras.add("Azul");
    palabras.add("Azul");
    System.out.println(palabras.size());
    //Segunda propiedad: No tienen orden
    //palabras.get(4) --> No existe

    palabras.add("Turquesa");
    palabras.add("Verde");
    palabras.add("Rojo");
    palabras.add("Lila");
    palabras.add("Aguamarina");
    palabras.add("Amarillo");
    //No sirve esta estructura
    /*
    for (int i = 0; i < palabras.size(); i++) {
      palabras.
    }
     */
    for (String s:palabras
         ) {
      System.out.println(s);
    }
    System.out.println("--------------------------------------------");
    //Quiero borrar los que empiezan por A
    /*for (String s:palabras
    ) {
      if(s.startsWith("A")){
        palabras.remove(s);
      }
    }
     */
    //Imprimir con un Iterator
    Iterator<String> iterador=palabras.iterator();
    //En ese punto puedo decir iterador.next();
    while(iterador.hasNext()){
      String palabraActual= iterador.next();
      System.out.println(palabraActual);
    }
    //Para borrar
    Iterator<String> iteradorBorrar=palabras.iterator();
    while(iteradorBorrar.hasNext()){
      String palabra= iteradorBorrar.next();
      if(palabra.startsWith("A")){
        iteradorBorrar.remove();
      }
    }
    System.out.println("------------------------------------");
    for (String s:palabras
    ) {
      System.out.println(s);
    }
    //Otras opciones más novedosas
    System.out.println("-------------------------------");
    palabras.removeIf(s->s.startsWith("T"));
    palabras.forEach(System.out::println);
    //Propiedades importantes del HashSet

  }
}
