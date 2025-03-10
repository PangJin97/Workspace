import java.util.Scanner;

public class 문제_1_1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1;
    String grade;

    System.out.print("임의의 값 : ");
    num1 = sc.nextInt();

    if(num1 > 90 && num1 <= 100 ){
      grade = "A";
    }
    else if(num1 > 80 && num1 <= 90){
      grade = "B";
    }
    else{
      grade = "C";
    }
    //문제에 나온 조건이 3개라서 else if 넣어도 된다.

    //else if의 num1 <= 90은 안써됨 위에서 걸리짐
    //코드는 위에서 내려오기 때문에 걸러진다,

    System.out.println("학점은 " + grade + " 입니다");

  }




}
