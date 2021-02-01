package FilmCollection;

import java.util.Objects;

public class Film {
  private final String title;
  private final int year;
  private final String genre;
  private double imdbScore;
  private final String storyline;

  public Film(String title, int year, String genre, double imdbScore, String storyline) {
    this.title = title;
    this.year = year;
    this.genre = genre;
    this.imdbScore = imdbScore;
    this.storyline = storyline;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public String getGenre() {
    return genre;
  }

  public double getImdbScore() {
    return imdbScore;
  }

  public void setImdbScore(double imdbScore) {
    this.imdbScore = imdbScore;
  }

  public String getStoryline() {
    return storyline;
  }

  @Override
  public String toString() {
    return "Film{" +
            "title='" + title + '\'' +
            ", year=" + year +
            ", genre='" + genre + '\'' +
            ", imdbScore=" + imdbScore +
            ", storyline='" + storyline + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Film film = (Film) o;
    return year == film.year &&
            title.equals(film.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, year);
  }
}
