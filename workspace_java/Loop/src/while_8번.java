import java.util.Scanner;

public class while_8번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print(" 정수를 입력하세요 : ");
      num = sc.nextInt();

      int i = 0; //반복 시작 숫자
      int cnt = 0; //짝수의 갯수를 저장할 숫자

      //1부터 num까지 반복
      while (i < num){
      //숫자가 짝수라면..
        if(i % 2 == 0){
        //짝수의 개수를 1증가
          cnt++;
        }
        i++; //반복을 한번 할때마다 i을 1증가 시킨다.
      }
    System.out.println(cnt);
  }
  }