package Tema6.Ordenacion;

import java.util.Arrays;

public class OrdenarArray {
  public static void main(String[] args) {
    int[] vector={3,7,9,2,5,8,1,0,2,7,8,4};
    System.out.println("SIN ORDENAR");
    System.out.println(Arrays.toString(vector));
    /////
    ordenarBurbuja(vector);

    System.out.println("ORDENADO");
    System.out.println(Arrays.toString(vector));

  }

  private static void ordenarBurbuja(int[] vector) {
    for (int i = 0; i < vector.length; i++) {

      for (int j = 0; j < vector.length-1; j++) {
        if(vector[j]>vector[j+1]){
          //Swap de valores
          int temp = vector[j];
          vector[j] = vector[j+1];
          vector[j+1] = temp;
        }
      }
    }


  }

  private static void ordenarSeleccionDirecta(int[] vector) {
    for(int i=0;i<vector.length;i++) {
      int minimo = vector[i];
      int posMinimo = i;
      for (int j = i; j < vector.length; j++) {
        if (vector[j] < minimo) {
          minimo = vector[j];
          posMinimo = j;
        }
      }
      //Tengo el mínimo
      System.out.println("Minimo: " + minimo + " Pos Minimo " + posMinimo);
      int temp = vector[i];
      vector[i] = minimo;
      vector[posMinimo] = temp;
    }

  }
}
