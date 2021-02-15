package GridBagConstraintsExplicacion;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Ejemplo {
  public static void main(String[] args) {
    JFrame ventana=new JFrame("GridBag");
    JPanel panel=new JPanel(new GridBagLayout());
    panel.setBorder(new EmptyBorder(10,10,10,10));


    GridBagConstraints c=new GridBagConstraints();
    c.insets=new Insets(10,10,10,10);
    c.gridx=0;
    c.gridy=0;
    c.gridwidth=2;
    JButton boton1=new JButton("Primer Botón");
    panel.add(boton1,c);
    c.gridx=2;
    c.gridy=0;
    c.gridwidth=1;
    JButton boton2=new JButton("Segundo Botón");
    panel.add(boton2,c);

    c.gridx=0;
    c.gridy=1;
    c.gridheight=2;
    JButton boton3=new JButton("Tercero Botón");
    panel.add(boton3,c);

    c.gridx=1;
    c.gridy=1;
    c.gridheight=1;
    JButton boton4=new JButton("Cuarto Botón");
    panel.add(boton4,c);

    c.gridx=2;
    c.gridy=1;
    c.gridheight=1;
    JButton boton5=new JButton("Quinto Botón");
    panel.add(boton5,c);

    c.gridx=1;
    c.gridy=2;
    c.gridwidth=2;
    JButton boton6=new JButton("Sexto Botón");
    panel.add(boton6,c);

    ventana.add(panel);


    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.pack();
    ventana.setVisible(true);
  }
}
