package Tema6.Redes;

public enum ClasesIP {
  A(0,127,'A'),
  B(128,191,'B'),
  C(192,223,'C'),
  D(224,239,'D');

  int menor;
  int mayor;
  char nombre;

  ClasesIP(int menor, int mayor,char nombre) {
    this.menor = menor;
    this.mayor = mayor;
    this.nombre=nombre;
  }

  public char getNombre() {
    return nombre;
  }

  boolean pertenece(DireccionIP ip){
    return ip.getPrimerByte()>=menor && ip.getPrimerByte()<=mayor;
  }
}
