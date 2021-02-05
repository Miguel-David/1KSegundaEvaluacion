package ExplicacionSwing;

import javax.swing.*;
import java.awt.*;

public class GridBadLayoutExplicacion {
  public static void main(String[] args) {
    JFrame ventana=new JFrame("GridBagLayout");
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JPanel gridBag=new JPanel(new GridBagLayout());
    GridBagConstraints c=new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx=0;
    c.gridy=0;
    c.gridwidth=2;
    c.insets=new Insets(5,5,5,5);
    JLabel titulo=new JLabel("Dahsboard");
    titulo.setHorizontalAlignment(SwingConstants.CENTER);
    gridBag.add(titulo,c);
    GridBagConstraints c2=new GridBagConstraints();
    c2.gridx=0;
    c2.gridy=1;
    gridBag.add(new JLabel("Name"),c2);
    c.gridx=1;
    c.gridy=1;
    c.gridwidth=1;
    gridBag.add(new JTextField(10),c);
    c.gridx=0;
    c.gridy=2;
    c.gridwidth=2;
    gridBag.add(new JButton("Pulsame"),c);


    ventana.add(gridBag);
    ventana.setLocationRelativeTo(null);
    ventana.pack();
    ventana.setVisible(true);
  }
}
