package practice;

import java.util.Scanner;

public class Method_9번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    System.out.print("정수 : ");
    num1 = sc.nextInt();
    System.out.print("정수 : ");
    num2 = sc.nextInt();;

    keyboard(num1, num2);
  }
  public static void keyboard(int num1, int num2){
    System.out.println(num1 + num2);
  }
}
