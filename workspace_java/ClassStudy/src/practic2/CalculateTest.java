package practic2;

import java.util.Scanner;

public class CalculateTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수: ");
    int a = sc.nextInt();
    System.out.print("두번째 수: ");
    int b = sc.nextInt();
    System.out.print("연산자: ");
    String oper = sc.next();

    switch (oper){
      case "+":
        _Add add =new _Add();
        add.setValue(a,b);
        System.out.println(a + oper + b + "=" + add.calculate());
        break;
      case "-":
        _Sub sub = new _Sub();
        sub.setValue(a,b);
        System.out.println(a + oper + b + "=" + sub.calculate());
        break;
      case "*":
        _Mul mul = new _Mul();
        mul.setValue(a,b);
        System.out.println(a + oper + b + "=" + mul.calculate());
        break;
      case "/":
        _Div div = new _Div();
        div.setValue(a,b);
        System.out.println(a + oper + b + "=" + div.calculate());
        break;
      default:
        System.out.println("연산자를 잘못 입력하셨습니다.");
    }
  }
}
