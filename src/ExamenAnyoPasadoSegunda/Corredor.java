package ExamenAnyoPasadoSegunda;

public class Corredor implements Comparable<Corredor>{
  private final String nombre;
  private final int dorsal;
  private final int tiempo;
  public String getNombre() { return nombre; }
  public int getDorsal() { return dorsal; }
  public int getTiempo() { return tiempo; }
  public Corredor(String nombre, int dorsal, int tiempo) {
    this.nombre = nombre;
    this.dorsal = dorsal;
    this.tiempo = tiempo;
  }
  @Override
  public int compareTo(Corredor o) {
//ORDENA POR DORSAL
    return this.dorsal-o.dorsal;
  }
  public String info() {
    return this.dorsal+" - "+this.tiempo+" : "+this.nombre;
  }
}