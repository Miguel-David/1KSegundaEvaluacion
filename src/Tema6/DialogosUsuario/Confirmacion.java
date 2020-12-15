package Tema6.DialogosUsuario;

import javax.swing.*;

public class Confirmacion {
  public static void main(String[] args) {
    /* En orden aparecen:
    Si no Cancelar
Aceptar
Si No
Aceptar Cancelar
     */
    JOptionPane.showConfirmDialog(null,
            "Prueba de botones de abajo",
            "Pruebas",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE);
    JOptionPane.showConfirmDialog(null,
            "Prueba de botones de abajo",
            "Pruebas",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE);
    JOptionPane.showConfirmDialog(null,
            "Prueba de botones de abajo",
            "Pruebas",
            JOptionPane.YES_OPTION,
            JOptionPane.WARNING_MESSAGE);
    JOptionPane.showConfirmDialog(null,
            "Prueba de botones de abajo",
            "Pruebas",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE);


  }
}
