package CFGS;

public class ESPersona {
  public static String alumnoHTML(Alumno a){
    String salida="<html><h1>Alumno</h1><pre style='font-size:24pt;color:#444;'>";
    salida+="<br>NIA:       " +a.getID();
    salida+="<br>NOMBRE:    "+a.getNombre();
    salida+="<br>APELLIDOS: "+a.getApellidos();
    return salida+"</pre></html>";
  }
}
