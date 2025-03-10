package Study;

public class AccountTest {
  public static void main(String[] args) {
    //계좌 생성
    //정확한 생성 문법 : 클래스명 객체명 = new 생성자호출.

    Account acc1 = new Account();
    acc1.printAccInfo();
    //new 뒤에 Account();는 사실은 생성자를 호출.

    // init 메서드(메서드로 초기값을 직접 주면 생기는 문제)
    //1. 초기값 세팅인데 그 전에 다른 코드 올수있음
    //2. 초기 세팅을 여러번 호출 할 수 있음.
    //=>그래서 생성자가 필요함.


  }
}
