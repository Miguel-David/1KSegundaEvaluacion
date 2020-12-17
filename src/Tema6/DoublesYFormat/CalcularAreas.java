package Tema6.DoublesYFormat;

public class CalcularAreas {
  public static void main(String[] args) {
    Figura[] dibujo={
            new Circulo(3),
            new Circulo(7),
            new Circulo(2),
            new Circulo(9),
            new Cuadrado(2),
            new Cuadrado(1),
            new Cuadrado(9),
            new Cuadrado(2),
    };
    String mensaje="";
    for (Figura f:dibujo) {
      mensaje+="Un ";
      mensaje+=f instanceof Circulo?" Círculo ":" Cuadrado ";
      if(f instanceof Circulo){
        Circulo esUnCirculo=(Circulo) f;
        mensaje+=" de radio "+esUnCirculo.getRadio();
      }
      if(f instanceof Cuadrado){
        Cuadrado seQueEsUnCuadrado=(Cuadrado) f;
        mensaje+=" de lado "+seQueEsUnCuadrado.getLado();
      }
      mensaje+=" tiene de área: ";
      double area=f.getArea();


      mensaje+=String.format("%.4f %s",area,"Metros cuadrados ");



      mensaje+="\n";
    }
    System.out.println(mensaje);
  }
}
