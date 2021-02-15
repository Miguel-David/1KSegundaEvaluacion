package GridBagConstraintsExplicacion;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ej3{
  public static void main(String[] args){

    Map<Integer,String> mapa=new TreeMap<>();
    mapa.put(3,"tres");   //Da igual el orden de inserción
    mapa.put(1,"uno");
    mapa.put(5,"cinco");
    mapa.put(4,"cuatro");


    for(Map.Entry<Integer,String> entrada:
            mapa.entrySet()){
      System.out.println(entrada.getKey()+" - "+entrada.getValue());
    }
    System.out.println("----------------");
    Iterator<Map.Entry<Integer,String>> iterator=mapa.entrySet().iterator();
    while(iterator.hasNext()){
      Map.Entry<Integer,String> entradaActual=iterator.next();
      System.out.println(entradaActual.getKey() + " - " + entradaActual.getValue());
    }
    System.out.println("----------------");
    for (Integer i:mapa.keySet()) {
      System.out.println(i + " - " + mapa.get(i));
    }
    System.out.println("----------------");
    Iterator<Integer> numeros=mapa.keySet().iterator();
    while(numeros.hasNext()){
      Integer actual= numeros.next();
      System.out.println(actual + " - " + mapa.get(actual));
    }
    System.out.println("----------------");
    mapa.keySet().forEach(e->{System.out.println(e+" - "+mapa.get(e));});
  }
}
