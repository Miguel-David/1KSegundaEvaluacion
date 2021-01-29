package CFGS;

import java.util.Objects;

public class Modulo {
  private final String nombre;

  public Modulo(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Modulo modulo = (Modulo) o;
    return nombre.equals(modulo.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }
}
