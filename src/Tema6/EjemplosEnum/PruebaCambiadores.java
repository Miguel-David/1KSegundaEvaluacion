package Tema6.EjemplosEnum;

import static Tema6.EjemplosEnum.TransformadoresCadenas.*;


public class PruebaCambiadores {
  public static void main(String[] args) {
    System.out.println(PASA_MAYUSCULAS.actua("peprpr"));
    System.out.println(COGE_TRES_PRIMEROS.actua("cadena larga"));
    System.out.println(PARRIBA_PABAJO.actua("En un lugar de la Mancha"));

  }
}
