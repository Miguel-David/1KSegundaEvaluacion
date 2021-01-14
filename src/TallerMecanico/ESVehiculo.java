package TallerMecanico;

import javax.swing.*;

public class ESVehiculo {
  public static Vehiculo pideVehiculo(){
    String matricula=JOptionPane.showInputDialog("Matrícula del Vehículo");
    if(matricula==null | "".equals(matricula)){
      return null;
    }
    String propietario=JOptionPane.showInputDialog("Propietario del Vehículo");
    if(propietario==null | "".equals(propietario)){
      return null;
    }
    return new Vehiculo(matricula,propietario);
  }
  public static void main(String[] args) {
    if(ESVehiculo.pideVehiculo()==null){
      System.out.println("Has cancelado en algún momento");
    } else {
      System.out.println("Vehículo creado");
    }
  }
}
