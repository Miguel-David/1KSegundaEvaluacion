package Ejercicio5CuentaPalabras;

import javax.swing.*;
import java.awt.*;

public class PanelEntrada extends JPanel {
  JTextField texto;
  JButton boton;
  JButton botonBorrar;
  PanelEntrada(ProgramaPrincipal programaPrincipal){
    setLayout(new GridLayout(0,1));
    add(new JLabel("Escribe tu nombre"));
    texto=new JTextField(20);
    add(texto);
    boton=new JButton("Púlsame");
    botonBorrar=new JButton("Borrar");
    add(boton);
    add(botonBorrar);
    boton.addActionListener(e->programaPrincipal.pulsadoBoton());
    botonBorrar.addActionListener(e->programaPrincipal.borrar());
  }
  String getInfo(){
    return texto.getText();
  }
}
