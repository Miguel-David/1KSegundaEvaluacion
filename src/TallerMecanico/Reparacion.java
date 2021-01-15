package TallerMecanico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reparacion {

  private final String descripcion;
  private final int precio; //Precio en céntimos
  private final String fecha;

  public Reparacion(String descripcion, int precio) {
    this(descripcion,precio,obtenerFechaYHoraActual());
  }

  public Reparacion(String descripcion, int precio,String fecha) {
    this.descripcion = descripcion;
    this.precio = precio;
    this.fecha=fecha;
  }

  public String info(){
    String salida="";
    salida+=fecha+" "+descripcion+" "+precio/100+","+precio%100;
    return salida;
  }

  @Override
  public String toString() {
    return "Reparacion{" +
            "descripcion='" + descripcion + '\'' +
            ", precio=" + precio +
            ", fecha='" + fecha + '\'' +
            '}';
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getPrecio() {
    return precio;
  }

  public String getFecha() {
    return fecha;
  }

  private static String obtenerFechaYHoraActual() {
    String formato = "E d L yyyy HH:mm";
    DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
    LocalDateTime ahora = LocalDateTime.now();
    return formateador.format(ahora);
  }
}
