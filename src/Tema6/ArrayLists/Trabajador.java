package Tema6.ArrayLists;

public class Trabajador {
  String nombre;
  int sueldo;
  Categoria categoria;

  public Trabajador(String nombre, int sueldo, Categoria categoria) {
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.categoria = categoria;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getSueldo() {
    return sueldo;
  }

  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  @Override
  public String toString() {
    return nombre + " Cobra: " + sueldo +
            " y categoría: " + categoria ;
  }

  public void bajaSueldo(final int bajada){
    this.sueldo-=bajada;
  }
}
