package ColeccionesII;

import java.util.*;

public class Conjunto {
  public static void main(String[] args) {
    Set<Persona> elcheFemenino=new TreeSet<>();
    elcheFemenino.add(new Persona("Anita","Ana",23,"López"));
    elcheFemenino.add(new Persona("Bea","Bea",34,"López"));
    elcheFemenino.add(new Persona("Clara","Clarita",56,"Gutiérrez"));
    elcheFemenino.add(new Persona("Dely","Delia",19,"Sánchez"));
    elcheFemenino.add(new Persona("Dely","Delia",19,"Sánchez"));
    if(!elcheFemenino.add(new Persona("Dely", "Diana", 21, "Sánchez"))){
      System.out.println("El apodo está cogido");
    }

    elcheFemenino.forEach(System.out::println);
  }
}
class Persona implements Comparable{
  String apodo;
  String nombre;
  int edad;
  String apellido;

  public Persona(String apodo, String nombre, int edad, String apellido) {
    this.apodo = apodo;
    this.nombre = nombre;
    this.edad = edad;
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return apellido+", "+nombre+"("+apodo+") tiene "+edad+" años";
  }

  public String getApodo() {
    return apodo;
  }

  public void setApodo(String apodo) {
    this.apodo = apodo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Persona persona = (Persona) o;
    return Objects.equals(apodo, persona.apodo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apodo);
  }

  @Override
  public int compareTo(Object o) {
    Persona otra=(Persona) o;
    if(this.apodo.equals(((Persona) o).apodo)) return 0;
    return this.apellido.compareTo(otra.apellido);
  }
}
