package Tema6.ArrayLists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerFichero {
  public static void main(String[] args) throws IOException {
    List<String> datosPaises= Files.readAllLines(Paths.get("DatosPaises"));
    System.out.println(datosPaises.size());
  }
}
