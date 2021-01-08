package Tema6.ArrayLists;

import Tema6.EjemplosEnum.TransformadoresCadenas;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoRRHH {
  public static void main(String[] args) {
    List<Trabajador> plantilla=new ArrayList<>();
    plantilla.add(new Trabajador("Ana",2000,Categoria.BECARIO));
    plantilla.add(new Trabajador("Bea",4000,Categoria.A_PUNTO_JUBILACION));
    plantilla.add(new Trabajador("Clara",4000,Categoria.BECARIO));
    plantilla.add(new Trabajador("Delia",2000,Categoria.VETERANO));
    plantilla.add(new Trabajador("Elena",3000,Categoria.VETERANO));
    plantilla.add(new Trabajador("Filomena",3000,Categoria.BECARIO));
    //Mostrar todos
    plantilla.forEach(System.out::println);

    //Mostrar Becarios
    System.out.println("-------------- BECARIOS SOLO ------------");
    for (int i = 0; i < plantilla.size(); i++) {
      Trabajador t=plantilla.get(i);
      if(t.getCategoria()==Categoria.BECARIO) {
        System.out.println(t);
      }
    }
    System.out.println("-------------- BECARIOS SOLO ------------");
    for (Trabajador t:plantilla) {
      if(t.getCategoria()==Categoria.BECARIO){
        System.out.println(t);
      }
    }
    System.out.println("-------------- BECARIOS SOLO ------------");
    plantilla.forEach(trabajador -> {
      if(trabajador.getCategoria()==Categoria.BECARIO){
        System.out.println(trabajador);
      }
    });
    System.out.println("-------------- BECARIOS SOLO ------------");
    List<Trabajador> becarios=new ArrayList<>();
    for (Trabajador t:plantilla) {
      if(t.getCategoria()==Categoria.BECARIO){
        becarios.add(t);
      }
    }
    becarios.forEach(System.out::println);
    System.out.println("Subo de categoria a los becarios");
    becarios.forEach(becario -> becario.setCategoria(Categoria.RECIEN_LLEGADO));
    plantilla.forEach(System.out::println);
    //Eliminamos a los veteranos
    System.out.println("Veteranos fuera");
    //A lo bruto
    /* Esto no funciona
    List<Integer> indicesVeteranos=new ArrayList<>();
    for (int i = 0; i < plantilla.size(); i++) {
      if(plantilla.get(i).getCategoria()==Categoria.VETERANO){
        indicesVeteranos.add(i);
      }
    }
    for (int i:indicesVeteranos) {
      plantilla.remove(i);
    }
    plantilla.forEach(System.out::println);

     */
    List<Trabajador> aDespedir=new ArrayList<>();
    for (Trabajador t:plantilla) {
      if(t.getCategoria()==Categoria.VETERANO){
        aDespedir.add(t);
      }
    }
    /*
    for (Trabajador t:aDespedir) {
      plantilla.remove(t);
    }

     */
    /*
    plantilla.removeAll(aDespedir);

     */
    plantilla.removeIf(trabajador -> trabajador.getCategoria()==Categoria.VETERANO);
    plantilla.forEach(System.out::println);
    System.out.println("Bajo el sueldo 20 céntimos");
    plantilla.forEach(e -> e.bajaSueldo(20));
    plantilla.forEach(System.out::println);


  }
}
