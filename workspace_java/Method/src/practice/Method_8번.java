package practice;

import java.util.Scanner;

public class Method_8번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    System.out.print("정수 : ");
    num= sc.nextInt();
    printInt(num);
  }
  public static void printInt(int num){
    System.out.print(num);
  }
}
