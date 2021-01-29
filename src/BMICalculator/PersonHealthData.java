package BMICalculator;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonHealthData {
  private final double weight; //Kg.
  private final int height; //cm.

  private static final NavigableMap<Double, String> grades = new TreeMap<>();

  static {
    grades.put(0.0, "Insuficient Weight");
    grades.put(18.5, "Normal Wight");
    grades.put(24.9, "Overweight Grade 1");
    grades.put(26.9, "Overweight Grade 2: Probesity");
    grades.put(29.9, "Obesity Grade 1");
    grades.put(34.9, "Obesity Grade 2");
    grades.put(39.9, "Obesity Grade 3: Morbid");
    grades.put(49.9, "Obesity Grade 4: Extreme");
  }


  public PersonHealthData(double weight, int height) {
    this.weight = weight;
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public int getHeight() {
    return height;
  }

  public double getBMI() {
    double heightMeters = height / 100.0;
    return weight / (double) (heightMeters * heightMeters);
  }

  public String getGrade() {
    Map.Entry<Double, String> gradeEntry = grades.floorEntry(getBMI());
    if (gradeEntry == null) {
      return "Incorrect Data";
    }
    return gradeEntry.getValue();
  }

}
