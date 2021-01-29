package CFGS;

import java.util.Objects;

public class Asignatura {
  private final Modulo modulo;
  private Profesor profesor;
  private final String curso;

  public Asignatura(Modulo modulo, Profesor profesor, String curso) {
    this.modulo = modulo;
    this.profesor = profesor;
    this.curso = curso;
  }

  public Modulo getModulo() {
    return modulo;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

  public String getCurso() {
    return curso;
  }

  public String getNombre(){
    return curso+" - "+modulo.getNombre();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Asignatura that = (Asignatura) o;
    return modulo.equals(that.modulo) &&
            curso.equals(that.curso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modulo, curso);
  }
}
