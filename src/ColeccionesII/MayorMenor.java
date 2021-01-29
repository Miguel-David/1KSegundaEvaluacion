package ColeccionesII;

import java.util.*;

public class MayorMenor {
  public static void main(String[] args) {
    Set<Carta> cartasAcertadas=new TreeSet<>();
    Baraja miBaraja=new Baraja();
    Scanner sc=new Scanner(System.in);
    miBaraja.barajar();
    Carta nuevaCarta=miBaraja.reparteCarta();
    System.out.println("Te reparto el " + nuevaCarta.info());
    while(true){
      cartasAcertadas.add(nuevaCarta);
      System.out.println("¿La siguiente es mayor(+) o menor(-)?");
      Carta siguiente= miBaraja.reparteCarta();
      switch(sc.nextLine()){
        case "+":if(siguiente.compareTo(nuevaCarta)<0){
          System.out.println("ERROR "+siguiente.info());
          return;
        } else {
          nuevaCarta=siguiente;
        }
                break;
        case "-":
          if(siguiente.compareTo(nuevaCarta)>0){
            System.out.println("ERROR "+siguiente.info());
            return;
          } else {
            nuevaCarta=siguiente;
          }
          break;
        default:
        System.out.println("No te entiendo");
        break;
      }

      System.out.println("BIEN: la nueva carta es " + nuevaCarta.info());
      System.out.println("Por ahora llevas " + cartasAcertadas.size());
      cartasAcertadas.forEach(e->System.out.println(e.info()));
    }

  }
}
