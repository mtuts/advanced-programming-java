package lab01;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String input = "";
    while (!input.equalsIgnoreCase("quit")) {
      System.out.print("Enter employee name: ");
      input = scan.nextLine();
      System.out.println("Available positions: ");
      System.out.println("1. Salesman");
      System.out.println("2. Accounting");
      System.out.println("3. Marketing");
      System.out.println("Choose number from above: ");

      int pos = scan.nextInt();
      scan.nextLine();

      EmployeePosition ep;
      switch (pos) {
        case 1:
          ep = EmployeePosition.Salesman;
          break;
        case 2:
          ep = EmployeePosition.Accounting;
          break;
        case 3:
          ep = EmployeePosition.Marketing;
          break;
        default:
          System.err.println("Wrong selection");
          continue;
      }
      Employee emp = new Employee(input);
      emp.setPosition(ep);

      System.out.print("Would you like to continue? (type quit if not): ");
      input = scan.nextLine();
    }
  }
}
