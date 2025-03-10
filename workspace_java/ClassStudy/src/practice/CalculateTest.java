package practice;

import java.util.Scanner;

public class CalculateTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수: ");
    int num1 = sc.nextInt();
    System.out.print("두번째 수: ");
    int num2 = sc.nextInt();
    System.out.print("연산자: ");
    String oper = sc.next();

    //계산기 객체
    Calculate cal = new Calculate(num1, num2);
    //3. 생성자 초기값에 매개변수에 줘버리기.


    //cal 이 가지고 있는 a,b 변수를 세팅하기 위한 3가지 방법

    /*
    1.
    cal.setA(num1);
    cal.setB(num2);
    */

    /*
    2.
     cal.a = num1
    a가 private 때문에 set 사용
    */




    switch (oper){
      case "+" :
        System.out.println(num1 + oper + num2 + " = " + cal.getSum());
        break;
      case "-" :
        System.out.println(num1 + oper + num2 + " = " + cal.getSub());
        break;
      case "*" :
        System.out.println(num1 + oper + num2 + " = " + cal.getMulti());
        break;
      case "/" :
        System.out.println(num1 + oper + num2 + " = " + cal.getDiv());
        break;
      default:
        System.out.println("연산자를 잘못 입력했습니다.");
    }

  }
}
