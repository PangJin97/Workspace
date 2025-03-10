import java.util.Scanner;

public class 정수입력받기_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    /*변수만들기
    * */

    System.out.print("정수 입력 : ");
     a = sc.nextInt();
    System.out.print("정수 입력 : ");
     b = sc.nextInt();
     /*입력받을 장소와 변수 초기회*/

    System.out.print(a + b);
  }
}
