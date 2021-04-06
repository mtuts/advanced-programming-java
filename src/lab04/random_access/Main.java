package lab04.random_access;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    RandomAccessFile raf = new RandomAccessFile("student.data", "rw");

    Scanner scan = new Scanner(System.in);

    Student std = new Student();
    int option, index;
    long record;

    while (true) {
      System.out.println("\nChoose from following:");
      System.out.println("1. Add new student");
      System.out.println("2. Update student"); // ask for student 1-index
      System.out.println("3. Search by index");
      System.out.println("4. List all students");
      System.out.println("5. Exit");

      System.out.print("Your choice: ");
      option = Integer.parseInt(scan.nextLine());

      switch (option) {
        case 1:
          // jump to the end of file
          raf.seek(raf.length());

          // get student info from user
          std.inputInfo(scan);

          // store student info into file
          std.store(raf);
          break;

        case 2:
          // ask user for index
          System.out.print("Enter record index: ");
          index = Integer.parseInt(scan.nextLine()) - 1;

          // jump to student record in the file
          record = index * Student.RECORD_SIZE;
          if (record > raf.length()) {
            System.err.println("Record is not exist! try again...");
            System.err.flush();
            continue;
          }

          raf.seek(record);

          // display student info
          std.load(raf); //
          printTableHeader();
          System.out.println(std);
          System.out.println();

          // ask for new updates
          System.out.println("Enter new updates: ");
          std.inputInfo(scan);

          // store student data into file
          raf.seek(record);
          std.store(raf);
          break;

        case 3:
          // ask user for index
          System.out.print("Enter record index: ");
          index = Integer.parseInt(scan.nextLine()) - 1;

          // jump to student record in the file
          record = index * Student.RECORD_SIZE;
          if (record > raf.length()) {
            System.err.println("Record is not exist! try again...");
            System.err.flush();
            continue;
          }

          raf.seek(record);

          // display student info
          std.load(raf);
          printTableHeader();
          System.out.println(std);
          System.out.println();
          break;

        case 4:
          // jump to the beginning of file
          raf.seek(0);

          // loop through all records in the file
          long nr = raf.length() / Student.RECORD_SIZE;
          System.out.println("Number of record is " + nr + " students");

          printTableHeader();
          for (int i = 0; i < nr; i++) {
            // display each record
            std.load(raf);
            System.out.println(std);
          }
          System.out.println();
          break;

        case 5:
          break;
        default:
          System.err.println("Wrong choice!, try again..");
          System.err.flush();
          continue;
      }

      if (option == 5) break;

    }


    raf.close();

  }

  private static void printTableHeader() {
    System.out.printf("\n%-15s | %-10s | %-12s\n", "Name", "ID", "GPA");
    System.out.println("- - - - - - - - - - - - - - - - - - -");
  }
}
