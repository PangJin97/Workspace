package practice;

public class Method_1_3_4_5 {
  public static void main(String[] args) {
    printInt("hello");
    //3번
    printInt(10,20);
    //4번
    printInt(10,20,30);
    //5번
  }
  public static void printInt(String A){
    System.out.println(A);
  }
  //3번
  public static void printInt(int num1, int num2){
    System.out.println(num1+num2);
  }
  //4번
  public static void printInt(int num1, int num2, int num3){
    System.out.println(num1*num2*num3);
  }
  //5번

  //Method는 여러번 정의할 수 있다.
  //메서드 오버로딩 가능하네
}
