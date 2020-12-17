package Tema6.EjerciciosAulesHerencia;

//Crearemos una subclase -->extends  llamada Lavadora con las siguientes características:
public class Lavadora extends Electrodomestico{
  //Su atributo es carga, ademas de los atributos heredados --> No es menester que lo digas.
  protected final int carga;

  //Por defecto, la carga es de 5 kg. Usa una constante para ello.
  private static final int CARGA_DEFECTO=5;
  //Los constructores que se implementaran serán:
  //Un constructor por defecto.
  //Un constructor con el precio y peso. El resto por defecto.
  //Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al
  //constructor de la clase padre.

  public Lavadora(int precioBase, double peso, ColorElectrodomestico color, ConsumoEnergetico consumo, int carga) {
    super(precioBase, peso, color, consumo);
    this.carga = carga;
  }

  public Lavadora(int precioBase, double peso) {
    this(precioBase,peso,COLOR_DEFECTO,CONSUMO_DEFECTO,CARGA_DEFECTO);
    //Lo mismo es
    /*
    super(precioBase,peso);
    this.carga=CARGA_DEFECTO;
    */
  }
  public Lavadora(){
    this(PRECIO_DEFECTO,PESO_DEFECTO);
  }

  public int getCarga() {
    return carga;
  }

  //precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
  // sino es así no se incrementara el precio. Llama al método padre y añade
  // el código necesario. Recuerda que las condiciones que hemos visto en la
  // clase Electrodomestico también deben afectar al precio.

  @Override
  public int precioFinal() {
    int precio=super.precioFinal();
    if(carga>30){
      precio+=5000;
    }
    return precio;
  }
}
