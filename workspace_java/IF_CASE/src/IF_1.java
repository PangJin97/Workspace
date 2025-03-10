//조건문 : if문
//조건문 : 조건이 맞을 때만 코드를 실행하는 문법
/*
*
* if(참 또는 거짓을 판단할 수 있는 조건){
*    실행코드....
*    실행코드....
* }
*
* if문에는 ;이 붙지 않는다.
* */

public class IF_1 {
  public static void main(String[] args) {
    System.out.println("시작");


    int num = 3;
    if(num == 3){
      System.out.println("aaaaa");
      System.out.println("aaaaa");
      System.out.println("aaaaa");
    }

    //조건에 따른 실행코드가 한 줄만 있을 때 중괄호 생략가능
    //초보자면 한줄이라도 {}넣는게 좋다.
    if(num > 5)
      System.out.println("bbb");


    //먼저 조건문 틀 부터 만들고 하자
    //(조건)이 참이면 {실행코드}을 실행 거짓이면 실행하지 않는다.
    //조건문은 여러개 쓸 수 있다.

    System.out.println("끝!");
  }
}
