package Tema6.EjemplosEnum;

public class UsoValencia {
  public static void main(String[] args) {
    ProvinciaCV[] provincias=ProvinciaCV.values();
    System.out.println("Tengo " + provincias.length + " Provincias");
    System.out.println("QUE SON:");
    for (ProvinciaCV p:provincias) {
      System.out.println(p.getNombre()+ " Y su comida típica es "+p.getComidaTipica());
    }





  }
}
