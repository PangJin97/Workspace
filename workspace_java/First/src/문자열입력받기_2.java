import java.util.Scanner;

public class 문자열입력받기_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String name;
    String addr;

  //이름과 주소를 입력하자
    System.out.println("이름을 입력하세요 : ");
      name = sc.next();
  // 문자열을 담아내기 위해 String 변수를 씀.
    System.out.println("주소를 입력해주세요 : ");
      addr = sc.next();

    System.out.println("이름 = " + name);
    System.out.println("주소 = " + addr);
  }
}
