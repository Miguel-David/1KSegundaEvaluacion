package Tema6.ArrayLists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
  public static void main(String[] args) {
    List<Contacto> listado=new ArrayList<>();
    Contacto ana=new Contacto("Ana","660606066");
    listado.add(ana);
    listado.add(new Contacto("Bea","604444999"));
    listado.add(new Contacto("Clara","704444999"));
    listado.add(new Contacto("Delia","804444999"));
    listado.add(new Contacto("Elena","904444999"));
    listado.add(new Contacto("Filomena","104444999"));
    System.out.println(listado);
    //Recorridos de la lista
    for (int i = 0; i < listado.size(); i++) {
      Contacto c=listado.get(i);
      System.out.println(c);
    }
    System.out.println("------------------------------");
    for (Contacto c:listado) {
      System.out.println(c);
    }
    System.out.println("------------------------------");
    listado.forEach(System.out::println);

    listado.add(2,new Contacto("Cecilia","104444999"));
    listado.forEach(System.out::println);
    String nombre= JOptionPane.showInputDialog("Dime un nombre");
    Contacto buscado=null;
    for (Contacto c:listado) {
      if(c.getNombre().equals(nombre)){
        buscado=c;
      }
    }
    if(buscado!=null){
      String salida="El número de "+buscado.getNombre()+" es: "+buscado.getNumeroTelefono();
      JOptionPane.showMessageDialog(null,salida);
      System.out.println("Se va a poner el número de " + buscado.getNombre() + " a ceros");
      buscado.setNumeroTelefono("00000000000");
    } else {
      JOptionPane.showMessageDialog(null,"El nombre no está en la agenda");
    }

    //En buscado tengo referencia al contacto
    listado.forEach(System.out::println);
  }
}
