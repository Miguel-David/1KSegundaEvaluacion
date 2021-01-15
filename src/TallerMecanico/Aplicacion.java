package TallerMecanico;

import javax.swing.*;
import java.util.List;

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
            //ESListadoVehiculos.escribeListadoFichero(misVehiculos,"taller.csv");
          }
          System.out.println(misVehiculos);

          break;
        case 1:
          System.out.println("Eliminar Vehículo");
          //Pedir matrícula
          //Mostrar desplegable con matrículas disponibles
          String elegido = matriculaDropBox(misVehiculos, "Elija Vehículo a borrar", "BORRADO DE VEHÍCULOS");
          //Borrar vehiculo de misVehículos
          if(elegido!=null) {
            misVehiculos.borrarPorMatricula(elegido);
            //ESListadoVehiculos.escribeListadoFichero(misVehiculos,"taller.csv");
          }

          break;
        case 2:
          System.out.println("Listar Vehículos");
          JOptionPane.showMessageDialog(null,ESListadoVehiculos.listadoHTML(misVehiculos));
          break;
        case 3:
          System.out.println("Nueva Reparacion");
          //Pedir matrícula
          //Mostrar desplegable con matrículas disponibles
          String elegidoReparacion = matriculaDropBox(misVehiculos, "Elija Vehículo para la Reparación", "REPARACION DE VEHÍCULOS");
          //Borrar vehiculo de misVehículos
          if(elegidoReparacion!=null) {
            Vehiculo vehiculoAReparar=misVehiculos.buscarMatricula(elegidoReparacion);
            Reparacion nuevaReparacion=ESReparacion.pedirReparacion(vehiculoAReparar);
            if(nuevaReparacion!=null){
              vehiculoAReparar.anyadeReparacion(nuevaReparacion);
            }
          }

          break;
        case 4:
          System.out.println("Buscar Reparación");
          String elegidoBuscar = matriculaDropBoxConTodos(misVehiculos, "Elija Vehículo a buscar Reparacion", "BUSQUEDA DE REPARACIÓN");
          if(elegidoBuscar==null){
            break;
          }
          Vehiculo buscado= misVehiculos.buscarMatricula(elegidoBuscar);

          String palabraBuscar=JOptionPane.showInputDialog("Palabra a buscar");
          if(palabraBuscar==null){
            break;
          }
          if(buscado!=null) {
            List<Reparacion> reparacionesPalabraClave = null;
            if (palabraBuscar.equals("")) {
              reparacionesPalabraClave = buscado.getReparaciones();
            } else {
              reparacionesPalabraClave = buscado.getReparacionesConClave(palabraBuscar);
            }
            String listaReparaciones = "El vehículo " + buscado.getMatricula();
            listaReparaciones += " tiene " + reparacionesPalabraClave.size();
            listaReparaciones += " reparaciones con " + palabraBuscar;
            for (Reparacion r : reparacionesPalabraClave) {
              listaReparaciones += "\n" + r.info();
            }
            JOptionPane.showMessageDialog(null, listaReparaciones);

          } else {
            //JOptionPane.showMessageDialog(null,"Buscar en todos");
            //Para después del fin de semana
          }
          break;
        case -1:
        case 5:
          ESListadoVehiculos.escribeListadoFichero(misVehiculos,"taller.csv");
          continuarEnElPrograma=false;
          break;
        default:break;
      }
    } while(continuarEnElPrograma);
  }

  private static String matriculaDropBoxConTodos(ListadoVehiculos misVehiculos, String s, String s2) {
    String[] matriculas = misVehiculos.obtenerMatriculas();
    String[] matriculasTodos= new String[matriculas.length+1];
    matriculasTodos[0]="Todos";
    for (int i = 0; i < matriculas.length; i++) {
      matriculasTodos[i+1]=matriculas[i];
    }
    return (String) JOptionPane.showInputDialog(null,
            s,
            s2,
            JOptionPane.WARNING_MESSAGE,
            null,
            matriculasTodos,
            matriculasTodos[0]);
  }


  private static String matriculaDropBox(ListadoVehiculos misVehiculos, String s, String s2) {
    String[] matriculas = misVehiculos.obtenerMatriculas();
    return (String) JOptionPane.showInputDialog(null,
            s,
            s2,
            JOptionPane.WARNING_MESSAGE,
            null,
            matriculas,
            matriculas[0]);
  }
}
