package practice_diff;

public class method_2 {
  public static void main(String[] args) {

   test2(5);


  }
  public static void test2(int num1) {

    for (int i = 1; i < 101; i++) {
      if (i % num1 == 0) {

        System.out.print(i + " ");
      }
    }
  }
}
