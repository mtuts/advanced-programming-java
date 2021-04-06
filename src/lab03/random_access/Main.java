package lab03.random_access;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
  public static void main(String[] args) throws IOException {

    RandomAccessFile raf = new RandomAccessFile("emp.data", "r");

    // record size is 19 = 4 + 15
    final int RS = 19;

    raf.seek(RS * 4);
    int id = raf.readInt();
    String name = readFixedString(raf, 15);

    System.out.printf("%d\t %s\n", id, name);


    raf.close();
  }

  private static String readFixedString(RandomAccessFile dis, int len)
      throws IOException {
    byte[] data = new byte[len];
    dis.read(data);

    return new String(data);
  }
}
