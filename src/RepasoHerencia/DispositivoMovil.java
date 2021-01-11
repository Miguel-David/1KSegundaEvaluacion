package RepasoHerencia;

import java.lang.reflect.AnnotatedArrayType;

public class DispositivoMovil {
  private final String marcaModelo;

  private final String IMEI;
  private String numeroTelefono;
  private final int amperajeBateria;
  private final double tamanyoPantalla;

  public DispositivoMovil(String marcaModelo,String IMEI, String numeroTelefono, int amperajeBateria, double tamanyoPantalla) {
    this.marcaModelo=marcaModelo;
    this.IMEI = IMEI;
    this.numeroTelefono = numeroTelefono;
    this.amperajeBateria = amperajeBateria;
    this.tamanyoPantalla = tamanyoPantalla;
  }

  public String info(){
    String salida="";
    salida+=marcaModelo+" IMEI:"+IMEI+" - "+numeroTelefono+"\n";
    salida+=amperajeBateria+" mAh "+getDuracionBateria()+" "+tamanyoPantalla+"\"";
    return salida;
  }

  public String getIMEI() {
    return IMEI;
  }

  public String getNumeroTelefono() {
    return numeroTelefono;
  }

  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }

  public int getAmperajeBateria() {
    return amperajeBateria;
  }

  public double getTamanyoPantalla() {
    return tamanyoPantalla;
  }

  String getDuracionBateria(){
    if(amperajeBateria<2000){
      return "Una hora jugando";
    }
    if(amperajeBateria<4000){
      return "Un día entero";
    }
    return "Semanas y semanas";
  }
}
/*
abstract class Persona{
  String nombre;
  String apellidos;

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }
}

class Profesor extends Persona{

  public Profesor(String nombre, String apellidos) {
    super(nombre, apellidos);
  }
}

class Estudiante extends Persona{

  public Estudiante(String nombre, String apellidos) {
    super(nombre, apellidos);
  }
}

 */
/*
abstract class Animal{
  public abstract String emiteSonido();
}

class Perro extends Animal{

  @Override
  public String emiteSonido() {
    return "GUAU";
  }
}
*/