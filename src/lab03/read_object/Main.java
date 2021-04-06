package lab03.read_object;

import lab03.write_object.Employee;
import lab03.write_object.Person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
  public static void main(String[] args) throws IOException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.obj"));

    try {
      while (true) {
        try {
          Object obj = ois.readObject();
          if (obj instanceof Person) {
            Person p = (Person) obj;
            System.out.println(p);
          } else {
            Employee e = (Employee) obj;
            System.out.println(e);
          }
        } catch (ClassNotFoundException cnf) {
          System.err.println("Class not found!");
        }
        System.out.println("");
      }
    } catch (EOFException eof) {}

    ois.close();

  }
}
