package ColeccionesII;

public class Carta implements Comparable<Carta>{
  Palo palo;
  Valor valor;

  public Carta(Palo palo, Valor valor) {
    this.palo = palo;
    this.valor = valor;
  }
  public String info(){
    return valor+" de "+palo;
  }

  @Override
  public int compareTo(Carta o) {
    return this.valor.compareTo(o.valor);
  }
}
