package Tema6.herencia;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int elegido=0;
    do{

      System.out.println(cadenaMenu());
      elegido=sc.nextInt();
      switch (elegido){
        case 0:
          System.out.println("ADIOS");
          break;
        case 1:
          hazSuma(sc);
          break;
      }
    } while(elegido!=0);

  }

  private static void hazSuma(Scanner sc) {
    int num1=pideNumero("Primer Sumando", sc);
    int num2=pideNumero("Segundo Sumando", sc);
    int resultado=num1+num2;
    System.out.println("El resultado es " + resultado);
  }

  public static int pideNumero(String mensaje,Scanner sc){
    System.out.println(mensaje);
    return sc.nextInt();
  }
  public static String cadenaMenu(){
    String salida="";
    salida+="0. Salir\n";
    salida+="1. Suma\n";
    salida+="2. Resta\n";
    salida+="3. Multiplicación\n";
    salida+="4. División\n";
    return salida;
  }
}
