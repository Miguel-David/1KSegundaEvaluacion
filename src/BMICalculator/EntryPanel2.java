package BMICalculator;

import SwingInicios.BMI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EntryPanel2 {
  private final JPanel panel;
  private final JPanel panelSliders;
  private final JPanel panelInput;

  private final JTextField textWeight;
  private final JTextField textHeight;
  private final BMICalculator mainProgram;
  private final JSlider sliderWeight;
  private final JSlider sliderHeight;

  EntryPanel2(BMICalculator mainProgram) {
    this.mainProgram = mainProgram;
    panel = new JPanel(new GridLayout(0, 1));
    panelSliders = new JPanel(new GridLayout(0, 2));
    sliderWeight = new JSlider();
    sliderWeight.setMinimum(10);
    sliderWeight.setMaximum(200);
    panelSliders.add(sliderWeight);
    panelSliders.add(new JLabel("Weight"));

    sliderHeight = new JSlider();
    sliderHeight.setMinimum(10);
    sliderHeight.setMaximum(270);
    panelSliders.add(sliderHeight);
    panelSliders.add(new JLabel("Height"));
    panelSliders.setBorder(new EmptyBorder(10, 10, 10, 10));
    panel.add(panelSliders);

    panelInput = new JPanel(new GridLayout(0, 3, 10, 10));
    panelInput.setBorder(new EmptyBorder(10, 10, 10, 10));
    panelInput.add(new JLabel("Weight"));
    textWeight = new JTextField();
    textWeight.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        mainProgram.action();
      }
    });
    textWeight.setHorizontalAlignment(SwingConstants.RIGHT);
    panelInput.add(textWeight);
    panelInput.add(new JLabel("kg."));
    panelInput.add(new JLabel("Height"));
    textHeight = new JTextField();
    textHeight.setHorizontalAlignment(SwingConstants.RIGHT);
    textHeight.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        mainProgram.action();
      }
    });
    panelInput.add(textHeight);
    panelInput.add(new JLabel("cm."));
    sliderWeight.addChangeListener(e -> {
      textWeight.setText("" + sliderWeight.getValue());
      mainProgram.action();
    });
    sliderHeight.addChangeListener(e -> {
      textHeight.setText("" + sliderHeight.getValue());
      mainProgram.action();
    });
    panel.add(panelInput);
  }

  public JPanel getPanel() {
    return panel;
  }

  public String getStringWeight() {
    return textWeight.getText();
  }

  public String getStringHeight() {
    return textHeight.getText();
  }
}
