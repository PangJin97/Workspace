import java.util.Scanner;

import java.util.Scanner;

public class Test4 {
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

/*
num % 100:
100으로 나눈 나머지를 구합니다. 이는 백의 자리를 제외한 나머지 값(십의 자리와 일의 자리)을 가져옵니다.

예:
        369 % 100 = 69
        456 % 100 = 56
        87 % 100 = 87 (백의 자리가 없으므로 그대로)


/ 10:
나머지 값에서 10으로 나눈 몫(정수)을 구합니다. 이는 십의 자리 값입니다.

예:
        69 / 10 = 6 (십의 자리)
        56 / 10 = 5 (십의 자리)
        87 / 10 = 8 (십의 자리)
*/
