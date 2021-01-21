package Colecciones;

import java.util.*;

public class ComprobadorParentesis {
  public static void main(String[] args) {
    Deque<Character> cola;
    cola = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    String expresion = sc.nextLine();
    Map<Character,Character> correspondencia=new HashMap<>();
    correspondencia.put(')','(');
    correspondencia.put(']','[');
    correspondencia.put('}','{');
    correspondencia.put('>','<');


    for (char c : expresion.toCharArray()) {
      if (correspondencia.containsValue(c)) {
        cola.push(c);
      } else {
        char sacado = cola.pop();
        if(correspondencia.get(c)!=sacado){
          System.out.println("MAL");
        }
      }
    }
    if(cola.isEmpty()) System.out.println("CORRECTA");
  }
}
