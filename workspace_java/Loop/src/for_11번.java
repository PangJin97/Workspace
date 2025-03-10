import java.util.Scanner;

public class for_11번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1,num2;

    System.out.print(" 첫번째 정수 : ");
    num1=sc.nextInt();
    System.out.print(" 두번째 정수 : ");
    num2=sc.nextInt();

    int sum=0;
    int max = num1 > num2 ? num1 : num2;
    int min = num1 > num2 ? num2 : num1;

    for(int i = min+1; i < max; i++){
      sum = sum+i;
    }
    System.out.println(sum);
  }
}
