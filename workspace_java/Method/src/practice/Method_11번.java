package practice;

public class Method_11번 {
  public static void main(String[] args) {
    printInt(23, 40);

  }
  public static void printInt(int num1, int num2){
    if(num1%2==0 && num2%2==0){
      System.out.print("짝수 입니다");
    }
    else if(num1%2 != 0 && num2%2 != 0){
      System.out.print("홀수입니다.");
    }
    else{
      System.out.println("한 정수만 짝수입니다.");
    }
    }
  }

  //항상 문법의 틀부터 만들고 생각하자.
  //나머지가 1일때 홀수로 푸셨다. num1 == 1

