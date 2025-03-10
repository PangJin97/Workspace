package list_prac;

public class Student {
  private String name;
  private int kor;
  private int eng;
  private int sum;

  public Student(String name, int kor, int eng) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.sum = kor + eng;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getSum() {
    return sum;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", kor=" + kor +
            ", eng=" + eng +
            ", sum=" + sum +
            '}';
  }
}
