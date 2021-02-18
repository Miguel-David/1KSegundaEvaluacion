package SelectorDeColores;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Selector {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBorder(new EmptyBorder(10 , 20, 10, 20));

    GridBagConstraints gridTexto = new GridBagConstraints();
    gridTexto.gridx = 0;
    gridTexto.gridy = 0;
    JLabel text = new JLabel("✧");
    text.setFont(new Font("Sans serif", Font.PLAIN, 500));


    GridBagConstraints gridButton = new GridBagConstraints();
    gridButton.gridx = 0;
    gridButton.gridy = 1;
    JButton button = new JButton("Elige el color");

    button.addActionListener(e -> {
      Color chooseColor = JColorChooser.showDialog(null, "Color?", Color.BLACK);
      text.setForeground(chooseColor);
    });

    panel.add(text, gridTexto);
    panel.add(button, gridButton);

    frame.add(panel);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}