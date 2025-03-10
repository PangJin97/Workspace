package study;

public class CakeTest2 {
  public static void main(String[] args) {

    /*
    Cake c1 = new Cake();
    CheeseCake c2 = new CheeseCake();
    StrawberryCheeseCake c3 = new StrawberryCheeseCake();
    */

    Cake c1 = new Cake();
    Cake c2 = new CheeseCake();
    Cake c3 = new StrawberryCheeseCake();

    //다형성 적용

    //각기 다른 클래스 자료형을 공통된 자료형(부모클래스)형태로
    //할 수 있다. -> 배열과 리스트에 활용할 수 있고, 반복문 돌릴수 있다
    //한번에 관리하기 편함


    /*
     c1.eatCake();
    c2.eatCheeseCake();
    c3.eatStrawberryCheeseCake();
    */

    //3개의 객체를 쓰면 각각 3개의 클래스의 내용을 전부 파악해야한다
    // => 너무 많아

    // =>메서드 명을 통일
    //메서드 오버라이딩!


   c1.eat();
   c2.eat();
   c3.eat();

   // => 재정의한 메서드만 호출 가능



  }
}
