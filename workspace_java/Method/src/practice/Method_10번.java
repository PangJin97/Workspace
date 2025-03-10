package practice;

public class Method_10번 {
  public static void main(String[] args) {
    //printLn()매소드의 인자가 5가 전달되었다.
    //정의된 매개변수에 전달되는 데이터를 인자라고 한다.
    printInt(43);

  }
  public static void printInt(int num){
    //메서드를 정의할때 정의되는 매개변수
    //매개변수는 변수명이 아니라 자료형이 중요.
    if(num%2==0){
      System.out.println("짝수입니다");
    }
    else{
      System.out.println("홀수입니다");
    }
  }
}
//삼항 연산자로도 풀이 가능함.
//if else 문은 대부분 삼항 연산자 가능
//System.out.println(num % 2 == 0 ? "짝수입니다" : "홀수입니다");


