package Tema6.herencia;

public abstract class Operacion {
  private final String cadenaMenu;
  public Operacion(String cadenaMenu) {
    this.cadenaMenu = cadenaMenu;
  }

  @Override
  public String toString() {
    return cadenaMenu;
  }

  public abstract void pedirOperandos();
  public abstract int obtenerResultado();
  public String getcadenaMenu(){
    return cadenaMenu;
  }

}

class OperacionBinaria extends Operacion{

  int operando1;
  int operando2;
  OperableDosOperandos operacionARealizar;
  public OperacionBinaria(String cadenaMenu,OperableDosOperandos operacionARealizar) {
    super(cadenaMenu);
    this.operacionARealizar=operacionARealizar;
  }

  @Override
  public void pedirOperandos() {
    operando1= ESGeneral.leeEnteroSeguro("Primer Operando");
    operando2=ESGeneral.leeEnteroSeguro("Segundo Operando");
  }

  @Override
  public int obtenerResultado() {
    return operacionARealizar.opera(operando1,operando2);
  }
}

class OperacionUnaria extends Operacion{

  int numero;
  OperableUnOperando operableUnOperando;

  public OperacionUnaria(String cadenaMenu,OperableUnOperando operableUnOperando) {
    super(cadenaMenu);
    this.operableUnOperando=operableUnOperando;
  }

  @Override
  public void pedirOperandos() {
    numero= ESGeneral.leeEnteroSeguro("Primer Operando");

  }

  @Override
  public int obtenerResultado() {
    return operableUnOperando.opera(numero);
  }
}