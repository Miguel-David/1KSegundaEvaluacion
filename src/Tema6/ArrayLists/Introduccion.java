package Tema6.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Introduccion {
  public static void main(String[] args) {

    ArrayList cadenas=new ArrayList();
    System.out.println(cadenas.size());
    cadenas.add("Ana");
    cadenas.add("Bea");
    cadenas.add("Clara");
    System.out.println(cadenas);
    cadenas.add(1,"Anastasia");
    System.out.println(cadenas);
    System.out.println(cadenas.indexOf("Bea"));
    System.out.println(cadenas.indexOf("Felipe"));
    System.out.println(cadenas.contains("Clara"));
    System.out.println(cadenas.get(0));
    cadenas.remove("Bea");
    System.out.println(cadenas);
    cadenas.add(2,"PEPE");
    System.out.println(cadenas);
    cadenas.set(2,"JUAN");
    System.out.println(cadenas);
    Scanner sc=new Scanner(System.in);
    System.out.println("Dime un nombre");
    String nombre=sc.nextLine();
    if(cadenas.indexOf(nombre)==-1){
      System.out.println("El nombre no está");
    } else {
      System.out.println("El nombre sí está");
    }

  }
}
