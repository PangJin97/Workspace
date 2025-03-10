import java.util.Scanner;

public class Switch_문제 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A;

    System.out.print("  성별을 입력하세요 : ");
    A=sc.next();

    if(A.equals("남")){
      System.out.println("남자 입니다.");
    }
    else if(A.equals("여")){
      System.out.println("여자입니다");
    }
    else{
      System.out.println("다시 입력하세요.");
    }
  }
}
