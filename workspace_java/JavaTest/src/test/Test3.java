package test;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1 ~ 999 까지의 정수를 입력하세요: ");
    int num = sc.nextInt();

    int hundred = num / 100;
    int ten = (num % 100) / 10;
    int one = num % 10;

    int clapCnt = 0;

    if (hundred == 3 || hundred == 6 || hundred == 9) {
      ++clapCnt;
    }
    if (ten == 3 || ten == 6 || ten == 9) {
      ++clapCnt;
    }
    if (one == 3 || one == 6 || one == 9) {
      ++clapCnt;
    }

    switch (clapCnt) {
      case 1:
        System.out.println("박수 1번");
        break;
      case 2:
        System.out.println("박수 2번");
        break;
      case 3:
        System.out.println("박수 3번");
        break;
      default:
        System.out.println("박수 0번");
    }
  }
}

