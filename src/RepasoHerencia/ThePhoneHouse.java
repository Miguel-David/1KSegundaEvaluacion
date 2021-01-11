package RepasoHerencia;

import javax.swing.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThePhoneHouse {
  public static void main(String[] args) throws IOException {
    List<DispositivoMovil> productos=new ArrayList<>();
    String[] opciones={
            "Añadir",
            "Listar"
    };

    int elegido= JOptionPane.showOptionDialog(null,
            "Elije una opción",
            "Elije una de las opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            opciones,
            opciones[0]);
    System.out.println(elegido);
    switch (elegido){
      case  0: String[] cadenas={"Móvil antiguo","SmartPhone","Tableta"};
          String tipo= (String) JOptionPane.showInputDialog(null,
              "Elije un color",
              "Elije uno de los colores",
              JOptionPane.WARNING_MESSAGE,
              null,
              cadenas,
              cadenas[0]);
        String marcaModelo=JOptionPane.showInputDialog("Marca y modelo");
        String IMEI=JOptionPane.showInputDialog("IMEI");
        String numeroTelefono=JOptionPane.showInputDialog("Número teléfono");
        int amperajeBateria=Integer.parseInt(JOptionPane.showInputDialog("Amperaje"));
        double tamanyoPantalla=Double.parseDouble(JOptionPane.showInputDialog("Tamaño Pantalla"));
        String SO="";
        if(tipo!="Móvil Antiguo"){
          SO=JOptionPane.showInputDialog("Sistem Operativo?");
        }
        DispositivoMovil aAnyadir=null;
        switch (tipo){
          case "Móvil antiguo":aAnyadir=new DispositivoMovil(marcaModelo,IMEI,numeroTelefono,amperajeBateria,tamanyoPantalla);
          break;
          case "SmartPhone":aAnyadir=new SmartPhone(marcaModelo,IMEI,numeroTelefono,amperajeBateria,tamanyoPantalla,SO);
          break;
          case "Tableta":aAnyadir=new Tableta(marcaModelo,IMEI,numeroTelefono,amperajeBateria,tamanyoPantalla,SO);
          break;
        }
        productos.add(aAnyadir);
        break;
      case 1:
        break;
    }
    String escribir="";
    for (DispositivoMovil d:productos) {
      escribir+=d.info();
    }
    Files.write(Paths.get("productos.txt"), Collections.singleton(escribir));
  }
}
