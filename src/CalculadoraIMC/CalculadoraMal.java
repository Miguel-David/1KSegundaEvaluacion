package CalculadoraIMC;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculadoraMal {
  static JTextField peso;
  static JTextField altura;
  static JFrame ventana;
  public static void main(String[] args) {
    ventana=new JFrame("Calculadora IMC");
    JPanel panel = new JPanel(new GridLayout(0,3,10,10));
    panel.setBorder(new EmptyBorder(10,10,10,10));
    panel.add(new JLabel("Peso:"));
    peso=new JTextField();
    panel.add(peso);
    panel.add(new JLabel("kg."));
    panel.add(new JLabel("Altura:"));
    altura=new JTextField();
    panel.add(altura);
    panel.add(new JLabel("cm."));
    JButton boton=new JButton("Calcular");
    panel.add(boton);
    boton.addActionListener(e->calcular());
    ventana.add(panel);
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Para cerrar
    ventana.setLocationRelativeTo(null); //Centra
    ventana.pack(); //Tamaño minimo adecuado
    ventana.setVisible(true);
  }

  private static void calcular() {
    double mipeso=Double.parseDouble(peso.getText());
    double mialtura=Double.parseDouble(altura.getText())/100.0;
    double IMC=mipeso/(mialtura*mialtura);
    String salida=String.format("Tu IMC es: %.2f",IMC);
    JOptionPane.showMessageDialog(ventana,salida);
    /*
    Por debajo de 18.5	Bajo peso
18,5–24,9	Peso normal
25.0–29.9	Pre-obesidad o Sobrepeso
30.0–34.9	Obesidad clase I
35,0–39,9	Obesidad clase II
Por encima de 40	Obesidad clase III
     */
    String mensajeIMC="";
    if(IMC<18.5){
      mensajeIMC="Bajo Peso";
    } else if(IMC<24.9){
      mensajeIMC="Peso normal";
    } else if(IMC<29.9){
      mensajeIMC="Pre-obesidad o Sobrepeso";
    } else if (IMC<34.9){
      mensajeIMC="Obesidad clase I";
    } else if(IMC<39.9){
      mensajeIMC="Obesidad clase II";
    } else {
      mensajeIMC="Obesidad clase III";
    }
    JOptionPane.showMessageDialog(ventana,mensajeIMC);
  }
}
