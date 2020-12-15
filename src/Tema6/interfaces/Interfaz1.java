package Tema6.interfaces;

import javax.swing.*;

public class Interfaz1 {
  public static void main(String[] args) {
    int minutosLeidos = Integer.parseInt(JOptionPane.showInputDialog(null,"Dime los minutos (0-59): "));
    Persona[] personas=new Persona[2];
    personas[0]=new Persona();
    personas[1]=new Persona();
    Dibujable c=new Cuadradooo();

    /**Después de mucho programa*/
    Dibujable[] d=new Dibujable[3];
    d[0]=personas[0];
    d[1]=c;
    d[2]=personas[1];
    for (Dibujable p:d) {
      System.out.println(p.dibujate());

    }
  }

}
interface Dibujable{
  String dibujate();
}
class Cuadradooo implements Dibujable{
  public String dibujate() {
    return "********\n"+
            "********\n"+
            "********\n"+
            "********\n"+
            "********\n"+
            "********\n";
  }
}
class Persona implements Dibujable{
  public String dibujate() {
    return "😀";
  }
}
