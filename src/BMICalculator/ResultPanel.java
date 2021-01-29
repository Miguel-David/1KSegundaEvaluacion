package BMICalculator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ResultPanel {

  private final JPanel panel;
  private final JLabel BMI;
  private final JLabel information;

  ResultPanel() {
    panel = new JPanel();
    panel.setLayout(new GridLayout(0, 1, 10, 10));
    panel.setBorder(new EmptyBorder(10, 10, 10, 10));
    BMI = new JLabel("Enter your weight and height in centimeters.");
    BMI.setHorizontalAlignment(SwingConstants.CENTER);
    information = new JLabel("");
    information.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(BMI);
    panel.add(information);
  }

  public JPanel getPanel() {
    return panel;
  }

  public void setResults(String IMC, String information) {
    this.BMI.setText(IMC);
    this.BMI.setForeground(Color.BLACK);
    this.information.setText(information);
  }

  public void error(String s) {
    this.BMI.setText(s);
    this.BMI.setForeground(Color.RED);
    this.information.setText("");
  }
}
