package study;

public class Method_4 {

  public static void main(String[] args) {
    printSum(10, 20);
    //이름 동일, 매개변수 자료형과 갯수가 동일.
    //printSum(10); 매개변수 갯수 불일치
    //printSum(20, "java"); 매개변수 자료형 불일치
  }

  //두 수의 합을 출력하는 메서드 정의 int num1 = 10, int num2 = 20
  public static void printSum(int num1, int num2){
    System.out.println(num1 + num2);
  }
}
