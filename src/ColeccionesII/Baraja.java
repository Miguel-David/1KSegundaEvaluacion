package ColeccionesII;

import java.util.*;

public class Baraja {
  List<Carta> cartas=new LinkedList<>();
  Baraja(){
    for (Palo p:Palo.values()) {
      for (Valor v:Valor.values()) {
        cartas.add(new Carta(p,v));
      }
    }
  }
  public Carta reparteCarta(){
    //Cojo la de arriba
    if(cartas.size()==0){
      for (Palo p:Palo.values()) {
        for (Valor v:Valor.values()) {
          cartas.add(new Carta(p,v));
        }
      }
      this.barajar();
    }
    Carta aDevolver=cartas.get(0);
    cartas.remove(0);
    return aDevolver;
  }
  public void barajar(){
    Collections.shuffle(cartas);
  }
  String imprimeBaraja(){
    String salida="";
    for (Carta c:cartas) {
      salida+=c.info()+"\n";
    }
    return salida;
  }

  public static void main(String[] args) {
    Baraja b=new Baraja();
    b.barajar();
    System.out.println(b.cartas.size());
    System.out.println(b.reparteCarta().info());
    System.out.println(b.reparteCarta().info());
    System.out.println(b.reparteCarta().info());
    System.out.println(b.reparteCarta().info());
    System.out.println(b.cartas.size());

  }
}
