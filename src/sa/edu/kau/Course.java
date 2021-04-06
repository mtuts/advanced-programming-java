package sa.edu.kau;

public class Course {
  private int number;
  private String code;
  private String title;

  public Course(int number, String code, String title) {
    this.number = number;
    this.code = code;
    this.title = title;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
