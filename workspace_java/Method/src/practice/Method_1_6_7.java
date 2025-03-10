package practice;

public class Method_1_6_7 {
  public static void main(String[] args) {
    printInt(30,10);
    printInt("IZUMO","TENKA");
    //호출도 여러번 할 수 있다.

  }
  public static void printInt(int num1, int num2){
    System.out.println(num1/num2);
    System.out.println(num1%num2);
  }
  public static void printInt(String A, String B){
    System.out.println(A + B);
  }
}
