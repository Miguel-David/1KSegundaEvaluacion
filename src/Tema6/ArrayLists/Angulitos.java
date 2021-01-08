package Tema6.ArrayLists;

import java.util.ArrayList;

public class Angulitos {
  public static void main(String[] args) {
    ArrayList<String> versos=new ArrayList<>();
    versos.add("¿Qué es poesía?");
    versos.add("Me preguntas clavando tu");
    versos.add("pupila en mi pupila azul");
    System.out.println(versos);
    RelojPulsera casio=new RelojPulsera();
    //versos.add(casio); Los angulitos no me dejan añadir nada que no sea String
    //System.out.println(versos);
  }
}
class RelojPulsera{
  int metros;
}
