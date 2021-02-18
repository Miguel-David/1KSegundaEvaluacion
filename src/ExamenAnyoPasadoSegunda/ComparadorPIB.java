package ExamenAnyoPasadoSegunda;

import java.util.Comparator;

public class ComparadorPIB implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    return Integer.compare(((Pais)o1).pib,((Pais)o2).pib);
  }
}
