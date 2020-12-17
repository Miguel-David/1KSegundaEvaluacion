package Tema6.EjerciciosAulesHerencia;


//Crearemos una subclase llamada Television con las siguientes características:
public class Television extends Electrodomestico{
  public static final int RESOLUCION_MAXIMA_SIN_RECARGO = 40;
  public static final int RECARGO_TELEVISION_GRANDE = 30;
  public static final int PLUS_TDT = 50;
  //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano),
  protected final int resolucion;
  protected final boolean sintonizadorTDT;
  //Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
  protected static final int RESOLUCION_DEFECTO=20;
  protected static final boolean SINTONIZADOR_TDT_DEFECTO=false;

  /*
  Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda
que debes llamar al constructor de la clase padre.
   */

  public Television(int precioBase, double peso, ColorElectrodomestico color, ConsumoEnergetico consumo, int resolucion, boolean sintonizadorTDT) {
    super(precioBase, peso, color, consumo);
    this.resolucion = resolucion;
    this.sintonizadorTDT = sintonizadorTDT;
  }
  public Television(int precioBase, double peso){
    this(precioBase,peso,COLOR_DEFECTO,CONSUMO_DEFECTO,RESOLUCION_DEFECTO,SINTONIZADOR_TDT_DEFECTO);
  }
  public Television(){
    this(PRECIO_DEFECTO,PESO_DEFECTO);
  }
  //Método get de resolución y sintonizador TDT
  public int getResolucion() {
    return resolucion;
  }

  public boolean tieneSintonizadorTDT() {
    return sintonizadorTDT;
  }
  //precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y
  //si tiene un sintonizador TDT incorporado, aumentara 50 €.
  //(Primero el 30% y luego sumar 50)
  @Override
  public int precioFinal(){
    int precio=super.precioFinal();
    if(resolucion> RESOLUCION_MAXIMA_SIN_RECARGO){
      precio=precio*(100+ RECARGO_TELEVISION_GRANDE)/100;
    }
    if(tieneSintonizadorTDT()){
      precio+= PLUS_TDT;
    }
    return precio;
  }

}
