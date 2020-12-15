package Tema6.herencia;

import java.util.ArrayList;

public class PruebaEquals {
  public static void main(String[] args) {
    Persona[] contactos={
            new Persona("Ana","001"),
            new Persona("Bea","001"),
            new Persona("Clara","001"),
            new Persona("Delia","001"),
            new Persona("Elena","001"),
            new Persona("Flori","001"),
    };
    Persona aBuscar=new Persona("Clara","004");
    for (int i = 0; i < contactos.length; i++) {
      if(contactos[i].equals( aBuscar)){
        System.out.println(i);
      }
    }
    ArrayList<Integer> lista=new ArrayList<>();
    lista.indexOf(32);
  }
}
