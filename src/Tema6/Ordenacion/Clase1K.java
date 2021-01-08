package Tema6.Ordenacion;

import Tema6.herencia.Persona;

import java.util.Arrays;

public class Clase1K {
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
    ordenarApellido(alumnos);
    System.out.println(Arrays.toString(alumnos));
  }

  private static void ordenarApellido(Alumno[] vector) {
    for (int i = 0; i < vector.length; i++) {

      for (int j = 0; j < vector.length-1; j++) {
        if(vector[j].apellido.compareTo(vector[j+1].apellido)>0){
          //Swap de valores
          Alumno temp = vector[j];
          vector[j] = vector[j+1];
          vector[j+1] = temp;
        }
      }
    }
  }

  private static void ordenarEdad(Alumno[] vector) {
    for (int i = 0; i < vector.length; i++) {

      for (int j = 0; j < vector.length-1; j++) {
        if(vector[j].edad<vector[j+1].edad){
          //Swap de valores
          Alumno temp = vector[j];
          vector[j] = vector[j+1];
          vector[j+1] = temp;
        }
      }
    }
  }

  private static void ordenarNota(Alumno[] vector) {
    for (int i = 0; i < vector.length; i++) {

      for (int j = 0; j < vector.length-1; j++) {
        if(vector[j].notaProgramacion<vector[j+1].notaProgramacion){
          //Swap de valores
          Alumno temp = vector[j];
          vector[j] = vector[j+1];
          vector[j+1] = temp;
        }
      }
    }
  }
}
