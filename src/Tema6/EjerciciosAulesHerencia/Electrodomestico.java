package Tema6.EjerciciosAulesHerencia;

import java.util.Map;

public class Electrodomestico {
  //Sus atributos son precio base, color, consumo energético
  // (letras entre A y F) y peso. Indica que
  //se podrán heredar.
  //DE UNA FORMA RARA ESTÁ DICIENDO QUE NO SE PONGA PRIVATE (ENTIENDO PROTECTED)
  protected int precioBase;
  protected final ColorElectrodomestico color;
  protected final ConsumoEnergetico consumo;
  protected final double peso;

  //Por defecto, el color sera blanco, el consumo energético sera F,
  // el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.

  public static final ColorElectrodomestico COLOR_DEFECTO=ColorElectrodomestico.BLANCO;
  public static final ConsumoEnergetico CONSUMO_DEFECTO=ConsumoEnergetico.F;
  public static final int PRECIO_DEFECTO=100;
  public static final double PESO_DEFECTO=5.0;
  //Los constructores que se implementaran serán
  // Un constructor por defecto.
  // Un constructor con el precio y peso. El resto por defecto.
  // Un constructor con todos los atributos.
  public Electrodomestico(int precioBase, double peso, ColorElectrodomestico color, ConsumoEnergetico consumo) {
    this.precioBase = precioBase;
    this.color = color;
    this.consumo = consumo;
    this.peso = peso;
  }

  public Electrodomestico(int precioBase, double peso) {
    this(precioBase,peso,COLOR_DEFECTO,CONSUMO_DEFECTO);
  }

  public Electrodomestico() {
    this(PRECIO_DEFECTO,PESO_DEFECTO,COLOR_DEFECTO,CONSUMO_DEFECTO);
  }

  //Métodos get de todos los atributos.
  public int getPrecioBase() {
    return precioBase;
  }

  public ColorElectrodomestico getColor() {
    return color;
  }

  public ConsumoEnergetico getConsumo() {
    return consumo;
  }

  public double getPeso() {
    return peso;
  }

  //comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
  // sino es correcta devuelve la letra por defecto. Se invocara al
  // crear el objeto y no sera visible.
  ConsumoEnergetico comprobarConsumoEnergetico(char letra){
    if(letra<'A' || letra>'F'){
      return CONSUMO_DEFECTO;
    }
    return ConsumoEnergetico.valueOf(""+letra);
  }

  //Este metodo sugiere el siguiente constructor:
  public Electrodomestico(int precioBase, double peso, ColorElectrodomestico color, char consumo) {
    this.precioBase = precioBase;
    this.color = color;
    this.consumo = comprobarConsumoEnergetico(consumo);
    this.peso = peso;
  }
  //comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por
  //defecto. Se invocara al crear el objeto y no sera visible.
  ColorElectrodomestico comprobarColor(String color){
    switch (color.toUpperCase()){
      case "BLANCO":return ColorElectrodomestico.BLANCO;
      case "PLATA":return ColorElectrodomestico.PLATA;
      case "NEGRO":return ColorElectrodomestico.NEGRO;
      case "ROJO":return ColorElectrodomestico.ROJO;
      case "AZUL":return ColorElectrodomestico.AZUL;
      default:return COLOR_DEFECTO;
    }
  }

  //Sugiere el siguiente constructor
  public Electrodomestico(int precioBase, double peso, String color, char consumo) {
    this.precioBase = precioBase;
    this.color = comprobarColor(color);
    this.consumo = comprobarConsumoEnergetico(consumo);
    this.peso = peso;
  }

  //precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.
  //Esta es la lista de precios:
  //LETRA PRECIO
  //A 100 €
  //B 80 €
  //C 60 €
  //D 50 €
  //E 30 €
  //F 10 €
  //TAMAÑO PRECIO
  //Entre 0 y 19 kg 10 €
  //Entre 20 y 49 kg 50 €
  //Entre 50 y 79 kg 80 €
  //Mayor que 80 kg 100 €

  public int precioFinal(){
    int precioFinal;
    precioFinal=precioBase;
    precioFinal+=consumo.getEurosExtra()*100;
    int extraPeso;
    if(peso>=0 && peso<20){
      extraPeso=1000;
    } else if(peso>=20 && peso<50) {
      extraPeso=5000;
    } else if(peso>=50 && peso<80) {
      extraPeso=8000;
    } else {
      extraPeso=10000;
    }
    return precioFinal+extraPeso;
  }

  public static void main(String[] args) {
    Electrodomestico e=new Electrodomestico(300,2,ColorElectrodomestico.BLANCO,ConsumoEnergetico.D);
    Electrodomestico n=new Electrodomestico(400,4,ColorElectrodomestico.NEGRO,'E');
  }
}

