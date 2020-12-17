package Tema6.EjerciciosAulesHerencia;

public enum ConsumoEnergetico {
  A(100),
  B(80),
  C(60),
  D(50),
  E(30),
  F(10);

  private final int eurosExtra;

  ConsumoEnergetico(int eurosExtra) {
    this.eurosExtra = eurosExtra;
  }

  public int getEurosExtra() {
    return eurosExtra;
  }
}
