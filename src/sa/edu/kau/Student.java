package sa.edu.kau;

public class Student {
  private int ID;
  private String name;
  private float gpa;

  public Student(int ID, String name, float gpa) {
    this.ID = ID;
    this.name = name;
    this.gpa = gpa;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getGpa() {
    return gpa;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return ID + ", \t" + name + ", \t" + gpa;
  }
}
