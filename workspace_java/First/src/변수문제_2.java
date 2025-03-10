public class 변수문제_2 {
  public static void main(String[] args) {
    int a = 1;
    double b = 2.2;
    b = a;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}

/*
* a에는 정수 1이 담겨있고  b에는 실수 2,2가 담겨있다.
* b = a;로 인해 b에 담겨있던 2.2는 사라지고 1이들어가는데
* b의 자료형은 실수니까 1이 1.0으로 변한다.
* 그래서 결과값은 a = 1
* b = 1.0
*
* 자동행변환
*
* */
