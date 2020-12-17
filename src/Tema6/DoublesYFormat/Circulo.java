package Tema6.DoublesYFormat;

public class Circulo extends Figura{
  private double radio;

  public double getRadio() {
    return radio;
  }

  public Circulo(double radio) {
    this.radio = radio;
  }

  @Override
  public double getArea() {
    return Math.pow(Math.PI,2)*radio;
  }
}
