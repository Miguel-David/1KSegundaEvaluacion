package EjemplosColecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class PilasYColas {
  public static void main(String[] args) {
    //Las pilas y colas son listas en las que solo se accede por un extremo
    // (para insertar y para obtener elementos)
    //Las pilas se accede y se inserta siempre por la cola (tope de arriba) LIFO
    //En las colas se accede por el principio y se inserta al final FIFO
    Deque<String> pila=new ArrayDeque<String>();

    //Uso típico de pila (stack) es push y pop
    pila.push("Ana");
    pila.push("Bea");
    System.out.println(pila.pop());
    pila.clear();
    //Uso típico de cola es pollFirst y add
    pila.add("Ana");
    pila.add("Bea");
    pila.add("Clara");
    System.out.println(pila.pollFirst());
    System.out.println(pila.size());

  }
}
