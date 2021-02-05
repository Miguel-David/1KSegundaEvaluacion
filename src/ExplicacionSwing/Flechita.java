package ExplicacionSwing;

import java.util.Arrays;
import java.util.List;

public class Flechita {
  public static void main(String[] args) {
    List<Integer> lista= Arrays.asList(5,6,8,2,4,7,8,9);
    lista.forEach(numericoQueMeHanDAdo->System.out.println(numericoQueMeHanDAdo*2));
  }
}
