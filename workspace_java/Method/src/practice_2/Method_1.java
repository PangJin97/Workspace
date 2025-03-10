package practice_2;

public class Method_1 {
  public static void main(String[] args) {
    a(10,20);
    int b = a(10,20);
    System.out.println(b);
  }
  public static int a(int num1 , int num2){
    return (num1+num2);
  }
}
