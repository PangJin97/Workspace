package ObjectClass;

//클래스가 명시적으로 상속을 받고 있지 않으면
//자동으로 Object 클래스를 상속 받습니다.

//자바는 문법적으로는 단일 상속이지만
//모든 클래스는 Object 클래스를 상속 받고 있다
//그래서 Object 클래스 는 최상위 클래스(최상위 부모) => 다형성
//모든 클래스의 객체는 Object 클래스로 다 받을 수 있다.


//다형성 : 부모클래스로 자식클래스의 객체 생성 가능, 그렇게 생성된 객체는
//부모 클래스의 메서드만 사용가능


public class Tv extends Object {

  int num;
  String name;

  public void turnOn(){
    System.out.println("Tv 전원 켬");
  }

  //Object 클래스의 toString()메서드를 오버라이딩

  /*

  @Override
  public String toString() {
    return super.toString();
  }

  */

  //@Override 메서드가 오버라이딩 문법에 맞는지 확인!

  /*
  @Override
  public String toString() {
    return "이것은 TV 입니다";
  }
  */

  //재정의 하기
  //덮어씌어서 재정의하기

  //통상적으로 현재 객체가 가진 모든 멤버변수의 값을 문자열로 표현

  /*

  @Override
  public String toString() {
    return "num =" + num +", name=" + name;
  }
  일일이 변수 하나하나 쓰기  번거롭다
  */

  //=> 결론! alt insert => toString

  @Override
  public String toString() {
    return "Tv{" +
            "num=" + num +
            ", name='" + name + '\'' +
            '}';
  }
  //오브젝트 클래스에서 상속받은 메서드를 재정의해서 쓰는거다
}





