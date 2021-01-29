package BMICalculator;

import javax.swing.*;
import java.awt.*;

public class CalculadorasIMC {
  public static void main(String[] args) {
    BMICalculator[] calculators=new BMICalculator[5];
    JFrame window = new JFrame("BMI CAlculator");
    window.setLayout(new GridLayout(2, 0));

    for (int i = 0; i < calculators.length; i++) {
      calculators[i]=new BMICalculator();
      calculators[i].getWindow().setBorder(BorderFactory.createEtchedBorder());
      window.add(calculators[i].getWindow());
    }

    window.pack();
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
    window.setVisible(true);
  }
}
