import java.util.Scanner;

public class 문제_1_2_3 {
  public static void main(String[] args) {
    //1~99 사이의 정수를 키보드 입력!
    //박수짝, 박수짝짝
    //박수없음

    Scanner sc = new Scanner(System.in);

    int num;

    int clapCnt = 0; // 박수의 개수

    System.out.println("1~99 사이의 정수를 입력하시오>>");
    num= sc.nextInt();

    //입력받은 정수를 1의 자리와 10의 자리 수로 분리,
    //십의 자리
    int tens = num /10;
    //1의 자리는
    int ones = num % 10;
    //변수를 적극적으로 활용하기
    //정수끼리의 계산은 정수로 나온다.

    //만약 십의 자리 수가 3,6,9면 박수 수를 1증가
    if(tens == 3 || tens == 6 || tens == 9 ) {
      clapCnt = clapCnt + 1;
      // clapCnt += 1;
      // ++clapCnt;
      // clapCnt++;
      //if(tens % 3 == 0 && tens != 0)도 가능
    }
    //만약 일의 자리 수가 3,6,9면 박수 수를 1증가

    if(ones == 3 || ones == 6 || ones == 9){
      ++clapCnt;
    }
    //두 조건을 모두 봐야하기 때문에 둘다 if준다. else주면 안됨.

    // 이제 clapCnt = 0,1,2만 존재함
    // 0이면 박수 없음
    // 1이면 박수짝
    // 2면 박수짝짝
    //값이 특정 됬으니 switch
    switch (clapCnt){
      case 0:
        System.out.println("박수없음");
        break;
      case 1:
        System.out.println("박수짝");
        break;
      case 2:
        System.out.println("박수짝짝");
    }
  }
}
