import java.util.Scanner;

public class 문제_1_2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int c;

    System.out.print("변의 길이 입력 : ");
    a= sc.nextInt();
    System.out.print("변의 길이 입력 : ");
    b= sc.nextInt();
    System.out.print("변의 길이 입력 : ");
    c= sc.nextInt();

    if(a+b > c && b+c>a && a+c>b){
      System.out.println("입력한 세변으로 삼각형 가능!");
      }
  }
}
