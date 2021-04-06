package lab03.write_object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.obj"));

    Person p1 = new Person("Ahmed", "Saleh", 20, 10292.949f);
    Person p2 = new Person("Fahad", "Khalid", 32, 15045.456f);
    Employee e1 = new Employee(456, "Hani Gamdi", 14245.456f);
    Employee e2 = new Employee(123, "David", 1023.475f);


    oos.writeObject(e1);
    oos.writeObject(p1);
    oos.writeObject(e2);
    oos.writeObject(p2);


    oos.close();


    /**
     * Task 1:
     * Student as Serialized (int)ID, (String)Name, (float)GPA
     * Write to file
     * Read from file
     */
  }

}
