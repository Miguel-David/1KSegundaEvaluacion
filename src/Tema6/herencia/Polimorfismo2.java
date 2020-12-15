package Tema6.herencia;

public class Polimorfismo2 {
  public static void main(String[] args) {
    MedioTransporte[] medios=new MedioTransporte[6];
    medios[0]=new Tanque("Shepard",76);
    medios[1]=new Tanque("Panzerkampfwagen IV",75);
    medios[2]=new Coche("Testarrosa",300,"Ferrari");
    medios[3]=new Coche("Panda",100,"SEAT");
    medios[4]=new Coche("600",250,"SEAT");
    medios[5]=new Coche("Murciélago",350,"Lamborghini");
    for (MedioTransporte m:medios) {
      System.out.println(m.daInformacion());
    }
  }
}
class MedioTransporte{
  String nombre;
  int velocidadMaxima;
  String daInformacion(){
    return "El "+nombre+" va a "+velocidadMaxima+" km/h";
  }
  MedioTransporte(String nombre,int velocidadMaxima){
    this.nombre=nombre;
    this.velocidadMaxima=velocidadMaxima;
  }
}
class MedioTerrestre extends MedioTransporte{
  MedioTerrestre(String nombre,int velocidadMaxima){
    super(nombre, velocidadMaxima);
  }
  String daInformacion(){
    return super.daInformacion()+" va por tierra ";
  }
}

class Coche extends MedioTerrestre{
  String marca;
  Coche(String nombre,int velocidadMaxima,String marca){
    super(nombre, velocidadMaxima);
    this.marca=marca;
  }
  String tocarClaxon(){
    return "MEC MEC";
  }
  String daInformacion(){
    return super.daInformacion()+" de Marca: "+marca;
  }
}

final class Tanque extends MedioTerrestre{
  int canyon;
  Tanque(String nombre,int canyon){
    super(nombre,60);
    this.canyon=canyon;
  }
  String disparar(){
    return "PUM PUM en "+canyon+" mm";
  }
  String daInformacion(){
    return super.daInformacion()+" dispara proyectiles de "+canyon+" mm";
  }
}
