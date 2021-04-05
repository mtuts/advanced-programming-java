package lab01;

public class Employee extends Person {

  private EmployeePosition position;

  public Employee(String name) {
    super(name);
  }

  public EmployeePosition getPosition() {
    return position;
  }

  public void setPosition(EmployeePosition position) {
    this.position = position;
  }
}
