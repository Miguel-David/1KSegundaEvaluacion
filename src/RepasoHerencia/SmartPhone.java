package RepasoHerencia;

public class SmartPhone extends DispositivoInteligente{
  public SmartPhone(String marcaModelo, String IMEI, String numeroTelefono, int amperajeBateria, double tamanyoPantalla,String SO) {
    super(marcaModelo, IMEI, numeroTelefono, amperajeBateria, tamanyoPantalla,SO);
  }

  @Override
  public String info() {
    return "SMARTPHONE: "+super.info();
  }
}
