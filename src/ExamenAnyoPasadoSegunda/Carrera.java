package ExamenAnyoPasadoSegunda;


import java.util.ArrayList;
import java.util.Comparator;
public class Carrera {
  public static void main(String[] args) {
    ArrayList<Corredor> participantes=new ArrayList<>();
//Se rellena la lista con 10 participantes (NO HAY QUE HACERLO)
    participantes.sort(new Comparator<Corredor>() {
      @Override
      public int compare(Corredor o1, Corredor o2) {
//Ordena por tiempo y, si son iguales, por nombre
        if(o1.getTiempo()==o2.getTiempo()){
          return o1.getNombre().compareTo(o2.getNombre());
        }
        return o1.getTiempo()-o2.getTiempo();
      }
    });
//Muestra la información del primero, del segundo y del último
    System.out.println(participantes.get(0).info());
    System.out.println(participantes.get(1).info());
    System.out.println(participantes.get(participantes.size() - 1).info());
  }
}