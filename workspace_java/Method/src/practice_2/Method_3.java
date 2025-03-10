package practice_2;

public class Method_3 {
  public static void main(String[] args) {
    test3(20,30);

    int b = test3(20,30);

    System.out.println(b);

  }
  public static int test3(int num1, int num2){
    return num1 > num2 ? num1 : num2;
  }
}
