package EjemplosColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RepasoColecciones {
  public static void main(String[] args) {

    List<String> palabras=new ArrayList<>();
    palabras.addAll( Arrays.asList(
            "papa",
            "frewfe",
            "sdccdscsd",
            "tretr",
            "scdcsd",
            "papa"
    ));
    //Añadir por objeto --> al final
    palabras.add("pepepe");
    //Añadir por indice y objeto --> Hace sitio
    palabras.add(1,"www");
    //update por indice
    palabras.set(0,"aaaaa");
    //Borrar por indice -->No deja hueco
    palabras.remove(5);
    //Borrar por objeto -->No deja hueco devuelve si borra
    palabras.remove("33333");
    //Obtener el objeto de la posición
    System.out.println(palabras.get(4));
    //Tamaño de la lista
    System.out.println(palabras.size());
    //Contiene
    System.out.println(palabras.contains("33333"));
    //Borrarla
    //palabras.clear();
    //Buscar en la lista  -->devuelve -1 si no está
    System.out.println(palabras.indexOf("44444444444"));
    //Recorridos
    //Necesitamos el índice para algo
    for (int i = 0; i < palabras.size(); i++) {
      System.out.println((i + 1) + " - " + palabras.get(i));
    }
    System.out.println("----------------------");
    //No necesitamos el índice y no modificamos la lista
    for (String s:palabras) {
      System.out.print(s + " ");
    }
    System.out.println();
    System.out.println("----------------------");
    //Método foreach
    palabras.forEach(e->System.out.println(e.length()+" - "+e));
    //Iterador cuando queremos ir avanzando poco a poco o modificando la lista
    Iterator<String> iterador= palabras.iterator();
    while (iterador.hasNext()){
      String palabra= iterador.next();
      if(palabra.startsWith("p")) iterador.remove();
    }
    palabras.forEach(System.out::println);



  }
}
