package study;

public class Method_3 {

  /*
  *
  * 매개변수가 있는 매서드
  *
  * 매개변수 : 매서드의 정의 부분에 () 영역에 작성한 변수를 '매개변수.'
  *
  * 매개변수가 하는 역할 : Method는 매개변수를 통해 외부로부터 메소드의 기능을 수행하는데 필요한 데이터를 받아들인다.
  *
  * 물론
  * 매개변수는 외부로부터 데이터를 받지 않고 맴버 변수만으로 기능을 처리할 수 있다. 이런 경우는 매개변수를 선언하지 않는다.
  *
  *
  *
  * 참고로 리턴 타입도 있을 수도 있고 없을 수도 있다.
  *
  * */


  //원하는 숫자를 출력하는 메서드 정의
  public static void printNum(int num){//int num  = 10;
    System.out.println(num);
    //원하는 숫자를 출력하기 위해선 매개변수 int num이 필요하다.


    //매개변수의 자료형(int num 의 int)과  실제로 넣은 데이터(5)의 자료형이 동일하다.
    //갯수도 동일하다. (int num 하나 , 5 하나)


    //매서드 선언시 매개변수의 자료형과
    // 매서드 호출시 사용한 자료형이 같아야한다.


    //매개변수의 자료형이 다르면 오류!
    //printNum("java"); 오류!

    //매개변수의 갯수가 달라도 오류!
    //printNum(10, 30); 오류!


  }

  public static void main(String[] args) {
    printNum(5);
   //매개변수 int num 에 5가 저장
    printNum(10);
    printNum(20);
  }
}

//
