public class 변수문제_3 {
  public static void main(String[] args) {
    int num1;
    double num2 =10.7;


    num1 = (int)num2;
    System.out.println(num1);

  }
}

/*
* num1은 정수 num2는 실수
* 근데 실수는 정수에 넣지 못한다.( = 은 우측의 값이 왼쪽으로 들
* 어간다는 뜻)
* 그래서 num2를 정수로 강제 변환 (int)num2
* num2가 정수로 바뀌어서 10으로 바뀜
*
* 강제 행 변환
*
* */