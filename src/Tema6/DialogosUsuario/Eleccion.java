package Tema6.DialogosUsuario;

import javax.swing.*;

public class Eleccion {
  public static void main(String[] args) {
    String[] opciones={
            "LIEBRE",
            "CONEJO",
            "PERDIZ",
            "JABALÍ"
    };

  int elegido=JOptionPane.showOptionDialog(null,
            "Elije una opción",
            "Elije una de las opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            opciones,
            opciones[0]);
    System.out.println(elegido);
  }
}
