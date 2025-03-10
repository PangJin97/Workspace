package study;

public class ChefTest {
  public static void main(String[] args) {
    Chef c1 = new Chef();
    c1.makeCook();

    MasterChef c2 = new MasterChef();
    c2.makeCook();
    //부모 클래스에서 물려받은 메서드를 자식 클래스에서
    //오버라이딩하면 자식클래스의 객체는 재정의한 메서드만 호출할 수 있다

  }
}
