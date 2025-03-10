package Static_study;


//static 이 붙은 멤버변수는
//객체에 종속되지 않고, 모든 객체가 공유하는 데이터
//static 변수는 생성자에서 초기하지 않는다. 공통으로 관리하는 데이터가 항상 초기화 해서 안됨
//static 변수는 초기화 구문이 따로 존재.
//생성자보다 static 초기화가 먼저 진행된다.
//static 은 변수 및 메서드에 적용할 수 있다.

public class CountTest {
  public static void main(String[] args) {
    Count count1 = new Count();
    Count count2 = new Count();
    Count count3 = new Count();

    //cnt 값이 공유가 된다.

    System.out.println(count1.cnt);
    count2.cnt = 10;
    System.out.println(count1.cnt);
    //static 변수는 객체명.멤버변수; 의 문법으로 호출 권장하지 않는다.

    //static 변수는 클래스명.변수명;

    //객체를 따로 만들어 주지 않아도 된다. - > 생성자보다 static 초기화가 먼저 진행.
    System.out.println(Count.cnt);

    System.out.println(Math.PI);//static 변수
    System.out.println(Math.max(10,20));//static 매서드
  }



}
