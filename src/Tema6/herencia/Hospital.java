package Tema6.herencia;

public class Hospital {
  Cirujano[] cirujanos=new Cirujano[3];
  Cabecera[] cabeceras=new Cabecera[4];

  String datosTodos(){
    Medico[] medicos=new Medico[cirujanos.length+cabeceras.length];
    for (int i = 0; i < cirujanos.length; i++) {
      medicos[i]=cirujanos[i];
    }
    for (int i = 0; i < cabeceras.length; i++) {
      medicos[i+ cirujanos.length]=cabeceras[i];
    }
    ////////////////////////////////////////////
    String salida="";
    for (Medico m:medicos) {
      salida+=m.getNombre()+" "+m.getCodigo()+"\n";
    }
    return salida;
  }
  String datosCirujanos(){
    String salida="";
    for (Cirujano c:cirujanos) {
      salida+=c.getNombre()+" "+c.getCodigo()+"\n";
    }
    return salida;
  }


  public static void main(String[] args) {
    Hospital hospital=new Hospital();
    hospital.cirujanos[0]=new Cirujano("Ana");
    hospital.cirujanos[1]=new Cirujano("Bea");
    hospital.cirujanos[2]=new Cirujano("Clara");
    hospital.cabeceras[0]=new Cabecera("Wenceslao");
    hospital.cabeceras[1]=new Cabecera("Xabi");
    hospital.cabeceras[2]=new Cabecera("Yago");
    hospital.cabeceras[3]=new Cabecera("Zaca");
    System.out.println(hospital.datosTodos());
  }

}
