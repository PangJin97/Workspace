package Study;

public class StudentTest2 {
  public static void main(String[] args) {
    //Student 클래스의 객체 stu1 생성
    Student stu1 = new Student();
    stu1.printInfo();

    //학생 객체 stu1의 데이터 변경
    stu1.name = "Lee";
    stu1.age = 30;
    stu1.score = 90;
    stu1.printInfo();
    //문법적으로 가능하지만 쓰지마라!!

    System.out.println();

    //Student 객체 stu2 생성
    Student stu2 = new Student();

    //stu2 객체의 데이터 변경
    stu2.setName("Hong");
    stu2.setAge(29);
    stu2.setScore(80);

    stu2.printInfo();

    System.out.println();


    //Student 클래스의 객체 stu3생성.
    Student stu3 = new Student();
    stu3.setAll("김", 40, 70);
    stu3.printInfo();
  }
  //데이터를 표현할 방법은 여러가지 있지만
  //변수의 값을 변경할때는 '메서드'를 쓰는게 맞다.
  //다른거 안됨!!!

}
