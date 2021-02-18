package EjemplosColecciones;

import java.util.*;

public class RepasoConjuntos {
  public static void main(String[] args) {
    //Tienen dos propiedades importantes: No tienen duplicados
    //No tienen numero de orden
    //HashSet para comprobar si está rápidísimamente
    List<String> palabrasUnicas=new ArrayList<>();
    anyadeUnico(palabrasUnicas,"Ana");
    anyadeUnico(palabrasUnicas,"Ana");
    System.out.println(palabrasUnicas.size());
    Set<String> palabrasUnicasRapido=new HashSet<>();
    palabrasUnicasRapido.add("Ana");
    palabrasUnicasRapido.add("Ana");
    palabrasUnicasRapido.add("Ana");
    palabrasUnicasRapido.add("Ana");
    palabrasUnicasRapido.add("Ana");
    palabrasUnicasRapido.add("Ana");
    System.out.println(palabrasUnicasRapido.size());
    //No tiene get()
    // No tiene sentido for (int i = 0; i < ; i++) {
    //Si queremos no tanta rapidez para insertar pero que sea muy rápido
    //para obtenerlo ordenado
    Set<String> palabrasOrdenadas=new TreeSet<>();
    //Se usa igual que el anterior

  }

  private static void anyadeUnico(List<String> palabrasUnicas, String palabra) {
    if(!palabrasUnicas.contains(palabra)){
      palabrasUnicas.add(palabra);
    }
  }
}
