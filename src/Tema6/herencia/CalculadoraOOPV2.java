package Tema6.herencia;

import javax.swing.*;

public class CalculadoraOOPV2 {
  public static void main(String[] args) {

    Operacion[] operaciones=new Operacion[6];

    operaciones[0]=new OperacionBinaria("Sumar", new OperableDosOperandos() {
      @Override
      public int opera(int num1, int num2) {
        return num1+num2;
      }
    });

    operaciones[1]=new OperacionBinaria("Multiplicar", new OperableDosOperandos() {
      @Override
      public int opera(int num1, int num2) {
        return num1*num2;
      }
    });

    operaciones[2]=new OperacionBinaria("Resta", new OperableDosOperandos() {
      @Override
      public int opera(int num1, int num2) {
        return num1-num2;
      }
    });
    operaciones[3]=new OperacionUnaria("Negativo", new OperableUnOperando() {
      @Override
      public int opera(int num) {
        return -1*num;
      }
    });

    operaciones[4]=new OperacionUnaria("Elevar al cuadrado", new OperableUnOperando() {
      @Override
      public int opera(int num) {
        return num*num;
      }
    });
    operaciones[5]=new OperacionUnaria("Sumarle 5", new OperableUnOperando() {
      @Override
      public int opera(int num) {
        return num+5;
      }
    });
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
