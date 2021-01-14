package LeerEscribirFicherosTexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EscribirLineasFichero {
  public static void main(String[] args) throws IOException {
    List<String> lineas= Arrays.asList("Ana","Clara","Delia","Elena");
    System.out.println(lineas.size());
    Files.write(Paths.get("nombres.txt"),lineas);
  }
}
