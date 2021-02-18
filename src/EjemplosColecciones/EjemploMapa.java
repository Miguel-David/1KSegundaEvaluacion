package EjemplosColecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemploMapa {
  public static void main(String[] args) {
    //Son parejas clave-Valor
    //Claves no repetidas
    //Si es HashMap, el acceso es instantáneo
    Map<Character,String> nombreLetras=new HashMap<>();
    //Insertar
    nombreLetras.put('s',"ESE");
    nombreLetras.put('y',"Y GRIEGA");
    //Obtener -->Siempre por clave
    System.out.println(nombreLetras.get('r'));
    System.out.println(nombreLetras.get('y'));
    //Borrar siempre por clave
    nombreLetras.remove('s');
    //size, clear
    //Insertar en el mismo, reemplaza
    nombreLetras.put('€',"Perras");
    nombreLetras.put('€',"Euro");
    System.out.println(nombreLetras.get('€'));
    //Obtener todas las claves
    nombreLetras.keySet().forEach(System.out::println);
    nombreLetras.values().forEach(System.out::println);
    //Recorridos
    Iterator<Character> iterator=nombreLetras.keySet().iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    //Otro
    for (Map.Entry<Character,String> parejas: nombreLetras.entrySet()) {
      System.out.println("El nombre de la " + parejas.getKey() + " es " + parejas.getValue());
    }


  }
}
