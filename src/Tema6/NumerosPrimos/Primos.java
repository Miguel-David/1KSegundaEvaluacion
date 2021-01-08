package Tema6.NumerosPrimos;

import java.util.Scanner;

public class Primos {
  //Número primo
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un número que los primos hasta ese numero");
    boolean esPrimo=true;
    System.out.println("el dos");
    int numero=sc.nextInt();
    for (int i = 3; i < numero; i+=2) {

    if(esPrimo(i)){
      System.out.println(i);
    }
    }
    System.out.println(Integer.MAX_VALUE);
  }

  private static boolean esPrimo(int numero) {
    boolean esPrimo=true;
    long startTime = System.currentTimeMillis();
    int raiz=(int)Math.sqrt(numero);
    if(numero %2==0){
      return false;
    } else {
      for (int i = 3; i < raiz; i += 2) {
        int resto = numero % i;
        if (resto == 0) {
          return false;
        }
      }
    }
    /*
    long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su for
    System.out.println(esPrimo ? numero + " Es Primo" : numero + " No es Primo");
    System.out.println("Tarda: " + endTime);*/
    return esPrimo;
  }
}
