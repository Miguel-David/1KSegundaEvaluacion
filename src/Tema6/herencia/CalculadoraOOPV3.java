package Tema6.herencia;

import javax.swing.*;

public class CalculadoraOOPV3 {
  public static void main(String[] args) {

    Operacion[] operaciones=new Operacion[6];

    operaciones[0]=new OperacionBinaria("Sumar", (num1, num2) -> num1+num2);
    operaciones[1]=new OperacionBinaria("Multiplicar", (num1, num2) -> num1*num2);
    operaciones[2]=new OperacionBinaria("Resta", (num1, num2) -> num1-num2);
    operaciones[3]=new OperacionUnaria("Negativo", num -> -1*num);
    operaciones[4]=new OperacionUnaria("Elevar al cuadrado", num -> num*num);
    operaciones[5]=new OperacionUnaria("Sumarle 5", num -> num+5);

    int numOperaciones=0;
    int operacionesBinarias=0;
    int operacionesUnarias=0;
    for (Operacion o:operaciones
         ) {
      numOperaciones++;
      if(o instanceof OperacionBinaria){
        operacionesBinarias++;
      }
      if(o instanceof OperacionUnaria){
        operacionesUnarias++;
      }
    }
    JOptionPane.showMessageDialog(null,
            "Tenemos "+numOperaciones+" en nuestra Super Calculator");
    JOptionPane.showMessageDialog(null,
            "Tenemos "+operacionesBinarias+" binarias en nuestra Super Calculator");
    JOptionPane.showMessageDialog(null,
            "Tenemos "+operacionesUnarias+" unarias en nuestra Super Calculator");


    while(true) {
      int elegido = JOptionPane.showOptionDialog(              null,              "Elige",              "Calc",              JOptionPane.YES_NO_OPTION,              JOptionPane.QUESTION_MESSAGE,              null,              operaciones,              operaciones[0]      );
      operaciones[elegido].pedirOperandos();
      JOptionPane.showMessageDialog(null,            "El resultado es " + operaciones[elegido].obtenerResultado());
    }
  }
}
