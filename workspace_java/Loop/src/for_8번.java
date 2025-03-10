import java.util.Queue;
import java.util.Scanner;

public class for_8번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print(" 정수를 입력 받으세요 : ");
    num=sc.nextInt();

    int i; //반복을 시작할 변수
    int cnt = 0; //짝수 갯수를 받는 변수

    for(i = 0; i < num; i++){
      if(i % 2 ==0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
