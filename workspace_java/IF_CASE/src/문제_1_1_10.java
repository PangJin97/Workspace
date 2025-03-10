import java.util.Scanner;

public class 문제_1_1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1;
    int num2;
    int num3;

    System.out.print("첫번째 수 : ");
    num1=sc.nextInt();
    System.out.print("두번째 수 : ");
    num2= sc.nextInt();
    System.out.print("세번째 수 : ");
    num3=sc.nextInt();

    if( num1 > num2 && num1 > num3 && num2 > num3 ){
      System.out.println(num1 + " > " + num2 + " > " + num3);
    }
    else if( num1 > num2 && num1 > num3 && num3 > num2 ){
      System.out.println(num1 + " > " + num3 + " > " + num2);
    }
    else if( num2 > num1 && num2 > num3 && num1 > num3 ){
      System.out.println(num2 + " > " + num1 + " > " + num3);
    }
    else if( num2 > num1 && num2 > num3 && num3 > num1 ){
      System.out.println(num2 + " > " + num3 + " > " + num1);
    }
    else if( num3 > num1 && num3 > num2 && num2 > num1 ){
      System.out.println(num3 + " > " + num2 + " > " + num1);
    }
    else if( num3 > num1 && num3 > num2 && num1 > num2 ){
      System.out.println(num3 + " > " + num1 + " > " + num2);
    }














  }
}
