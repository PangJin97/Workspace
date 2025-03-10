import java.util.Scanner;

public class While_11번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    System.out.print("첫번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    num2 = sc.nextInt();

    //두 수 중 큰 수와 작은 수를 구분
    int min = num1 > num2 ? num2 : num1;
    int max = num1 > num2 ? num1 : num2;


    //num : 1, num2 : 10 먼저 가정해보자
   // 1 ~ 10사이 즉  2~9 사이를 반복하여 합해야 하니.
    //최소(시작)은 num1 + 1, 끝은 num2(어차피 범위가 num2보다 작으니 포함안됨 그냥 넣음)
    int i = min + 1;
    int sum = 0;
    while (i < max){
      sum = sum + i;
      i++;
    }
    System.out.println(sum);
  }
}
