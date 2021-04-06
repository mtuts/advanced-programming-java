package lab03.write_object;

import java.io.Serializable;

/**
 *
 * @author marwan
 */
public class Employee implements Serializable {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }


  @Override
  public String toString() {
    return String.format("ID: %d\nName: %s\nSalary: %.2f",
        id, name, salary);
  }
}
