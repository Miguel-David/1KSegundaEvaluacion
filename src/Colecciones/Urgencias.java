package Colecciones;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Urgencias {
  public static void main(String[] args) throws IOException {
    Queue<Paciente> salaDeEspera=new PriorityQueue<>();
    List<String> lineas= Files.readAllLines(Paths.get("Pacientes.txt"));
    System.out.println(lineas.size());
    Set<Paciente> listaPacientes=new HashSet<>();
    for (String l:lineas
         ) {
      String[] partes=l.split(",");
      listaPacientes.add(new Paciente(partes[0],partes[1],Prioridad.valueOf(partes[2])));

    }
    System.out.println(listaPacientes.size());
    while(true) {
      String[] opciones = {"Esperar paciente", "Mostrar lista","Llamar a paciente","Salir"};
      int elegido = JOptionPane.showOptionDialog(null,
              "Menú principal",
              "URGENCIAS",
              JOptionPane.OK_CANCEL_OPTION,
              JOptionPane.WARNING_MESSAGE,
              null,
              opciones,
              opciones[0]);
      System.out.println(elegido);
      switch(elegido){
        case 3:return;
        case 0:String codigo=JOptionPane.showInputDialog("Codigo Paciente");
          for (Paciente p:listaPacientes) {
            if(p.getCodigo().equals(codigo)){
              JOptionPane.showMessageDialog(null,"Hola "+p.getNombre()+ "\nEres de categoría "+p.getPrioridad());
              if(!salaDeEspera.contains(p)){
                salaDeEspera.add(p);
              }
            }
          }
          break;
        case 1:String salida="";
          for (Paciente p:salaDeEspera) {
            salida+=p.getNombre()+" - "+p.getPrioridad()+"\n";
          }
          JOptionPane.showMessageDialog(null,salida);
          break;
        case 2:
          Paciente p=salaDeEspera.poll();
          String llamada="";
          llamada+="Llamando a "+p.getNombre();
          JOptionPane.showMessageDialog(null,llamada);
          break;
      }


    }
  }
}
