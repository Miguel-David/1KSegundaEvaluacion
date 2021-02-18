public class DevolverElObjeto {
  public static void main(String[] args) {
    Horno mit=new Horno("Mitsushssosd");
    mit.tieneAireCaliente();
    mit.tienePirolisis();
    mit.setBotones(5);

    Horno zanussi=new Horno("zanussi");
    zanussi
            .tienePirolisis()
            .tieneAireCaliente()
            .setBotones(5);

  }

}

//Clase Horno:
/*
  por defecto no tiene pirólisis
  por defecto tiene aire caliente
  por defecto llega a 220 grados
  por defecto tiene 4 botones
  por defecto es negro por dentro
 */

class Horno{
  String marca;
  boolean pirolisis=false;
  boolean aireCaliente=true;
  int tempMaxima=220;
  int botones=4;
  String color="negro";

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Horno tienePirolisis() {
    this.pirolisis = true;
    return this;
  }

  public Horno tieneAireCaliente() {
    this.aireCaliente = true;
    return this;
  }

  public Horno setTempMaxima(int tempMaxima) {
    this.tempMaxima = tempMaxima;
    return this;
  }

  public Horno setBotones(int botones) {
    this.botones = botones;
    return this;
  }


  public Horno setColor(String color) {
    this.color = color;
    return this;
  }

  public Horno(String marca){
    this.marca = marca;
  }

  public Horno(Horno original){
    this.aireCaliente=original.aireCaliente;
    this.botones=original.botones;
  }
}
