package TallerMecanico;

import javax.swing.*;

public class ESReparacion {
  public static Reparacion pedirReparacion(Vehiculo v){
    String descripcion= JOptionPane.showInputDialog("REPARACIÓN DEL VEHÍCULO "+v.info());
    if(descripcion==null || "".equals(descripcion)){
      return null;
    }
    String precioCadena=JOptionPane.showInputDialog(
            "Introduzca el precio de la reparación: "+descripcion+
                    " del Vehículo: "+v.info());
    if (precioCadena == null || "".equals(precioCadena)) {
      return null;
    }
    double precio=Double.parseDouble(precioCadena);
    int precioCentimos=(int)(precio*100);
    return new Reparacion(descripcion,precioCentimos);
  }
}
