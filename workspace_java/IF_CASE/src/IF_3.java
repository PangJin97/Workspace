import java.util.Scanner;

public class IF_3 {
  public static void main(String[] args) {
    //키보드로 정수 2개를 입력받아서,
    //입력 받은 두 수의 합이 10 이상이면서
    //짝수는 아닐 경우에만 "참"이라는 문자열 출력

    Scanner sc = new Scanner(System.in);

    //변수 선언하기
    int num1;
    int num2;
    //자료형이 똑같을 때, int num1, num2; 쉼표로 나열 할 수 있다.

    //안내멘트와 값 입력받기
    System.out.print(" 정수입력 : ");
    num1 = sc.nextInt();

    System.out.print(" 정수입력 : ");
    num2 = sc.nextInt();

    //결과 출력
    //이상, 초과, 이하, 미만
    if(num1 + num2 >= 10 && (num1 + num2) % 2 != 0){
      System.out.println(" 참 ");
    }

  }
}
