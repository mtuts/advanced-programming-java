package lab03.write_object;

import java.io.Serializable;

/**
 *
 * @author marwan
 */
public class Person implements Serializable {


  private String first_name;
  private String last_name;

  private int age;

  private float income;

  public Person(String first_name, String last_name, int age, float income) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
    this.income = income;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public float getIncome() {
    return income;
  }

  public void setIncome(float income) {
    this.income = income;
  }

  @Override
  public String toString() {
    return String.format("Name: %s %s\nAge: %d\nIncome: %.2f",
        first_name, last_name, age, income);
  }

}
