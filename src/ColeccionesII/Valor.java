package ColeccionesII;

public enum Valor implements Comparable<Valor>{
  AS(1),
  DOS(2),
  TRES(3),
  CUATRO(4),
  CINCO(5),
  SEIS(6),
  SIETE(7),
  SOTA(10),
  CABALLO(11),
  REY(12);

  private final int valor;

  public int getValor() {
    return valor;
  }

  Valor(int i) {
    this.valor=i;
  }
}
