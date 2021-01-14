package TallerMecanico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ESListadoVehiculos {
  public static String listadoHTML(ListadoVehiculos listado){
    if(listado.estaVacio()){
      return "<html><h1>NO HAY VEHICULOS</h1></html>";
    }
    String salida="<html><h1>Listado de Vehículos</h1><hr><pre style='font-size:24'>";
    for (int i = 0; i < listado.tamanyoListado(); i++) {
        salida+=listado.getVehiculo(i).info()+"<br>";
    }
    return salida+"</pre></html>";
  }
  public static void escribeListadoFichero(ListadoVehiculos listado,String fichero){
    List<String> lineas=new ArrayList<>();
    //Construir las lineas y añadirlas a la lista
    for (int i = 0; i < listado.tamanyoListado(); i++) {
      Vehiculo actual=listado.getVehiculo(i);
      lineas.add(actual.getMatricula()+","+actual.getPropietario());
    }
    try {
      Files.write(Paths.get(fichero),lineas);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ListadoVehiculos leeDeFichero(String fichero){
    List<String> lineas=null;
    try {
      lineas=Files.readAllLines(Paths.get(fichero));
    } catch (IOException e) {
      e.printStackTrace();
    }
    ListadoVehiculos nuevo=new ListadoVehiculos();
    for (String s:lineas) {
      String[] partes=s.split(",");
      nuevo.anyadirVehiculo(new Vehiculo(partes[0],partes[1]));
    }
    return nuevo;
  }
}
