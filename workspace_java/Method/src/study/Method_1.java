package study;

public class Method_1 {
  public static void main(String[] args) {

    /*
    *
    *메서드(method): 반복 사용되는 기능을 하나의 기능상자(함수)로 표현한 것.
    * 이러한 것을 대부분의 언어에서는 함수라고 표현 함.
    *
    *Method 사용 방법
    *
    *
    * 1. Method 를 정의(하고 싶은 기능을 정의)
    * - Method 의 정의는 클래스 안,  그리고 또 다른 Method 밖에서 작성.
    *
    * - Method 의 정의 문법
    *
     * 접근제한자 static 리턴타입 메서드명(매개변수들){
     *     Method 의 내용.,,,
     * }
     *
     * 접근제한자는 무조건 public 으로 사용!
     * 접근 제한자 뒤에는 static 키워드를 사용!
     * //일단은 public static고정
     *
     * Method 명은 '소문자'로 작성
     * Method 는 필요한 만큼 다수 정의가 가능.
     * Method 명은 중복 불가.
     * 한 번 정의한 Method 는 여러번 호출 가능!
    *
    *
    *
    * 2. 정의된 Method 를 호출한다.(사용한다)
    * -정의된 메서드를 사용하기 위해서는 메서드 호출을 해야하는데,
    *
    * -호출을 하려면 정의한 매서드명과 동일해야 하고,
    * 동시에 매개변수 정보(매개변수의 자료형, 매개변수의 갯수 )가 동일해야함
    *
    *
    *
    * Method 를 정의하면
    * 메인 Method 에서 호출한다.
    *
    *  println(), random();
    * 메서드를 호출 한거임
    *
    *
    *  *sum(10,20) 우리가 아는 함수의 형태와 비슷
    *
    *
    * */

    System.out.println("프로그램 시작");

    //printHello() 메서드를 출력

    printHello();

    System.out.println("프로그램 종료");
  }


  //안녕하세요를 출력하는 메서드의 정의
  //정의했다고해서 실행되는게 아니다.
  //호출해야함

  public static void printHello(){
    System.out.println("안녕하세요.");
  }






}
