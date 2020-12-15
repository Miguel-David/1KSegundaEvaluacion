package Tema6.DialogosUsuario;

import javax.swing.*;

public class MostrarInformacion {
  public static void main(String[] args) {
    //El más sencillo. Mensaje simple
    JOptionPane.showMessageDialog(null,"Mensaje");
    //Título propio e icono predefinido
    for (int i=-1;i<=3;i++) {
      JOptionPane.showMessageDialog(null
        ,"Mensaje con título"
        ,"Mi título propio",
        i);
    }
    Icon icono=new ImageIcon("rainbow.png");
    JOptionPane.showMessageDialog(null
            ,"Mensaje con título e icono propio"
            ,"Mi título propio",
            JOptionPane.PLAIN_MESSAGE
            ,icono);
    JOptionPane.showMessageDialog(null
            ,"<html><h1>Mensaje con título</h1><h3 style='color:blue;border-bottom:3px dotted red;'>icono propio</h3>"
            ,"Mi título propio",
            JOptionPane.PLAIN_MESSAGE
            ,icono);
  }
}
