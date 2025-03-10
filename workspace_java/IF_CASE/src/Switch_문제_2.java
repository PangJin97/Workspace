import java.util.Scanner;

public class Switch_문제_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A;

    System.out.println(" 성별을 입력하세요");
    A=sc.next();

    switch (A){
      case "남" :
        System.out.println("남자입니다");
        break;
      case "여" :
        System.out.println("여자 입니다");
        break;
      default:
        System.out.println("다시 입력하세요");
    }
  }
}
