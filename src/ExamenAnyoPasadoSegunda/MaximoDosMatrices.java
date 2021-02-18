package ExamenAnyoPasadoSegunda;

import java.util.Arrays;
import java.util.List;

public class MaximoDosMatrices {
  public static void main(String[] args) {
    //List<Integer> p= Arrays.asList(4,5,3,2,23,6);
    int[][] primera={
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}};
    int[][] segunda={
            {1,2,9,4},
            {1,2,3,4},
            {1,9,3,4},
            {1,2,3,9}};

    int[][] salida=matrizMaxima(primera,segunda);

    int[][] salidaDistintos=matrizMaximaDistintos(primera,segunda);

  }

  private static int[][] matrizMaximaDistintos(int[][] primera, int[][] segunda) {
    int[][] grande;
    int[][] pequeña;
    if(primera.length>segunda.length){
      grande=primera;
      pequeña=segunda;
    } else {
      grande=segunda;
      pequeña=primera;
    }


    //en este punto quiero tener una que sea la grande y otra la pequeña
    int[][] expandida=new int[grande.length][grande.length];
    for (int i = 0; i < pequeña.length; i++) {
      for (int j = 0; j < pequeña.length; j++) {
        expandida[i][j]=pequeña[i][j];
      }
    }
    return matrizMaxima(expandida,grande);
  }

  private static int[][] matrizMaxima(int[][] una, int[][] dos) {
    int[][] salida;
    int filas= una.length;
    int columnas=una[0].length;
    salida=new int[filas][columnas];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        int mayor=una[i][j]>dos[i][j]?una[i][j]:dos[i][j];
        salida[i][j]=mayor;
      }
    }
    return salida;
  }
}

