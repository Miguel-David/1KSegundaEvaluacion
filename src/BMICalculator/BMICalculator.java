package BMICalculator;

import javax.swing.*;
import java.awt.*;

public class BMICalculator {
  private final JPanel window;
  private final EntryPanel2 dataEntry;
  private final ResultPanel results;

  BMICalculator() {
    window = new JPanel();
    window.setLayout(new GridLayout(0, 1));
    dataEntry = new EntryPanel2(this);
    window.add(dataEntry.getPanel());

    results = new ResultPanel();
    window.add(results.getPanel());


  }

  public JPanel getWindow() {
    return window;
  }

  public void action() {
    double weight;
    try {
      weight = Double.parseDouble(dataEntry.getStringWeight());
    } catch (NumberFormatException e) {
      results.error("Weight input is not a number");
      return;
    }

    int height;
    try {
      height = Integer.parseInt(dataEntry.getStringHeight());
    } catch (NumberFormatException e) {
      results.error("Height input is not a number");
      return;
    }
    PersonHealthData data = new PersonHealthData(weight, height);
    results.setResults(String.format("Your BMI is: %.2f", data.getBMI()), data.getGrade());

  }
}
