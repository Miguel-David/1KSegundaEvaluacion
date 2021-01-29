package CFGS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class IES {
  String nombre;
  Map<Asignatura, List<Alumno>> asignaturas;
  List<Alumno> listaAlumnos;
  /*
  Set<Alumno> listaCoolAlumnos;
  */
  List<Profesor> listaProfesores;


  public IES(String nombre,String fichero){
    this.nombre = nombre;
    asignaturas=new HashMap<>();
    listaAlumnos=new ArrayList<>();
    listaProfesores=new ArrayList<>();
    leeFichero(fichero);
  }

  private void leeFichero(String fichero) {
    try {
      List<String> lineas=Files.readAllLines(Paths.get(fichero));
      for (String linea:lineas) {
        String[] partes=linea.split(",");
        if(partes[0].equals("PROFE")){
          this.anyadeProfesor(new Profesor(partes[1],partes[2],partes[3]));
        } else {
          this.anyadeAlumno(new Alumno(partes[1],partes[2],partes[3]));
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public IES(String nombre) {
    this.nombre = nombre;
    asignaturas=new HashMap<>();
    listaAlumnos=new ArrayList<>();
    listaProfesores=new ArrayList<>();
    //listaCoolAlumnos=new HashSet<>();
  }
  public boolean anyadeAlumno(Alumno a){
    if(!listaAlumnos.contains(a)){
      listaAlumnos.add(a);
      return true;
    }
    return false;
  }
  /*
  public boolean anyadeAlumnoCool(Alumno a){
    return listaCoolAlumnos.add(a);
  }
  */
  public boolean anyadeProfesor(Profesor p){
    if(!listaProfesores.contains(p)){
      listaProfesores.add(p);
      return true;
    }
    return false;
  }
  public List<Alumno> buscaPorComienzoApellidoAlumnos(String inicio){
    List<Alumno> salida=new ArrayList<>();
    for (Alumno a:listaAlumnos) {
      if(a.getApellidos().startsWith(inicio.toUpperCase())){
        salida.add(a);
      }
    }
    return salida;
  }
  public List<Profesor> buscaPorComienzoApellidoProfesores(String inicio){
    List<Profesor> salida=new ArrayList<>();
    for (Profesor p:listaProfesores) {
      if(p.getApellidos().startsWith(inicio.toUpperCase())){
        salida.add(p);
      }
    }
    return salida;
  }

}
