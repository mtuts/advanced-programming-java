package lab02;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(
        new File("sample.txt"),
        StandardCharsets.UTF_8);

    String line = scan.nextLine();
    System.out.println(line);

    scan.close();

  }
}
