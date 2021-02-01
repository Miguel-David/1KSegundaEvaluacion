package FilmCollection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FilmPanel extends JPanel {
  private Film film;
  private final JTextField title;
  private final JTextField year;
  private final JTextField genre;
  private final JTextField imdbScore;
  private final JTextArea storyline;
  public FilmPanel(){
    title=new JTextField(20);
    year=new JTextField(5);
    genre=new JTextField(20);
    imdbScore=new JTextField(5);
    storyline=new JTextArea(2,20);
    initialize();
  }
  public void setParaActualizar(){
    title.setEditable(false);
    year.setEditable(false);
  }
  public void setParaInsertar(){
    title.setEditable(true);
    year.setEditable(true);
    vaciar();
  }
  public void setFilm(Film film){
    this.film=film;
    showFilm();
  }
  public Film getFilm(){
    Film newFilm=new Film(
            title.getText(),
            Integer.parseInt(year.getText()),
            genre.getText(),
            Double.parseDouble(imdbScore.getText()),
            storyline.getText()
    );
    return newFilm;
  }

  private void showFilm() {
    title.setText(film.getTitle());
    year.setText(""+film.getYear());
    genre.setText(film.getGenre());
    imdbScore.setText(""+film.getImdbScore());
    storyline.setText(film.getStoryline());
  }

  private void vaciar(){
    title.setText("");
    year.setText("");
    genre.setText("");
    imdbScore.setText("");
    storyline.setText("");
  }

  private void initialize() {
    setLayout(new GridLayout(0,2));
    setBorder(new EmptyBorder(10,10,10,10));
    JLabel titleLabel=new JLabel("Title:");
    titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
    add(titleLabel);
    add(title);
    JLabel yearLabel=new JLabel("Year:");
    yearLabel.setHorizontalAlignment(SwingConstants.LEFT);
    add(yearLabel);
    add(year);
    JLabel genreLabel=new JLabel("Genre:");
    genreLabel.setHorizontalAlignment(SwingConstants.LEFT);
    add(genreLabel);
    add(genre);
    JLabel scoreLabel=new JLabel("IMDB Score:");
    scoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
    add(scoreLabel);
    add(imdbScore);
    JLabel storyLabel=new JLabel("Storyline:");
    storyLabel.setHorizontalAlignment(SwingConstants.LEFT);
    add(storyLabel);
    storyline.setLineWrap(true);
    add(storyline);
  }

  public static void main(String[] args) {
    JFrame ventana=new JFrame("Film");
    FilmPanel filmPanel=new FilmPanel();
    Film film1=new Film("Godzilla",1956,"Action",6.5,"When American reporter Steve Martin investigates a series of mysterious disasters off the coast of Japan, he comes face to face with an ancient creature so powerful and so terrifying, it can reduce Tokyo to a smoldering graveyard. Nuclear weapon testing resurrected this relic from the Jurassic age, and now it's rampaging across Japan. At night, Godzilla wades through Tokyo leaving death and destruction in his wake, disappearing into Tokyo Bay when his rage subsides. Coventional weapons are useless against him; but renowned scientist Dr. Serizawa has discovered a weapon that could destroy all life in the bay -- including Godzilla. But which disaster is worse, Godzilla's fury, or the death of Tokyo Bay?");
    filmPanel.setFilm(film1);
    ventana.setLayout(new GridLayout(2,0));
    ventana.add(filmPanel);

    JButton boton=new JButton("Obtén Peli");
    boton.addActionListener(e->System.out.println(filmPanel.getFilm()));
    ventana.add(boton);
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(true);
    ventana.setVisible(true);
  }
}
