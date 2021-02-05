package ExplicacionSwing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoSueldo {
  static JTextField sueldo;
  static JTextField salario;
  static JTextField nombre;
  static JTextField horas;
  public static void main(String[] args) {
    JFrame ventana=new JFrame("Cálculo de Sueldo");

    JPanel panel=new JPanel();
    panel.setBorder(new EmptyBorder(10,10,10,10));
    panel.setLayout(new GridBagLayout());

    JLabel etiquetaNombre=new JLabel("Nombre del empleado");
    JLabel etiquetaSueldo=new JLabel("Salario Básico/Hora");
    nombre=new JTextField(20);
    sueldo=new JTextField(15);

    anyadeComponente(panel,etiquetaNombre,0,0,2,1);
    anyadeComponente(panel,etiquetaSueldo,2,0,1,1);
    anyadeComponente(panel,nombre,0,1,2,1);
    anyadeComponente(panel,sueldo,2,1,1,1);

    JLabel etiquetaHoras=new JLabel("Horas Trabajadas:");
    JLabel etiquetaSalario=new JLabel("Salario Mensual");
    anyadeComponente(panel,etiquetaHoras,0,2,1,1);
    anyadeComponente(panel,etiquetaSalario,2,2,1,1);

    horas=new JTextField(10);
    JButton calcular=new JButton("Calcular");
    salario=new JTextField(5);
    anyadeComponente(panel,horas,0,3,1,1);
    anyadeComponente(panel,calcular,1,3,1,1);
    anyadeComponente(panel,salario,2,3,1,1);
    //Calcular
    calcular.addActionListener(e->hazCalculo());


    ventana.add(panel);


    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);

  }

  private static void hazCalculo() {
    int perras=Integer.parseInt(sueldo.getText());
    int tiempo=Integer.parseInt(horas.getText());
    String nombreCadena=nombre.getText();
    salario.setText(""+perras*tiempo);
    JOptionPane.showMessageDialog(null,nombreCadena+", tu salario es €:"+perras*tiempo);
  }

  public static void anyadeComponente(
          JPanel panel,
          Component componente,
          int posx,
          int posy,
          int anchox,
          int anchoy){
    GridBagConstraints c=new GridBagConstraints();
    c.gridx=posx;
    c.gridy=posy;
    c.gridwidth=anchox;
    c.gridheight=anchoy;
    panel.add(componente,c);
  }
}


