package Tema6.herencia;

public class Polimorfismo4 {
}
abstract class Instrumento{
  String interprete;
  String tipo;
  Instrumento(String interprete,String tipo){
    this.interprete=interprete;
    this.tipo=tipo;
  }
  abstract String tocar();
}
class GuitarraAcompanyamiento extends Instrumento{
  GuitarraAcompanyamiento(String guitarrista,String tipoGuitarra){
    super(guitarrista,tipoGuitarra);
  }
  String tocar(){
    return interprete+" Hace PRUM PRUM PRUM";
  }
}
class GuitarraSolista extends Instrumento{
  GuitarraSolista(String guitarrista,String tipoGuitarra){
    super(guitarrista,tipoGuitarra);
  }
  String tocar(){
    return interprete+" Hace TIRIRI TIRIRI";
  }
}
class Bajo extends Instrumento{
  Bajo(String bajista,String tipoBajo){
    super(bajista,tipoBajo);
  }
  String tocar(){
    return interprete+" Hace DONG DONG DONG";
  }
}