package Tema6.Ordenacion;

public class Alumno {
  String nombre;
  int edad;
  int notaProgramacion;
  String apellido;

  public Alumno(String nombre, int edad, int notaProgramacion, String apellido) {
    this.nombre = nombre;
    this.edad = edad;
    this.notaProgramacion = notaProgramacion;
    this.apellido=apellido;
  }

  @Override
  public String toString() {
    return apellido+", "+nombre + "-"+edad +"años Nota: "+ notaProgramacion+"\n";
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

  public int getNotaProgramacion() {
    return notaProgramacion;
  }

  public void setNotaProgramacion(int notaProgramacion) {
    this.notaProgramacion = notaProgramacion;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
}
