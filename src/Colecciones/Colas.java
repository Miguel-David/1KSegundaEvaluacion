package Colecciones;

import java.util.*;

public class Colas {
  public static void main(String[] args) {
    //Hay dos tipos de cola:
    //Cola LIFO (Pila) (Último en entrar, primero en salir)
    //Cola FIFO (cola) (Primero en entrar, primero en salir)
    Deque<Character> cola;
    cola=new LinkedList<>();
    Scanner sc=new Scanner(System.in);
    String expresion=sc.nextLine();
    List<Character> poner= Arrays.asList('(','[','{');
    for (char c:expresion.toCharArray()) {
      if(poner.contains(c)){
        cola.push(c);
      } else {
        char sacado=cola.pop();
        if(sacado=='(' && c!=')'){
          System.out.println("MAL");
        }
        if(sacado=='[' && c!=']'){
          System.out.println("MAL");
        }
        if(sacado=='{' && c!='}'){
          System.out.println("MAL");
        }
      }
    }
    System.out.println(cola.isEmpty() ? "Correcta" : "Incorrecta");
    Deque<String> colaSupermercado=new LinkedList<>();
    colaSupermercado.add("Ana");
    colaSupermercado.add("Bea");
    colaSupermercado.add("Clara");
    colaSupermercado.add("Delia");
    while(!colaSupermercado.isEmpty()){
      System.out.println(colaSupermercado.pollFirst());
    }

  }
}
