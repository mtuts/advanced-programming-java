package lab04.random_access;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Student {
  private String name;
  private int id;
  private float gpa;

  public static final int NAME_LENGTH = 15;
  public static final long RECORD_SIZE = NAME_LENGTH + Integer.BYTES + Float.BYTES;


  public Student() {
    name = "";
    id = 0;
    gpa = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() > 15) name = name.substring(0, NAME_LENGTH);
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public float getGpa() {
    return gpa;
  }

  public void setGpa(float gpa) {
    if (gpa < 0) {
      gpa = 0;
    } else if (gpa > 5) {
      gpa = 5;
    }
    this.gpa = gpa;
  }

  public void inputInfo(Scanner scan) {
    System.out.print("Enter student name: ");
    name = scan.nextLine();
    System.out.print("Enter student id: ");
    id = Integer.parseInt(scan.nextLine());
    System.out.print("Enter student gpa: ");
    gpa = Float.parseFloat(scan.nextLine());
  }

  public void store(RandomAccessFile raf) throws IOException {
    writeFixedString(raf, name, NAME_LENGTH);
    raf.writeInt(id);
    raf.writeFloat(gpa);
  }

  public static void writeFixedString(RandomAccessFile raf, String name, int len) throws IOException {
    byte[] buf = new byte[len];
    for (int i = 0; i < len; i++) {
      if (i < name.length()) {
        buf[i] = (byte) name.charAt(i);
      } else {
        // this will make it fixed
        buf[i] = 0;
      }
    }
    raf.write(buf);
  }

  public void load(RandomAccessFile raf) throws IOException {
    name = readFixedString(raf, NAME_LENGTH);
    id = raf.readInt();
    gpa = raf.readFloat();
  }

  public static String readFixedString(RandomAccessFile raf, int len) throws IOException {
    StringBuilder str = new StringBuilder();
    byte[] buf = new byte[len];

    raf.read(buf);
    for (byte b : buf) {
      if (b == 0) break;
      str.append((char) b);
    }

    return str.toString();
  }

  @Override
  public String toString() {
    return String.format("%-15s | %-10d | %-10.2f", name, id, gpa);
  }
}
