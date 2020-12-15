package Tema6.herencia;

import java.util.Objects;

public class Persona {
  String Nombre;
  String codigoinutil;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Persona persona = (Persona) o;
    return Nombre.equals(persona.Nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Nombre);
  }

  public Persona(String nombre, String codigoinutil) {

    Nombre = nombre;
    codigoinutil=codigoinutil;
  }

  @Override
  public String toString() {
    return "Persona{" +
            "Nombre='" + Nombre + '\'' +
            ", codigoinutil='" + codigoinutil + '\'' +
            '}';
  }

  public String getCodigoinutil() {
    return codigoinutil;
  }

  public void setCodigoinutil(String codigoinutil) {
    this.codigoinutil = codigoinutil;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    Nombre = nombre;
  }
}
