package RepasoColecciones;

import java.util.*;

public class NavegacionSinonimos {
  public static void main(String[] args) {
    Map<String, List<String>> palabras=new TreeMap<>();
    rellena(palabras);
    System.out.println("Tengo las siguientes claves");

    for (String s:palabras.keySet()
         ) {
      System.out.println(s);
      List<String> sinonimos=palabras.get(s);
      for (String sin:sinonimos
           ) {
        System.out.println("     "+sin);
      }
    }
  }

  private static void rellena(Map<String, List<String>> palabras) {
    palabras.put("crear",new ArrayList<>());
    palabras.get("crear").add("ingeniar");
    palabras.get("crear").addAll(Arrays.asList("originar", "imaginar", "trazar", "discurrir", "idear", "inventar", "descubrir", "concebir"));
    palabras.put("idear",new ArrayList<>());
    palabras.get("idear").addAll(Arrays.asList("imaginar","concebir","pensar","discurrir","trazar","urdir","proyectar","planear","inventar","esbozar","reflexionar","suponer","sospechar","recordar"));
  }
}

/*
crear --> ingeniar"," originar, imaginar, trazar, discurrir, idear, inventar, descubrir, concebir
idear -->imaginar, concebir, pensar, discurrir, trazar, urdir, proyectar, planear, inventar, esbozar, reflexionar, suponer, sospechar, recordar
 */