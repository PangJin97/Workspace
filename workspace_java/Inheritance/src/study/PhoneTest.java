package study;

public class PhoneTest {
  public static void main(String[] args) {
    MobilePhone p1 = new MobilePhone();
    SmartPhone p2 = new SmartPhone();

    //다향성 적용

    //부모클래스는 자식 클래스의 객체를 받아들임.
    MobilePhone p3 = new SmartPhone();

    // 모바일 폰 주세요 했는데 스마트폰 주면 받을 수 있다


    //SmartPhone p4 = new MobilePhone(); => 오류발생
    //스마트 폰 주세요 했는데 모바일 폰 주면 안받는다.
    //자식클래스는 부모 클래스의 객체를 수용하지 않음.

    //이렇게 선언한 객체는 부모클래스에서 선언한 메서드와 멤버변수만 사용가능

  }
}
