package TallerMecanico;

import java.util.ArrayList;
import java.util.List;

public class ListadoVehiculos {
  private final List<Vehiculo> listado;
  ListadoVehiculos(){
    listado=new ArrayList<>();
  }

  public int tamanyoListado(){
    return listado.size();
  }

  public Vehiculo getVehiculo(int posicion){
    return listado.get(posicion);
  }

  public boolean estaVacio(){
    return listado.isEmpty();
  }

  boolean anyadirVehiculo(Vehiculo nuevo){
    //True si se añade, false si no
    for (Vehiculo v:listado) {
      if(v.getMatricula().equals(nuevo.getMatricula())){
        return false;
      }
    }
    //Retorno anticipado. En este punto sé que no está y lo puedo añadir
    //Copia defensiva -->En algún momento explicar constructor copia
    Vehiculo aAnyadir=new Vehiculo(nuevo.getMatricula(), nuevo.getPropietario());
    listado.add(nuevo);
    return true;
  }

  @Override
  public String toString() {
    return "ListadoVehiculos{" +
            "listado=" + listado +
            '}';
  }

  public static void main(String[] args) {
    ListadoVehiculos prueba=new ListadoVehiculos();
    System.out.println(prueba.anyadirVehiculo(new Vehiculo("AAAA555", "Ana")));
    System.out.println(prueba.anyadirVehiculo(new Vehiculo("AAAA555", "Bea")));
    System.out.println(prueba.anyadirVehiculo(new Vehiculo("CCCC000", "Clara")));
    System.out.println(prueba);
  }

  public String[] obtenerMatriculas() {
    String[] matriculas=new String[listado.size()];
    for (int i = 0; i < listado.size(); i++) {
      matriculas[i]=listado.get(i).getMatricula();
    }
    return matriculas;
  }

  public void borrarPorMatricula(String elegido) {
    Vehiculo aBorrar=buscarMatricula(elegido);
    if(aBorrar!=null) {
      listado.remove(aBorrar);
    }
  }
  public Vehiculo buscarMatricula(String matricula){
    for (Vehiculo v:listado) {
      if(v.getMatricula().equals(matricula)){
        return v;
      }
    }
    return null;
  }
}
