package FilmCollection;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cartelereision {
  static int peliActual=0;
  static FilmPanel filmPanel=new FilmPanel();
  static List<Film> cartelera=new ArrayList<>();
  static JButton botonAnterior=new JButton("<");
  static JButton botonSiguiente=new JButton(">");
  static JButton botonActualizar=new JButton("Actualizame");
  static JButton botonBorrar=new JButton("Borrame");
  static JButton botonGuardar=new JButton("Guardar");
  public static void main(String[] args) {

    cartelera.add(new Film("Godzilla",1956,"Action",6.5,"When American reporter Steve Martin investigates a series of mysterious disasters off the coast of Japan, he comes face to face with an ancient creature so powerful and so terrifying, it can reduce Tokyo to a smoldering graveyard. Nuclear weapon testing resurrected this relic from the Jurassic age, and now it's rampaging across Japan. At night, Godzilla wades through Tokyo leaving death and destruction in his wake, disappearing into Tokyo Bay when his rage subsides. Coventional weapons are useless against him; but renowned scientist Dr. Serizawa has discovered a weapon that could destroy all life in the bay -- including Godzilla. But which disaster is worse, Godzilla's fury, or the death of Tokyo Bay?"));
    cartelera.add(new Film("El caballero oscuro",2008,"Action",9,"When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
    cartelera.add(new Film("Sonic. La película",2020,"Terror",6.5,"After discovering a small, blue, fast hedgehog, a small-town police officer must help him defeat an evil genius who wants to do experiments on him."));
    JFrame ventana=new JFrame("Lista de peliculas");

    ventana.setLayout(new GridLayout(0,1));
    ventana.add(filmPanel);

    JPanel panelBotones=new JPanel();



    panelBotones.add(botonAnterior);
    panelBotones.add(botonActualizar);
    panelBotones.add(botonBorrar);
    panelBotones.add(botonGuardar);
    panelBotones.add(botonSiguiente);


    ventana.add(panelBotones);

    botonSiguiente.addActionListener(e->siguientePelicula());
    botonAnterior.addActionListener(e->anteriorPelicula());
    botonActualizar.addActionListener(e->actualizarPelicula());
    botonBorrar.addActionListener(e->borrarPelicula());
    botonGuardar.addActionListener(e->guardarPelicula());

    filmPanel.setFilm(cartelera.get(peliActual));
    filmPanel.setParaActualizar();

    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(true);
    ventana.setVisible(true);

  }

  private static void guardarPelicula() {
    cartelera.add(filmPanel.getFilm());
    peliActual=cartelera.size()-1;
    filmPanel.setFilm(cartelera.get(peliActual));
    filmPanel.setParaActualizar();
  }

  private static void borrarPelicula() {
    cartelera.remove(filmPanel.getFilm());
    peliActual=0;
    filmPanel.setFilm(cartelera.get(peliActual));
  }

  private static void actualizarPelicula() {
    cartelera.set(peliActual, filmPanel.getFilm());
  }

  private static void anteriorPelicula() {
    if(peliActual==0){
      return;
    }
    peliActual--;

    filmPanel.setFilm(cartelera.get(peliActual));
    filmPanel.setParaActualizar();
  }

  private static void siguientePelicula() {
    botonAnterior.setEnabled(true);
    if(peliActual==cartelera.size()-1){
      filmPanel.setParaInsertar();

      return;
    }
    peliActual++;
    filmPanel.setFilm(cartelera.get(peliActual));
    filmPanel.setParaActualizar();
  }
}
