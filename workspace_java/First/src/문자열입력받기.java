import java.util.Scanner;

public class 문자열입력받기 {
  public static void main(String[] args) {
  //키보드 입력을 받기 위한 변수(복사해서 사용)

    //Scanner sc = new Scanner(System.in); 첫번째로 이것을 메인 메서드 안에 붙여 넣기 한다.
    Scanner sc = new Scanner(System.in);

    String a;
  //변수 만들기

    System.out.println("문자열을 입력 : ");
  //콘솔에 입력할 곳을 정하기
  //sc.next() : 키보드 입력을 위한 명령어, 키보드 입력이란? 콘솔창에 입력하는 걸 말한다/
     a = sc.next();
  //sc.next()로 변수 초기화

    System.out.println("입력받은 문자열은" + a);
  //입력받은 a로 최종결과를 어떻게 출력할것인가.
  }
}
