package Tema6.DialogosUsuario;

public class Contacto {
  String nombre;
  String telefono;

  public Contacto(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  //NO UTILIZAR PARA SALIDA BONITA PARA EL USUARIO.
  //PENSAR EN EL TOSTRING PARA UN LOG
  @Override
  public String toString() {
    return nombre+" - "+telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public static void main(String[] args) {
    Contacto c=new Contacto("Ana","966666666");
    System.out.println(c);
  }
}
