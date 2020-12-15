package Tema6.herencia;

public class Herencia1 {

  public static void main(String[] args) {
    Medico medico=new Medico("Ana");
    Cirujano cirujano=new Cirujano("Bea");
    System.out.println("Tenemos como médico a:"+medico.getNombre()+"  "+medico.getCodigo());
    System.out.println("Tenemos como cirujano a:"+cirujano.getNombre()+"  "+cirujano.getCodigo());
    cirujano.setEspecialidad("Apéndice");
    System.out.println("Tenemos como cirujano a:"+cirujano.getNombre()+"  "+cirujano.getCodigo());
  }

}

class Medico{
  private String nombre;
  private final String codigo;
  private static int codigoActual=0;
  private String especialidad;

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public Medico(String nombre) {
    this.nombre = nombre;
    this.codigo = ""+codigoActual++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCodigo() {
    return (especialidad==null?"Sin especialidad":"ESP:"+especialidad)+"  "+codigo+"-MED";
  }

  public String toString() {
    return "Medico{" +
            "nombre='" + nombre + '\'' +
            ", codigo='" + codigo + '\'' +
            '}';
  }
}

class Cirujano extends Medico{
  Cirujano(String nombre){
    super(nombre);
  }

  public String getCodigo() {
    String codigoSuper=super.getCodigo();
    String codigoCirujano=codigoSuper.substring(0,codigoSuper.length()-4)+"-CIR";
    return codigoCirujano;
  }
}

class Cabecera extends Medico{
  Cabecera(String nombre){
    super(nombre);
  }
}
