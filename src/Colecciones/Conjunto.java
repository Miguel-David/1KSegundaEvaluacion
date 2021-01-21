package Colecciones;

import java.util.*;

public class Conjunto {
  public static void main(String[] args) {
    Set<String> nombres=new HashSet<>();
    nombres.add("Ana");
    nombres.add("Ana");
    nombres.add("Ana");
    nombres.add("AnA");
    System.out.println(nombres.size());
    Set<String> agenda=new TreeSet<>();
    agenda.add("Delia");
    agenda.add("Clara");
    agenda.add("Elena");
    agenda.add("Bea");
    agenda.add("Clara");
    agenda.add("Clara");
    agenda.add("Clara");
    agenda.add("Clara");
    agenda.add("Clara");
    agenda.add("Clara");
    agenda.add("Ana");
    for (String s:agenda
         ) {
      System.out.println(s);
    }
  }
}