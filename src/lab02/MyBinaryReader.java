package lab02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyBinaryReader {
  public static void main(String[] args) throws IOException {
    DataInputStream dis = new DataInputStream(
        new FileInputStream("emp.data"));


    // int 4 bytes  + 15 bytes for name as string
    while (dis.available() > 0) {
      int id = dis.readInt();
      String name = readFixedString(dis, 15);
      System.out.println(id + " " + name);
    }


    dis.close();
  }

  private static String readFixedString(DataInputStream dis, int len)
      throws IOException {
    byte[] data = new byte[len];
    dis.read(data);

    return new String(data);
  }
}
