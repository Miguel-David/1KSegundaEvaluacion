package Tema6.DialogosUsuario;

import javax.swing.*;

public class PedirCuadroTexto {
  public static void main(String[] args) {
    //El más simple. Siempre devuelve String o null
    //null cuando se pulsa la X o Cancelar
    String entrada=JOptionPane.showInputDialog("Introduce algo");
    //Complicando
    String otraEntrada=JOptionPane.showInputDialog(
            "<html><h1>Mensaje con sugerencia</h1>"
            ,"Escribeme algo");
    String masEntrada=JOptionPane.showInputDialog(null
        ,"Título personalizado e icono predefinido"
        ,"Escribe tu nombre"
        ,JOptionPane.WARNING_MESSAGE);
    String[] opciones={
            "LIEBRE",
            "CONEJO",
            "PERDIZ",
            "JABALÍ"
    };
    String caza=(String)JOptionPane.showInputDialog(null,
            "Elije una opción",
            "Elije una de las opciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);
    System.out.println(caza);
    Contacto[] agenda={
            new Contacto("Ana","9666666"),
            new Contacto("Bea","66882"),
            new Contacto("Clara","Perico"),
            new Contacto("Delia","delia@gmail.com"),
    };
    Contacto elegido=(Contacto) JOptionPane.showInputDialog(null,
            "Elije una opción",
            "Elije una de las opciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            agenda,
            agenda[0]);
    System.out.println(elegido);
  }
}
