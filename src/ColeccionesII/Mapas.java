package ColeccionesII;

import java.util.*;

public class Mapas {
  public static void main(String[] args) {
    Map<String,String> paisesCapitales=new HashMap<>();
    Map<String,Set<String>> paisesCiudades=new HashMap<>();
    paisesCiudades.put("ES",new TreeSet<>());
    paisesCiudades.put("FR",new TreeSet<>());
    paisesCiudades.get("ES").add("Barcelona");
    paisesCiudades.get("ES").add("Zaragoza");
    paisesCiudades.get("ES").add("Cartagena");
    paisesCiudades.get("ES").add("Palencia");
    paisesCiudades.get("ES").add("Valencia");
    paisesCiudades.get("FR").add("Lyon");

    Set<String> ciudades=paisesCiudades.get("ES");
    for (String s:ciudades) {
      System.out.println(s);
    }
    System.out.println("Palencia independiente");
    Set<String> ciudadesEspanya=paisesCiudades.get("ES");
    ciudadesEspanya.remove("Palencia");
    for (String s:ciudades) {
      System.out.println(s);
    }

    Map<String,Pais> paisList=new HashMap<>();
    paisList.put("ES",new Pais("ES","Madrid"));
    System.out.println(paisList.get("ES").getCapital());


    paisesCapitales.put("ES","Madrid");
    paisesCapitales.put("FR","Paris");
    paisesCapitales.put("UK","Londres");
    paisesCapitales.put("PO","Lisboa");

    System.out.println(paisesCapitales.get("UK"));
    Set<Map.Entry<String,String>> filas=paisesCapitales.entrySet();
    for (Map.Entry<String,String> pareja:filas) {
      System.out.println(pareja.getKey() + " - " + pareja.getValue());
    }
  }
}
class Pais{
  String nombre;
  String capital;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public Pais(String nombre, String capital) {
    this.nombre = nombre;
    this.capital = capital;
  }
}
