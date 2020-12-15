package Tema6.herencia;

public class Polimorfismo {
  public static void main(String[] args) {
    Animal[] protectora=new Animal[4];
    protectora[0]=new Perro("Tobi",5);
    protectora[1]=new Gato("Misifú",2);
    protectora[2]=new Perro("Jack",5);
    protectora[3]=new Perro("Rex",10);
    for (Animal a:protectora) {
      System.out.println(a.getNombre()+" DICE: "+a.emiteSonido());
    }
  }
}
class Animal{
  private final String nombre;
  private int peso;
  public String getNombre(){
    return nombre;
  }

  Animal(String nombre,int peso){
    this.nombre=nombre;
    this.peso=peso;
  }
  String emiteSonido(){
    return "SONIDO INDEFINIDO";
  }
}
class Perro extends Animal{
  Perro(String nombre,int peso){
    super(nombre,peso);
  }
  String emiteSonido(){
    return "GUAU GUAU";
  }
}
class Gato extends Animal{
  Gato(String nombre,int peso){
    super(nombre,peso);
  }
  String emiteSonido(){
    return "MIAU MIAU";
  }
}