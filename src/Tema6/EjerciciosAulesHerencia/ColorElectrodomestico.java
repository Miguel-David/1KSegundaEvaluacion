package Tema6.EjerciciosAulesHerencia;

public enum ColorElectrodomestico {
  BLANCO("#FFFFFF"),
  PLATA("#D3D3D3"),
  NEGRO("#000000"),
  ROJO("#FF0000"),
  AZUL("#0000FF");

  private final String colorCSS;

  ColorElectrodomestico(String colorCSS) {
    this.colorCSS = colorCSS;
  }

  public String getColorCSS() {
    return colorCSS;
  }
}
