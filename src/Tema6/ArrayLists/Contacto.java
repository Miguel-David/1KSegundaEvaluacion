package Tema6.ArrayLists;

public class Contacto {
  String nombre;
  String numeroTelefono;

  public Contacto(String nombre, String numeroTelefono) {
    this.nombre = nombre;
    this.numeroTelefono = numeroTelefono;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNumeroTelefono() {
    return numeroTelefono;
  }

  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }

  @Override
  public String toString() {
    return nombre.toUpperCase()+" - "+numeroTelefono;
  }
}
