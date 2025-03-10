package Study;

//멤버변수는 초기값을 갖는 것이 좋은 코드 습관.
//선언과 동시에 초기화하는 건 바람직하지않다.

//계좌 정보
public class Account {
  String accNumber; // "11111-2222"
  int money; // 예금액
  String owner; // 계좌주

  //생성자(constructor) - 멤버변수의 초기값을 할당할 목적.(초기화)
  //생성자는 메서드의 일종이다라고 생각.

  //만약 클래스에 생성자가 하나도 없다면 자동으로 '기본 생성자'를 생성한다.
  // ->내용이 없지만 내부적으로 만들어짐

  /*
  (기본 생성자(default 생성자)
  public  Account(){

  }
  */
  //이렇게 내용이 없으면 숨겨진 채로 나오고

  public Account(){
    accNumber = "지정되지 않음";
    money = 10000;
    owner = "지정되지 않음";
  }
  //기본생성자안에 내용이 없으면 null, 0, null로 나옴
  //기본 생성자 안에서 내가 직접 초기값을 줄 수있다.

  //멤버변수의 값을 초기화하는 기능.
  public void initAcc(String accNumber, int money, String owner){
    this.accNumber = accNumber;
    this.money = money;
    this.owner = owner;
  }


  //매개변수로 전달된 금액을 예금액에 더하는 매서드
  public void moneyPlus(int money){
    this.money = money + this.money;
  }


  public void printAccInfo(){
    System.out.println("계좌번호 : " + accNumber);
    System.out.println("예금액: " + money);
    System.out.println("계좌주 : " + owner);

  }





}




