package Tema6.herencia;

public class Polimorfismo3 {
  public static void main(String[] args) {
    Poligono[] poligonos=new Poligono[4];
    poligonos[0]=new Cuadrado(4);
    poligonos[1]=new Rombo(5);
    poligonos[2]=new Triangulo(3);
    poligonos[3]=new Rombo(7);
    for (Poligono p:poligonos) {
      System.out.println(p.pintate());
    }
    for (Poligono p:poligonos) {
      System.out.println(p.nombre + " de lado " + p.longitudLado + " Tiene perímetro: " + p.perimetro());
    }
  }
}
abstract class Poligono{
  int numeroLados;
  String nombre;
  int longitudLado;
  abstract String pintate();
  int perimetro(){
    return numeroLados*longitudLado;
  }
}
class Cuadrado extends Poligono{
  Cuadrado(int lado){
    numeroLados=4;
    nombre="Tema6.herencia.Cuadrado";
    longitudLado=lado;
  }
  String pintate(){
    return  "********\n"+
            "********\n"+
            "********\n"+
            "********\n"+
            "********\n"+
            "********\n";
  }
}
class Rombo extends Poligono{
  Rombo(int lado){
    numeroLados=4;
    nombre="Tema6.herencia.Rombo";
    longitudLado=lado;
  }
  String pintate(){
    return  "   *\n"+
            "  ***\n"+
            " *****\n"+
            "*******\n"+
            " *****\n"+
            "  ***\n"+
            "   *\n";
  }
}
class Triangulo extends Poligono{
  Triangulo(int lado){
    numeroLados=3;
    nombre="TRIÁNGULO";
    longitudLado=lado;
  }
  String pintate() {
    return  "    *\n"+
            "   **\n"+
            "  ***\n"+
            " ****\n";
  }
}
