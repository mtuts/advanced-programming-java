package lab02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MyBinaryWriter {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("emp.data");
    DataOutputStream dos = new DataOutputStream(fos);

    Scanner scan = new Scanner(System.in);
    String line;
    while (true) {
      System.out.print("Enter employee ID: ");
      line = scan.nextLine();
      if (line.equalsIgnoreCase("quit")) break;

      dos.writeInt(Integer.parseInt(line));
      System.out.print("Enter employee name: ");
      line = scan.nextLine();
      writeFixedString(dos, line, 15);
    }


    fos.close();
  }

  private static void writeFixedString(DataOutputStream dos, String str, int len)
      throws IOException{
    StringBuilder out = new StringBuilder();
    for (int i = 0; i < len; i++) {
      if (i < str.length()) {
        out.append(str.charAt(i)); // one char at time
      } else {
        out.append(" ");
      }
    }
    dos.writeBytes(out.toString());
  }
}
