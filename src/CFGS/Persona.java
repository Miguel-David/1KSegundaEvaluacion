package CFGS;

import java.util.Objects;

public abstract class Persona {
  private String nombre;
  private String apellidos;

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre.toUpperCase();
    this.apellidos = apellidos.toUpperCase();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public abstract String getID();
}

class Profesor extends Persona{
  private final String NIF;

  public String getNIF() {
    return NIF;
  }

  public Profesor(String nombre, String apellidos, String NIF) {
    super(nombre, apellidos);
    this.NIF = NIF;
  }

  @Override
  public String getID() {
    return NIF;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Profesor profesor = (Profesor) o;
    return NIF.equals(profesor.NIF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF);
  }
}

class Alumno extends Persona{

  private final String NIA;

  public Alumno(String nombre, String apellidos, String NIA) {
    super(nombre, apellidos);
    this.NIA = NIA;
  }

  @Override
  public String getID() {
    return NIA;
  }
}
