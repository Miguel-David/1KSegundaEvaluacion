package Tema6.EjemplosEnum;

public enum TransformadoresCadenas {
  //Dejo el primero implementando la interfaz
  PASA_MAYUSCULAS(new Cambiador() {
    @Override
    public String cambiar(String original) {
      return original.toUpperCase();
    }
  }),
  COGE_TRES_PRIMEROS(cadena->cadena.substring(0,3)),
  PARRIBA_PABAJO(cadena->{
    String salida="";
    for (int i = 0; i < cadena.length(); i++) {
      String letra=""+cadena.charAt(i);
      if(i%2==0){
        letra=letra.toUpperCase();
      } else {
        letra=letra.toLowerCase();
      }
      salida+=letra;
    }
    return salida;
  });

  Cambiador c;

  TransformadoresCadenas(Cambiador c) {
    this.c=c;
  }
  public String actua(String cadena){
    return c.cambiar(cadena);
  }
}
