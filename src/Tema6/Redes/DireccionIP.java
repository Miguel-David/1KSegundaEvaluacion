package Tema6.Redes;

import javax.swing.*;
import java.util.Arrays;

public class DireccionIP {
  private int[] bytes;

  public int getPrimerByte(){
    return bytes[0];
  }

  public DireccionIP(int byte1,int byte2,int byte3,int byte4) {
    this.bytes = new int[4];
    bytes[0]=byte1;
    bytes[1]=byte2;
    bytes[2]=byte3;
    bytes[3]=byte4;
  }
  DireccionIP(String ip){
    String[] cadenas=ip.split("\\.");
    this.bytes = new int[4];
    bytes[0]=Integer.parseInt(cadenas[0]);
    bytes[1]=Integer.parseInt(cadenas[1]);
    bytes[2]=Integer.parseInt(cadenas[2]);
    bytes[3]=Integer.parseInt(cadenas[3]);
  }

  public char clase(){
    for (ClasesIP clase:ClasesIP.values()) {
      if(clase.pertenece(this)){
        return clase.getNombre();
      }
    }
    return 'E';
  }

  @Override
  public String toString() {
    return bytes[0]+"."+bytes[1]+"."+bytes[2]+"."+bytes[3];
  }

  public static void main(String[] args) {
    DireccionIP ip=new DireccionIP(192,168,2,10);
    System.out.println(ip);
  }
}
