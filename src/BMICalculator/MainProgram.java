package BMICalculator;

import javax.swing.*;
import java.awt.*;

public class MainProgram {
  private final JFrame window;
  private final EntryPanel dataEntry;
  private final ResultPanel results;

  MainProgram() {
    window = new JFrame("BMI CAlculator");
    window.setLayout(new GridLayout(0, 1));
    dataEntry = new EntryPanel(this);
    window.add(dataEntry.getPanel());

    results = new ResultPanel();
    window.add(results.getPanel());

    window.pack();
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
  }

  public void show() {
    window.setVisible(true);
  }

  public static void main(String[] args) {
    MainProgram mainProgram;
    mainProgram = new MainProgram();
    mainProgram.show();

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
