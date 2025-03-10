package practice;

public class ManTest {
  public static void main(String[] args) {

    Man1 m1 = new Man1();

    m1.setName("홍길동");
    m1.setAge(30);
    m1.setAddress("울산시");
    //setter = 하나하나의 각각의 값을 변경한다
    m1.printInfo();


    //이름 데이터 출력(getter 의 활용)
    System.out.println(m1.name);
    System.out.println(m1.getName());
  }


}
