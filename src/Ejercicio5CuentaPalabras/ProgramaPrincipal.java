package Ejercicio5CuentaPalabras;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramaPrincipal {
  Informador informador;
  PanelEntrada panelEntrada;
  PanelSalida panelSalida;
  JFrame ventana;
  JPanel panelPrincipal;
  ProgramaPrincipal(){
    //Primer ejercicio
    //informador=new CopiaPega();
    //Segundo Ejercicio
    //informador=new AnyadirdorComas();
    //Tercer Ejercicio
    //informador=new Repetidas();
    //Cuarto Ejercicio
    //informador=new SinRepeticionOrdenadas();
    //Quinto ejercicio
    //informador=new ConConteo();

    ventana=new JFrame();
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    panelEntrada=new PanelEntrada(this);
    panelSalida=new PanelSalida(this);

    panelPrincipal=new JPanel(new GridLayout(0,1));

    panelPrincipal.add(panelEntrada);
    panelPrincipal.add(panelSalida);


    ventana.add(panelPrincipal);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
  }


  public static void main(String[] args) {
    ProgramaPrincipal programaPrincipal=new ProgramaPrincipal();
    Map<String,Informador> elecciones=new HashMap<>();
    elecciones.put("Copia Pega",new CopiaPega());
    elecciones.put("Anyadir con comas",new AnyadirdorComas());
    elecciones.put("Con palabras repetidas",new Repetidas());
    elecciones.put("Sin repetición y ordenado",new SinRepeticionOrdenadas());
    elecciones.put("La repanocha",new ConConteo());
    elecciones.put("MAYUS y Longitud", new Informador() {
      List<String> palabras=new ArrayList<>();
      @Override
      public void anyadeInfo(String s) {
        palabras.add(s.toUpperCase());
      }

      @Override
      public String obtenInfo() {
        String s="";
        for (String p:palabras
             ) {
          s+=p+" "+p.length()+" caracteres\n";
        }
        return s;
      }

      @Override
      public void quitarInfo(String s) {
        palabras.remove(s.toUpperCase());
      }
    });
    elecciones.put("Con lista para borrar",new Conlista());

    String elegida=(String) JOptionPane.showInputDialog(null,"Elige uno","Comportamiento",JOptionPane.WARNING_MESSAGE,
            null,elecciones.keySet().toArray(),elecciones.keySet().toArray()[0]);

    programaPrincipal.informador=elecciones.get(elegida);
    programaPrincipal.ventana.setVisible(true);
  }

  public void pulsadoBoton() {
    informador.anyadeInfo(panelEntrada.getInfo());
    panelSalida.anyadeInfo(informador.obtenInfo());
  }

  public void borrar() {
    informador.quitarInfo(panelEntrada.getInfo());
    panelSalida.anyadeInfo(informador.obtenInfo());
  }
}
