package Tema6.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ListOArrayList {
  public static void main(String[] args) {
    ArrayList<String> nombres=new ArrayList<>();
    List<String> apellidos = new ArrayList<>();
    //La Lista es más general y podremos modificarla posteriormente.


    //Wrappers como tipos primitivos mejorados a objetos
    List<Integer> numeros=new ArrayList<>();
    int a=5;
    Integer b=5;  //Lo mismo que new Integer(5);
    b=null;
    //a=null;
    numeros.add(6);
    numeros.add(7);
    numeros.add(8);
    numeros.add(9);
    numeros.add(21);
    System.out.println(numeros);
    double c=4.5;
    Double d=c;  //En realidad hace un new Double(c);
    c=0.0;
    System.out.println(d);
    Boolean esCierto;
    Character car='r';






  }
}
