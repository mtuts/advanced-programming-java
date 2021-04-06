package sa.edu.kau;

import java.util.ArrayList;

public class Section {
  private ArrayList<Student> students;
  private String code;
  private Course course;

  public Section(Course course, String code) {
    this.students = new ArrayList<>();
    this.code = code;
    this.course = course;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void addStudent(Student std) {
    students.add(std);
  }

  public Student[] getStudents() {
    Student[] std = new Student[students.size()];
    int i = 0;
    for (Student s : students) {
      std[i++] = s;
    }
    return std;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }
}
