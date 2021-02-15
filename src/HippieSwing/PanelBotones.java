package HippieSwing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanelBotones extends JPanel {
  List<JButton> botonesFuente=new ArrayList<>();
  List<JButton> botonesFondo=new ArrayList<>();
  ProgramaPrincipal programaPrincipal;
  PanelBotones(ProgramaPrincipal programaPrincipal){
    setBorder(new EmptyBorder(10,10,10,10));
    setLayout(new GridLayout(2,0,5,5));
    add(new JLabel("Fuente"));
    this.programaPrincipal=programaPrincipal;

    for(Colores c:Colores.values()){
      JButton boton=new JButton(c.getNombre());
      if(c.sitio==Sitio.LETRAS) {
        botonesFuente.add(boton);
      } else {
        botonesFondo.add(boton);
      }
      boton.addActionListener(e->programaPrincipal.hanPulsadoColor(c));
    }
    for (JButton jButton : botonesFuente) {
      add(jButton);
    }
    add(new JLabel("Fondo"));
    botonesFondo.forEach(this::add);


  }


  enum Sitio{
    FONDO,
    LETRAS;
  }

  enum Colores{

    AZUL("Azul", Color.BLUE,Sitio.LETRAS),
    ROJO("Rojo",Color.RED,Sitio.LETRAS),
    VERDE("Green",Color.GREEN,Sitio.LETRAS),
    MAGENTA("magenta",Color.MAGENTA,Sitio.LETRAS),
    LILA("Lila",Color.MAGENTA,Sitio.FONDO),
    AMARILLO("Amarillo",Color.YELLOW,Sitio.FONDO),
    AÑIL("Añil",Color.BLUE,Sitio.FONDO),
    NARANJA("Naranja",Color.ORANGE,Sitio.FONDO);


    private final Color color;
    private final String nombre;
    private final Sitio sitio;

    public Color getColor() {
      return color;
    }

    public Sitio getSitio() {
      return sitio;
    }

    public String getNombre() {
      return nombre;
    }

    Colores(String nombre, Color color, Sitio sitio) {
      this.color=color;
      this.nombre=nombre;
      this.sitio=sitio;
    }
  }
  public static void main(String[] args) {
    JFrame ventana=new JFrame();
    PanelBotones panelBotones=new PanelBotones(null);

    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.add(panelBotones);
    ventana.setLocationRelativeTo(null);
    ventana.pack();
    ventana.setVisible(true);
  }
}
