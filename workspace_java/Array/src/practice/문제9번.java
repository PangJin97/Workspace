package practice;

import java.util.Scanner;

public class 문제9번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[]arr1=new int [5];

    for(int i = 0; i < arr1.length; i++){
      System.out.println(i + "번째 요소의 값 : ");
      arr1[i]= sc.nextInt();
    }
    for(int i = 0; i < arr1.length; i++){
      System.out.println(arr1[i]);
    }
  }
}
