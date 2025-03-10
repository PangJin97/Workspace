package study;

//오버라이딩은 상속관계에서만 가능

//상속 관계에 있는 두 클래스에서
//자식 클래스에서 부모클래스의 메서드 명과
//매개변수 정보를 동일하게 작성해도 메서드 선언을 허용
//이것을 메서드 오버라이딩.

//오버라이딩을 하면 부모클래스에서 정의한 메서드를 덮어쓰기때문에
//부모클래스에서 정의한 메서드 호출 불가

//오버로딩은 관계없다.

public class Chef {
  public Chef(){
  }
  //부모 클래스에 매개변수가 없는 생성자

  public void makeCook(){
    System.out.println("쉐프가 요리합니다");
  }
}


class MasterChef extends Chef{

  public MasterChef(){
    super();
    //부모클래스의 생성자에 매개변수가 없으므로 super()이 숨겨져있다.
  }

  public void makeCook(){
    System.out.println("마스터가 요리합니다.");
    //chef 클래스의 makeCook()메서드와 동일
    //덮어 씌우기, 물려받은 메서드를 새롭게 재정의
    // => 이것이 오버라이딩
  }

  public void giveOrder(){
    super.makeCook(); //부모클래스에서 정의한 클래스 호출)
    makeCook();
    this.makeCook(); //이 클래스에서 선언한 클래스 호출
    System.out.println("후임에게 지시합니다.");
  }
}
