package RepasoHerencia;

import java.util.ArrayList;
import java.util.List;

public abstract class DispositivoInteligente extends DispositivoMovil{
  private final String SO;
  private final List<String> aplicacionesInstaladas;

  public DispositivoInteligente(String marcaModelo, String IMEI, String numeroTelefono, int amperajeBateria, double tamanyoPantalla, String SO) {
    super(marcaModelo,IMEI, numeroTelefono, amperajeBateria, tamanyoPantalla);
    this.SO = SO;
    this.aplicacionesInstaladas = new ArrayList<>();
  }

  public String getSO() {
    return SO;
  }

  public void anyadeAplicacion(String app){
    this.aplicacionesInstaladas.add(app);
  }
  public void desinstalaAplicacion(String app){
    this.aplicacionesInstaladas.remove(app);
  }
  public String listaAplicaciones(){
    String salida=" Aplicaciones\n ------------\n";
    for (String s:aplicacionesInstaladas) {
      salida+="\t"+s+"\n";
    };
    return salida;
  }

  @Override
  public String info(){
    String salida=super.info()+"\n";
    salida+="S.O.:"+SO+"\n";
    salida+=this.listaAplicaciones();
    return salida;
  }


}
