package ExplicacionSwing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelSueldo{
  private JTextField sueldo;
  private JTextField salario;
  private JTextField nombre;
  private JTextField horas;
  private JPanel panel;
  public PanelSueldo(){
    inicializar();
  }

  public JPanel getPanel() {
    return panel;
  }

  public String getNombre() {
    return nombre.getText();
  }

  private void inicializar() {
    panel=new JPanel();
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


  }

  private void hazCalculo() {
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
  public static void main(String[] args) {
    JFrame ventana=new JFrame("Cálculo de Sueldo");
    ventana.setLayout(new GridLayout(2,2));
    PanelSueldo panelSueldo=new PanelSueldo();
    PanelSueldo panelSueldo1=new PanelSueldo();
    PanelSueldo panelSueldo2=new PanelSueldo();
    PanelSueldo panelSueldo3=new PanelSueldo();
    ventana.add(panelSueldo.panel);
    ventana.add(panelSueldo1.panel);
    ventana.add(panelSueldo2.panel);
    ventana.add(panelSueldo3.panel);

    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
  }
}
