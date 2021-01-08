package Tema6.EjemplosEnum;

public enum ProvinciaCV {

  ALICANTE("Alicante","A","Arroz Negre"),
  VALENCIA("Valencia","V","Paella"),
  CASTELLON("Castellón","CA","Cochinillo");

  private final String nombre;
  private final String nombreCorto;
  private final String comidaTipica;

  ProvinciaCV(String provincia, String nombreCorto, String comidaTipica) {
    this.nombre =provincia;
    this.nombreCorto=nombreCorto;
    this.comidaTipica=comidaTipica;
  }

  public String getNombre() {
    return nombre;
  }

  public String getNombreCorto() {
    return nombreCorto;
  }

  public String getComidaTipica() {
    return comidaTipica;
  }
}

