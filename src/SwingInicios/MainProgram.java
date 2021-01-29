package SwingInicios;


import javax.swing.*;
import java.awt.*;

public class MainProgram {

  public static void calculateIMC(DataPanel in){
    String salida = in.weight.getText();
    System.out.print(salida);
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("BMI");

    DataPanel in = new DataPanel();

    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setBounds(150,150,500,400);
    frame.setLayout(new GridLayout(0,2));
//      frame.pack();
    frame.add(in);
    System.out.println(Grade.getGrade(33.4));
  }
}