public class 변수_2 {
  public static void main(String[] args) {

    //변수는 필요하면 여러개 만들 수 있음.
    int num1;
    num1 = 10;

    int num2;
    num2 = 20;

    //int num2; 변수명은 중복불가
    //int Num2; 오류 안남, 자바는 대문자 소문자 엄격하게 구분하기 때문에 다르다. 그래도 쓰지마라.

    //num1 변수와 num2 변수에 저장된 정수의 합을 출력
    System.out.println(num1 + num2);
    System.out.println("num1 + num2 = " + num1 + num2);
    System.out.println("num1 + num2 = " + (num1 + num2));
  }

}
