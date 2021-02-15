package ConversorBinarioYHexadecimal;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Conversor {
  public static void main(String[] args) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBorder(new EmptyBorder(10,10,10,10));

    JTextField inputNumber = new JTextField(10);
    JButton toBinary = new JButton("Binario");
    JButton toHex = new JButton("Hexadecimal");
    JLabel binaryOutput = new JLabel("Aquí viene el binario");
    JLabel hexOutput = new JLabel("Aquí viene el hexadecimal");

    toBinary.addActionListener(e -> {
      binaryOutput.setText(Integer.toBinaryString(Integer.parseInt(inputNumber.getText())));
    });
    toHex.addActionListener(e -> {
      hexOutput.setText(Integer.toHexString(Integer.parseInt(inputNumber.getText())));
    });

    panel.add(new JLabel("Número:"), getGridBagConstraint(0, 0));
    panel.add(inputNumber, getGridBagConstraint(0, 1));
    panel.add(toBinary, getGridBagConstraint(0, 2));
    panel.add(toHex, getGridBagConstraint(1, 2));
    panel.add(binaryOutput, getGridBagConstraint(0, 3));
    panel.add(hexOutput, getGridBagConstraint(1, 3));


    window.add(panel);
    window.pack();
    window.setLocationRelativeTo(null);
    window.setVisible(true);

  }

  public static GridBagConstraints getGridBagConstraint(int gridx, int gridy) {
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = gridx;
    c.gridy = gridy;
    return c;
  }
}
