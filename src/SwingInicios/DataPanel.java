package SwingInicios;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataPanel extends JPanel {
  JTextField weight = new JTextField(10);
  JTextField height = new JTextField(10);
  JButton calculate = new JButton("Calculate");

  DataPanel(){
    initialize();
  }

  private void initialize() {
    add(new JLabel("Weight: "));
    add(weight);
    add(new JLabel("Height: "));
    add(height);
    add(calculate);

    calculate.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        double w=Double.parseDouble(weight.getText());
        double h=Double.parseDouble(height.getText());
        double bmi=w/(h*h);
        JOptionPane.showMessageDialog(null,"Your BMI is: "+String.format("%.2f",bmi));
        JOptionPane.showMessageDialog(null,"Your Grade is: "+Grade.getGrade(bmi));

      }
    });

    setVisible(true);
    setBorder(BorderFactory.createTitledBorder("BMI"));
//        setBounds();
//        setLayout(new GridLayout(0,2));
    setMaximumSize(new Dimension(30,100));
  }

}