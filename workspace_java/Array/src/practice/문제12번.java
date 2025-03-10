package practice;

import java.util.Scanner;

public class 문제12번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print(" 생성할 배열의 길이 입력 : ");
    num= sc.nextInt();

    int[]arr=new int[num];
    int sum=0;

    for(int i =0; i < num; i++){
      arr[i]=i+1;
/*
* 컴퓨터 숫자는 0부터 시작한다. 문제는
* 0번째 숫자 1이 나와야한다.
* 그러면 i에다 +1을 하면된다
* */
      System.out.print(arr[i] + " ");
    }
    //배열의 값 저장

    for(int i = 0; i < num; i++){
      sum = sum + arr[i];
    }
    //배열의 각요소의 합
    //  for( int e : arr){
    //     sum = sum + e;
    //  }
    //for each

    double avg = (double) sum / arr.length;
    //배열 평균

    System.out.println();

    System.out.print(arr.length + " ");

    System.out.println();

    System.out.print("배열 요소의 평균 : " + avg);
  }
}
