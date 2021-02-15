import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombinacionColores extends JFrame {
  JPanel panel;

  CombinacionColores(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    panel=new JPanel(new GridBagLayout());

    GridBagConstraints c=new GridBagConstraints();
    c.insets=new Insets(10,10,10,10);
    c.gridx=0;
    c.gridy=0;
    panel.add(new JLabel("Fuente"),c);
    c.gridx=0;
    c.gridy=1;
    panel.add(new JLabel("Fondo"),c);
    c.gridx=1;
    c.gridy=0;
    JButton azul=new JButton("Azul");
    panel.add(azul,c);
    c.gridx=2;
    JButton rojo=new JButton("Rojo");
    panel.add(rojo,c);
    c.gridx=3;
    JButton lila=new JButton("Lila");
    panel.add(lila,c);
    c.gridx=1;
    c.gridy=1;
    JButton amarillo=new JButton("amarillo");
    panel.add(amarillo,c);
    c.gridx=2;
    JButton añil=new JButton("Añil");
    panel.add(añil,c);
    c.gridx=3;
    JButton magenta=new JButton("magenta");
    panel.add(magenta,c);
    JLabel peace=new JLabel("PEACE");
    c.gridx=0;
    c.gridy=2;
    c.gridwidth=4;
    c.gridheight=3;
    peace.setHorizontalAlignment(SwingConstants.CENTER);
    peace.setOpaque(true);
    Font fuente=new Font(Font.SANS_SERIF, Font.BOLD,  30);
    peace.setFont(fuente);
    panel.add(peace,c);
    add(panel);


    //Comportamiento Botones
    azul.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        peace.setForeground(Color.BLUE);
      }
    });
    amarillo.addActionListener(e->peace.setBackground(Color.YELLOW));


    setLocationRelativeTo(null);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    CombinacionColores c=new CombinacionColores();
  }
}
