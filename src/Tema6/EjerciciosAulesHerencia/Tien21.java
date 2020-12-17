package Tema6.EjerciciosAulesHerencia;

import static Tema6.EjerciciosAulesHerencia.ColorElectrodomestico.*;
import static Tema6.EjerciciosAulesHerencia.ConsumoEnergetico.*;

public class Tien21 {
  public static void main(String[] args) {
    Electrodomestico[] exposicion= {
            new Electrodomestico(40000,8.304),
            new Electrodomestico(20000,10.03, ROJO, C),
            new Electrodomestico(10000,40.8,NEGRO,E),
            new Electrodomestico(),
            new Lavadora(),
            new Lavadora(10020,5.45,BLANCO,D,9),
            new Television(50000,6.00),
            new Television(60000,10.0,NEGRO,A,80,true),
            new Lavadora(30300,2.56,PLATA,E,5),
            new Lavadora(39995,10.5)
    };

    int precioTodos=0;
    int numeroElectrodomesticos=0;
    int precioLavadora=0;
    int numeroLavadoras=0;
    int precioTelevisiones=0;
    int numeroTelevisiones=0;

    for (Electrodomestico e:exposicion) {
      precioTodos+=e.precioFinal();
      numeroElectrodomesticos++;
      if(e instanceof Lavadora){
        precioLavadora+=e.precioFinal();
        numeroLavadoras++;
      }
      if(e instanceof Television){
        precioTelevisiones+=e.precioFinal();
        numeroTelevisiones++;
      }
    }
    System.out.println(numeroElectrodomesticos+" suman "+precioTodos);
    System.out.println(numeroLavadoras+" suman "+precioLavadora);
    System.out.println(numeroTelevisiones+" suman "+precioTelevisiones);

  }
}
