package Tema6.Dudas;

import javax.swing.*;

//Ejemplos de valueOf
public class VauleOf {
  //En general se usa valueOf para "Parsear" un String para obtener otro tipo
  public static void main(String[] args) {
    String miBooleano="true";
    boolean elBooleano=miBooleano.equals("true");
    Boolean booleanoWrapper;
    booleanoWrapper=Boolean.valueOf(miBooleano);
    int i=23;
    Integer entero=Integer.valueOf("23");
    System.out.println(entero);
    entero++;
    System.out.println(entero);
    Integer binario=Integer.valueOf("1001");
    System.out.println(binario);
    binario=Integer.valueOf("1001",2);
    System.out.println(binario);
    binario=Integer.valueOf("0777",8);
    System.out.println(binario);
    //String entrada= JOptionPane.showInputDialog("Nombre del villancico");
    //entrada=entrada.toUpperCase();
    //entrada=entrada.replace(' ','_');
    //Villancicos pedido=Villancicos.valueOf(entrada);
    //System.out.println(pedido);
    //JOptionPane.showMessageDialog(null,pedido.getLetra());
    String texto="La virgen se está peinando entre cortina y cortina";
    int numLetras=0;
    for (char c:texto.toCharArray()) {
      if(Character.isLetter(c)){
        numLetras++;
      }
    }
    System.out.println(numLetras);
  }
}

enum Villancicos{
  CAMPANA_SOBRE_CAMPANA("Villancico Español del siglo XII","Campana sobre campana,\n" +
          "y sobre campana una,\n" +
          "asómate a la ventana,\n" +
          "verás el Niño en la cuna.\n" +
          "\n" +
          "Belén, campanas de Belén,\n" +
          "que los Ángeles tocan\n" +
          "qué nueva me traéis?\n" +
          "\n" +
          "Recogido tu rebaño\n" +
          "a dónde vas pastorcillo?\n" +
          "Voy a llevar al portal\n" +
          "requesón, manteca y vino.\n" +
          "\n" +
          "Belén, campanas de Belén,\n" +
          "que los Ángeles tocan\n" +
          "qué nuevas me traéis?"),
  ALL_I_WANT_FOR_CHRISTMAS_IS_YOU("Villancico del siglo XX","I don't want a lot for Christmas\n" +
          "There is just one thing I need\n" +
          "I don't care about the presents\n" +
          "Underneath the Christmas tree\n" +
          "I just want you for my own\n" +
          "More than you could ever know\n" +
          "Make my wish come true"),
  MI_BURRITO_SABANERO("Villancico Colombiano siglo XX","Con mi burrito sabanero\n" +
          "voy camino de Belén,\n" +
          "con mi burrito sabanero\n" +
          "voy camino de Belén,\n" +
          "\n" +
          "Si me ven, si me ven voy camino de Belén\n" +
          "si me ven, si me ven voy camino de Belén\n" +
          "\n" +
          "El lucerito mañanero ilumina mi sendero,\n" +
          "el lucerito mañanero ilumina mi sendero\n" +
          "\n" +
          "Si me ven, si me ven voy camino de Belén\n" +
          "Si me ven, si me ven voy camino de Belén");

  final String descripcion;
  final String letra;

  Villancicos(String descripcion, String letra) {
    this.descripcion = descripcion;
    this.letra = letra;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public String getLetra() {
    return letra;
  }
}
