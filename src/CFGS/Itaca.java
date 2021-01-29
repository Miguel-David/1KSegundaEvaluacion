package CFGS;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Itaca {
  public static void main(String[] args) {
    IES severo=new IES("Severo Ochoa","severo.csv");
    Map<String,ElementoMenu> menu=new TreeMap<>();
    menu.put("Buscar Alumno", ies -> buscarAlumno(severo));
    menu.put("Salir", ies -> System.exit(0));
    String[] opciones=menu.keySet().toArray(new String[0]);
    while(true){
      int eleccion=JOptionPane.showOptionDialog(null,"ITACA IES SEVERO OCHOA","ITACA",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE,null,opciones,opciones[0]);
      menu.get(opciones[eleccion]).ejecutate(severo);
    }
  }
  public static void buscarAlumno(IES ies){
    String comienzo=JOptionPane.showInputDialog("Introduce el comienzo");
    List<Alumno> resultado=ies.buscaPorComienzoApellidoAlumnos(comienzo);
    if(resultado.isEmpty()){
      JOptionPane.showMessageDialog(null,"NO HAY ALUMNOS COINCIDENTES");
      return;
    }
    if(resultado.size()==1){
      JOptionPane.showMessageDialog(null,ESPersona.alumnoHTML(resultado.get(0)));
      return;
    }
    String[] nombres=new String[resultado.size()];
    Map<String,Alumno> posibles=new TreeMap<>();
    for (Alumno a:resultado) {
      posibles.put(a.getApellidos()+", "+a.getNombre(),a);
    }
    String elegido=(String)JOptionPane.showInputDialog(null,
            "VARIOS ALUMNOS, ELIJE UNO",
            "RESULTADO BÚSQUEDA",
            JOptionPane.QUESTION_MESSAGE,
            null,posibles.keySet().toArray(),
            posibles.keySet().toArray()[0]);
    JOptionPane.showMessageDialog(null,ESPersona.alumnoHTML(posibles.get(elegido)));
  }
}
