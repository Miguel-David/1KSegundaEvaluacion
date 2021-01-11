package Tema6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerFichero {
  public static void main(String[] args) throws IOException {

    List<String> lineas= Files.readAllLines(Paths.get("texto.txt"));
    System.out.println(lineas.size());


  }
}
