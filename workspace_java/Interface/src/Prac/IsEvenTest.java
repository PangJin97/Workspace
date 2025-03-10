package Prac;

public class IsEvenTest {
  public static void main(String[] args) {
    MathUtil test = new IsEven();

    boolean result = test.isEven(5,5,10);
    System.out.println(result);

    double result1 = test.getSumFromOne(5);
    System.out.println(result1);

    double result2 = test.getCircleArea(30);
    System.out.println(result2);
  }

}
