package practice;

import java.util.Scanner;

public class 문제11번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[]arr=new int[3];

    for(int i =0; i < arr.length; i++){
      System.out.println("값을 입력하세요");
      arr[i]=sc.nextInt();
    }
    int num = 0;
    for(int i = 0; i < arr.length; i++){
      num = num + arr[i];
    }
    System.out.println(num);
    System.out.println(num / arr.length);
  }
}
