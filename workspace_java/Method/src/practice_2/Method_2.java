package practice_2;

import java.util.Scanner;

public class Method_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 : ");
    int a =sc.nextInt();
    System.out.print("정수 : ");
    int b = sc.nextInt();

    aaa(a, b);

    int m = aaa(a,b);
    System.out.println(m);
  }
  public static int aaa(int num1, int num2){
    return num1*num2;
  }

}
