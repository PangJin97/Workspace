package practice_2;

public class method_6 {
  public static void main(String[] args) {
    zero(20);

    String str = zero(20);
    System.out.println(str);

  }

  public static String zero(int num) {
    //숫자 - > 문자열
    String a = String.valueOf(10);
    //문자열 - > 정수
    int b = Integer.parseInt("10");

    return String.valueOf(num);
  }
}
