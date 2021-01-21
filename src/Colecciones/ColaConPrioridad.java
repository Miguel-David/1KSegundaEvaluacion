package Colecciones;

import java.util.Deque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColaConPrioridad {
  public static void main(String[] args) {
    Queue<Paciente> cola=new PriorityQueue<>();


    while(!cola.isEmpty()){
      System.out.println(cola.poll().getNombre());
    }
  }
}


class Paciente implements Comparable<Paciente>{
  String codigo;
  String nombre;
  Prioridad prioridad;

  public Paciente(String codigo, String nombre, Prioridad prioridad) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.prioridad = prioridad;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Prioridad getPrioridad() {
    return prioridad;
  }

  public void setPrioridad(Prioridad prioridad) {
    this.prioridad = prioridad;
  }

  @Override
  public int compareTo(Paciente o) {
    return Integer.compare(this.prioridad.getGravedad(),o.prioridad.getGravedad());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Paciente paciente = (Paciente) o;
    return codigo.equals(paciente.codigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }
}
