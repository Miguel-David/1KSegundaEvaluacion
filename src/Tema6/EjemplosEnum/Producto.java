package Tema6.EjemplosEnum;

public class Producto {
  String nombre;
  int precio;
  Gravador gravador;

  public Producto(String nombre, int precio, Gravador gravador) {
    this.nombre = nombre;
    this.precio = precio;
    this.gravador=gravador;
  }

  public String info(){
    return nombre+" Precio: "+precio/100+"."+precio%100+" € con impuestos:"
            +getPrecioDespuesImpuestos()/100+"."+getPrecioDespuesImpuestos()%100;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public int getPrecioDespuesImpuestos(){
    return gravador.grava(precio);
  }
}
