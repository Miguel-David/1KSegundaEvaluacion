package SwingInicios;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Data {
  private final int peso;
  private final int altura;

  private static final NavigableMap<Double, String> grades = new TreeMap<>();
  static {
    grades.put(18.5,"Insuficient Weight");
    grades.put(24.9,"Normal Wight");
    grades.put(26.9,"Overweight Grade 1");
    grades.put(29.9,"Overweight Grade 2: Probesity");
    grades.put(34.1,"Obesity Grade 1");
    grades.put(39.9,"Obesity Grade 2");
    grades.put(49.9,"Obesity Grade 3: Morbid");
    grades.put(50.0,"Obesity Grade 4: Extreme");
  }

  Data(int peso, int altura){
    this.peso=peso;
    this.altura=altura;

  }
  public double getIMC(){
    double alturaMetros=altura/100.0;
    return peso/(double)(alturaMetros*alturaMetros);
  }
  public String getGrade(){
    Map.Entry<Double, String> letterGrade = grades.floorEntry(getIMC());
    return letterGrade.getValue();
  }

}
