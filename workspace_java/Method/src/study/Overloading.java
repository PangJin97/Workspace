package study;

//Method Overloading
//매서드 명을 중복 불가하다.
//하지만 메서드의 '매개변수 정보(매개변수의 갯수, 매개변수의 자료형)'가 다르면
//중복된 이름으로 매서드 명을 작성을 허용
public class Overloading {
  public static void main(String[] args) {
    System.out.println(true);
  }

  //문자열
  public static void println(String str){
    System.out.println(str);
  }
  //정수
  public static void println(int num){
    System.out.println(num);
  }
  //정수의 갯수
  public static void println(int num, int num2){
    System.out.println(num);
  }
}

//println으로 메서드 명이 동일하지만 자료형이 다르고(문자열, 정수)
//갯수(1개 , 2개)다르기때문에 메서드명이 동일해도 넘어간다.
//이것이 오버로딩

//매개변수가 다를때마다 메서드명을 계속 생성해야하는데 그러면 끝도 없으니
//매개변수의 자료형과 갯수가 다르다면 메서드명이 같아도 메서드명 중복이 가능하다.



//중요한건 매개변수의 자료형과 갯수!!!!굉장히 중요!!!
