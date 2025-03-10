import java.util.Scanner;

public class 정수입력받기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  //먼저 이거 복사하고

    int a;
  //변수만들기

    System.out.println("정수 입력 : ");
  //콘솔에 입력할 장소를 출력하고
    a = sc.nextInt();
  //변수 초기화

    System.out.println("입력받은 정수 : " + a);
  //최종결과  출력

  }
}
