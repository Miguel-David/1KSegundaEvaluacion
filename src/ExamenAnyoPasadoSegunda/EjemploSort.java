package ExamenAnyoPasadoSegunda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EjemploSort {


  public static void main(String[] args) {
    Pais[] paises={
            new Pais("España",23),
            new Pais("GB",78),
            new Pais("EEUU",240)
    };
    Arrays.stream(paises).forEach(System.out::println);
    System.out.println("------------------------");
    Arrays.sort(paises);
    Arrays.stream(paises).forEach(System.out::println);
    System.out.println("------------------------");
    //Arrays.sort(paises,new ComparadorPIB().reversed());
    /*
    Arrays.sort(paises, new Comparator<Pais>() {
      @Override
      public int compare(Pais o1, Pais o2) {
        return Integer.compare(o1.pib,o2.pib);
      }
    }.reversed());

     */
    Arrays.sort(paises, Comparator.comparingInt(p -> p.pib));
    Arrays.stream(paises).forEach(System.out::println);
    List<Pais> lista= Arrays.asList(paises);
    System.out.println("------------------------");
    lista.stream().sorted().forEach(System.out::println);

  }

}
class Pais implements Comparable{
  String nombre;
  int pib;

  public Pais(String nombre, int pib) {
    this.nombre = nombre;
    this.pib = pib;
  }

  @Override
  public String toString() {
    return nombre+" - "+ pib +"€";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pais pais = (Pais) o;
    return nombre.equals(pais.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPib() {
    return pib;
  }

  public void setPib(int pib) {
    this.pib = pib;
  }

  @Override
  public int compareTo(Object o) {
    if(!(o instanceof Pais)){
      return 0;
    }
    Pais otro=(Pais) o;
    return this.nombre.compareTo(otro.nombre);
  }
}
