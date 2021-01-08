package Tema6.EjemplosEnum;

public class TiendaElectronica {
  public static void main(String[] args) {
    ClasesDeGravador asia=new ClasesDeGravador((precio -> (int)(precio*1.6)));
    Producto producto=new Producto("Lavadora",30000,asia.getGravador());
    System.out.println(producto.info());
  }
}
