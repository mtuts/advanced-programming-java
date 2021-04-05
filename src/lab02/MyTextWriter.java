package lab02;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class MyTextWriter {
  public static void main(String[] args) throws IOException {
    PrintWriter writer = new PrintWriter(
        "sample.txt",
        StandardCharsets.US_ASCII);

    writer.print("Hello CPIT305");


    writer.close();
  }
}
