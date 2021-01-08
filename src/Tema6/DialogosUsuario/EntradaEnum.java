package Tema6.DialogosUsuario;

import javax.swing.*;
import java.util.Arrays;

public class EntradaEnum {
  public static void main(String[] args) {

    String[] cadenas=new String[Colores.values().length];
    for (int i = 0; i < cadenas.length; i++) {
      cadenas[i]=Colores.values()[i].getNombreMostrar();
    }
    String elegido= (String) JOptionPane.showInputDialog(null,
            "Elije un color",
            "Elije uno de los colores",
            JOptionPane.WARNING_MESSAGE,
            null,
            cadenas,
            cadenas[0]);
    Colores colorElegido=null;
    for (Colores c:Colores.values()) {
      if(c.getNombreMostrar().equals(elegido)){
        colorElegido=c;
      }
    }
    System.out.println(colorElegido.getColorCSS());
    String salida="<html><div style=\"background-color:"+colorElegido.getColorCSS()+";padding:10px;\">";
    salida+= "<h1 style='color:white;margin-bottom:20px;margin-left:auto;margin-right:auto;width:80%'>"+colorElegido.getColorCSS()+"</h1>";

    salida+= "<table style='color:black;' cellspacing=\"10px\"><tr>";
    salida+= "<td style='background-color:white;'>"+colorElegido.getRojo()+"</td>";
    salida+= "<td style='background-color:white;'>"+colorElegido.getVerde()+"</td>";
    salida+= "<td style='background-color:white;'>"+colorElegido.getAzul()+"</td>";

    salida+="</tr></table>";

    salida+="</div></html>";
    JOptionPane.showMessageDialog(null,salida);
  }
}

enum Colores{
  AZUL_CELESTE("Azul Celeste","#2271b3"),
  VERDE_LIMA("Verde Lima","#d0f42d"),
  ROJO_VINO("Rojo Vino","#5e2129"),
  AZUL_MEDIANOCHE("Azul Medianoche","#252850");

  private String nombreMostrar;
  private String colorCSS;
  //Para Miguel para navidades
  //byte[] colores=new byte[3];
  private int[] colores=new int[3];

  Colores(String nombreMostrar,String colorCSS) {
    this.nombreMostrar=nombreMostrar;
    this.colorCSS = colorCSS;
    colores[0]=Integer.parseInt(colorCSS,1,3,16);
    colores[1]=Integer.parseInt(colorCSS,3,5,16);
    colores[2]=Integer.parseInt(colorCSS,5,7,16);
    /*
    String cadenaR=colorCSS.substring(1,3);
    String cadenaG=colorCSS.substring(3,5);
    String cadenaB=colorCSS.substring(5,7);
    colores[0]=Integer.parseInt(cadenaR,16);
     */
  }


  int getRojo(){
    return colores[0];
  }
  int getVerde(){
    return colores[1];
  }
  int getAzul(){
    return colores[2];
  }

  public String getColorCSS() {
    return colorCSS;
  }

  public String getNombreMostrar() {
    return nombreMostrar;
  }
}
