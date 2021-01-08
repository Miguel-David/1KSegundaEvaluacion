package Tema6.Ordenacion;

import java.util.Arrays;

public class Clase1KMejora {
  public static void main(String[] args) {
    Alumno[] alumnos={
            new Alumno("Ana",20,2,"Lopez"),
            new Alumno("Bea",12,9,"Lopez"),
            new Alumno("Clara",58,6,"Sánchez"),
            new Alumno("Delia",32,5,"Rodríguez"),
            new Alumno("Elena",18,4,"Lopez"),
            new Alumno("Flori",18,3,"Fuentes"),
    };
    System.out.println(Arrays.toString(alumnos));
    //ORdenar el array (AMBIGUO)
    //ordenarNota(alumnos);
    //ordenarEdad(alumnos);
    ordenarCriterio(alumnos, (a, b) -> a.notaProgramacion>b.notaProgramacion);
    System.out.println(Arrays.toString(alumnos));
  }

  private static void ordenarCriterio(Alumno[] vector,Preguntador preguntador) {
    for (int i = 0; i < vector.length; i++) {

      for (int j = 0; j < vector.length-1; j++) {
        if(!preguntador.estanOrdenCorrecto(vector[j],vector[j+1])){
          //Swap de valores
          Alumno temp = vector[j];
          vector[j] = vector[j+1];
          vector[j+1] = temp;
        }
      }
    }
  }

}
