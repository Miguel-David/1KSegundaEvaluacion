package Tema6.DoublesYFormat;

public class Cuadrado extends Figura {
  private double lado;

  public Cuadrado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  @Override
  public double getArea() {
    return Math.pow(lado,2);
  }
}
