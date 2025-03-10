package study;


//클래스 선언문에서 클래스명 다음에 extends '상속할 클래스명' 문법을 적용하면
//상속을 사용할 수 있음.
//상속을 사용하면 상속하는 클래스의 멤버변수, 메서드를 물려 받는다.
//물려받는다 : 멤버변수와 메서드를 내 것처럼 사용 가능.
public class BusinessMan extends Man{
   String company;

  //자식 클래스는 부모클래스의 멤버변수 , 메소드를 사용하기 위해
  //내부적으로 부모클래스의 생성자를 호출해서 객체를 하나 생성

  //부모 클래스의 생성자를 호출하는 코드는
  //자식 클래스의 생성자 첫줄에 숨겨져있다.

  //부모클래스의 생성자에 매개변수 정보가 없는 생성자라면
  //자식클래스 생성자 첫줄에 super()을 호출하는데 숨겨져있다.

  //부모클래스의 생정자에 매개변수 정보가 있는 생성자라면
  //자식 클래스 생성자 첫출에 super(매개변수)가 있어야함

  public BusinessMan(String company){
    super("java"); //부모클래스의 매개변수가 없는 생성자 호출, 숨겨져 있는 코드
    this.company = company;
  }

  public void tellCompany(){
    System.out.println("may company is " + company);
  }


}
