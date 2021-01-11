package RepasoHerencia;

public class Tableta extends DispositivoInteligente{
  public Tableta(String marcaModelo, String IMEI, String numeroTelefono, int amperajeBateria, double tamanyoPantalla, String SO) {
    super(marcaModelo, IMEI, numeroTelefono, amperajeBateria, tamanyoPantalla, SO);
  }

  @Override
  public String info() {
    return "TABLETA:"+super.info();
  }
}
