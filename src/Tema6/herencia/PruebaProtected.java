package Tema6.herencia;

public class PruebaProtected {

}
class PrendaRopa{
  protected int precio;
  private final String nombre;
  private final String marca;

  public PrendaRopa(int precio, String nombre, String marca) {
    this.precio = precio;
    this.nombre = nombre;
    this.marca = marca;
  }

  public int getPrecio() {
    return precio;
  }


  public String getNombre() {
    return nombre;
  }

  public String getMarca() {
    return marca;
  }

  @Override
  public String toString() {
    return "PrendaRopa{" +
            "precio=" + precio +
            ", nombre='" + nombre + '\'' +
            ", marca='" + marca + '\'' +
            '}';
  }
}

class PrendaContrabando extends PrendaRopa{
  public PrendaContrabando(int precio, String nombre, String marca) {
    super(precio, nombre, marca);
  }

  public void regatear(){
    precio=precio/2;
  }
}


