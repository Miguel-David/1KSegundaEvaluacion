package LeerEscribirFicherosTexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerLineasFichero {
  public static void main(String[] args) throws IOException {
    List<String> nombres= Files.readAllLines(Paths.get("nombres.txt"));
    System.out.println(nombres.size());
  }

}
