public class 출력문_2 {
  public static void main(String[] args) {
    System.out.println(5+5);
    //소괄호 안의 내용이 연산 가능하면 연산 결과를 출력. 한 줄 개행도 당연히 된다 ln이니까
    System.out.println("5 + 5");
    //쌍따옴표에 작성된 모든 내용은 단순 문자로 인식

    System.out.println(3 + "3");
    System.out.println(3 + "안녕");
    //숫자와 문자의 합은 '나열'한 결과로 나온다.
    System.out.println("hi" + "hello");
    //문자와 문자와 합은 '나열'한 결과로 나온다.


    System.out.println(3+5+"a"+5);
    //문자가 하나라도 있으면 결과도 문자다 숫자가 아님.

    //shift + f10 결과
    }
}
