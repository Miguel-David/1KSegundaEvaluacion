package TallerMecanico;

import javax.swing.*;

public class Aplicacion {
  public static void main(String[] args) {
    ListadoVehiculos misVehiculos=ESListadoVehiculos.leeDeFichero("taller.csv");
    String[] opciones={"Nuevo Vehículo","Eliminar Vehículo","Listar Vehículos","Nueva Reparación","Buscar Reparacion","Salir y Guardar"};
    boolean continuarEnElPrograma=true;
    do {
      int respuesta = JOptionPane.showOptionDialog(null, "Elija una opción", "Taller de Reparaciones El Niño de Mula", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
      switch(respuesta){
        case 0:
          System.out.println("Nuevo Vehículo");
          Vehiculo nuevoVehiculo=ESVehiculo.pideVehiculo();
          if(!misVehiculos.anyadirVehiculo(nuevoVehiculo)){
            JOptionPane.showMessageDialog(null,"La matrícula ya está");
          } else {
            ESListadoVehiculos.escribeListadoFichero(misVehiculos,"taller.csv");
          }
          System.out.println(misVehiculos);

          break;
        case 1:
          System.out.println("Eliminar Vehículo");
          //Pedir matrícula
          //Mostrar desplegable con matrículas disponibles
          String[] matriculas=misVehiculos.obtenerMatriculas();
          String elegido=(String) JOptionPane.showInputDialog(null,
                  "Elija Vehículo a borrar",
                  "BORRADO DE VEHÍCULOS",
                  JOptionPane.WARNING_MESSAGE,
                  null,
                  matriculas,
                  matriculas[0]);
          //Borrar vehiculo de misVehículos
          if(elegido!=null) {
            misVehiculos.borrarPorMatricula(elegido);
            ESListadoVehiculos.escribeListadoFichero(misVehiculos,"taller.csv");
          }

          break;
        case 2:
          System.out.println("Listar Vehículos");
          JOptionPane.showMessageDialog(null,ESListadoVehiculos.listadoHTML(misVehiculos));
          break;
        case 3:
          System.out.println("Nueva Reparacion");
          break;
        case 4:
          System.out.println("Buscar Reparación");
          break;
        case -1:
        case 5:
          continuarEnElPrograma=false;
          break;
        default:break;
      }
    } while(continuarEnElPrograma);
  }
}
