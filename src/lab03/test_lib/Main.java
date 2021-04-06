package lab03.test_lib;

import sa.edu.kau.*;

public class Main {

  public static void main(String[] args) {
    Student s1 = new Student(1122, "Ahmed", 4.8f);
    Student s2 = new Student(3355, "Khalid", 3.4f);
    Student s3 = new Student(7788, "Saeed", 3.9f);

    Course c = new Course(305, "CPIT", "Advance Programming");

    Section s = new Section(c, "CD");

    s.addStudent(s1);
    s.addStudent(s2);
    s.addStudent(s3);

    Student[] students = s.getStudents();
    for (Student student : students) {
      System.out.println(student);
    }
  }
}
