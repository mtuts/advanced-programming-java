package lab01;

public abstract class Person {
  protected String name;
  protected int id;

  public Person(String name) {
    setName(name);
    id = (int)(Math.random() * 100000);
  }

  public Person(int id, String name) {
    this.id = id;
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() < 3) {
      System.err.println("Name should be 3 or more!");
      return;
    }
    this.name = name;
  }

  public int getId() {
    return id;
  }
}
