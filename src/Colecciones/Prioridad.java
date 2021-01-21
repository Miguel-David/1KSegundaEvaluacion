package Colecciones;

public enum Prioridad {
  NORMAL(6),
  VIP(4),
  POLITICO(2),
  REY(1);

  private final int gravedad;

  public int getGravedad() {
    return gravedad;
  }

  Prioridad(int i) {
    this.gravedad=i;
  }
}
