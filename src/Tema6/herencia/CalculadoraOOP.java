package Tema6.herencia;

import javax.swing.*;

public class CalculadoraOOP {
  public static void main(String[] args) {
    Operacion[] operaciones=new Operacion[5];
    OperableDosOperandos suma=new OperableDosOperandos() {
      @Override
      public int opera(int num1, int num2) {
        return num1+num2;
      }
    };
    operaciones[0]=new OperacionBinaria("Sumar",suma);
    OperableDosOperandos multiplicacion=new OperableDosOperandos() {
      @Override
      public int opera(int num1, int num2) {
        return num1*num2;
      }
    };
    operaciones[1]=new OperacionBinaria("Multiplicar",multiplicacion);
    OperableDosOperandos resta=new OperableDosOperandos() {
      @Override
      public int opera(int num1, int num2) {
        return num1-num2;
      }
    };
    operaciones[2]=new OperacionBinaria("Resta",resta);
    OperableUnOperando negacion=new OperableUnOperando() {
      @Override
      public int opera(int num) {
        return -1*num;
      }
    };
    operaciones[3]=new OperacionUnaria("Negativo",negacion);
    OperableUnOperando cuadrado=new OperableUnOperando() {
      @Override
      public int opera(int num) {
        return num*num;
      }
    };
    operaciones[4]=new OperacionUnaria("Elevar al cuadrado",cuadrado);
    while(true) {
      int elegido = JOptionPane.showOptionDialog(
              null,
              "Elige",
              "Calc",
              JOptionPane.YES_NO_OPTION,
              JOptionPane.QUESTION_MESSAGE,
              null,
              operaciones,
              operaciones[0]
      );
      operaciones[elegido].pedirOperandos();
      JOptionPane.showMessageDialog(null,
              "El resultado es " + operaciones[elegido].obtenerResultado());
    }
  }
}
