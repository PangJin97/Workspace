public class Rectangle {

  private int x1;
  private int y1;
  private int x2;
  private int y2;

  //x1, y1, x2, y2 값을 설정하는 생성자

  public Rectangle(){

  }

  public Rectangle(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  //매개변수가 있는 생성자 자동 완성 우클릭 Generate - > constructor

  //x1, y1, x2, y2의 좌표 변경(값 변경)
  public void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //사각형의 넓이를 리턴: 가로 * 세로
  public int square(){
    return (x2 - x1) * (y2 - y1);
  }

  //좌표의 넓이 등 직사각형 정보의 화면 출력
  // ex> 좌표 : (1,3), (2,5), 넓이 : 2
  public void show(){
    System.out.println("좌표: ("+x1+","+y1+")"+","+"("+x2+","+y2+")"+" , "+"넓이: "+square());
  }
  //인자로 전달된 객체 r과 현 객체가 동일한 넓이면 true 리턴
  public boolean equals(Rectangle r){
    if(square() == r.square()){
      return true;
    }
    else{
      return false;
    }
  }
}

/*
* 클래스와 객체의 관계

* 클래스(Class):

클래스는 객체를 생성하기 위한 설계도입니다.
클래스 내부에는 변수(필드), 메서드, 생성자 등이 정의됩니다.
예를 들어, Rectangle 클래스는 사각형을 표현하는 데 필요한 데이터와 동작(메서드)을 정의한 설계도입니다.

* 객체(Object):

객체는 클래스를 기반으로 메모리에 생성된 실제 데이터의 인스턴스입니다.
객체를 생성하려면 클래스의 생성자를 호출해야 합니다.
예를 들어, Rectangle rect1 = new Rectangle(0, 0, 3, 4);는 Rectangle 클래스의 객체를 생성하는 코드입니다.
*
*
* */

/*
*메인 메서드의 역할
자바 프로그램이 실행될 때 가장 먼저 호출되는 메서드가 main 메서드입니다.
main 메서드는 프로그램의 진입점(entry point) 역할을 하며, 프로그램 실행 중에 객체를 생성하고 메서드를 호출하는 데 주로 사용됩니다.
*
* */

/*
*  객체는 메인 메서드에서만 사용 가능한가요?
아니요! 객체는 메인 메서드 외에도 다른 메서드, 클래스 내부에서도 사용할 수 있습니다.

1. 클래스 내부에서 객체를 사용

* 클래스의 메서드에서 다른 객체를 생성하거나,
* 메서드 매개변수로 객체를 전달받을 수 있습니다.

* 예를 들어, Rectangle 클래스의 equals 메서드는 다른 Rectangle 객체를 '매개변수'로 받습니다:
public boolean equals('Rectangle r') {
    return this.square() == r.square();
}
여기서 this 는 현재 객체를, r은 외부에서 전달된 객체를 나타냅니다.
*

* 2. 다른 객체와 협력하는 클래스
객체는 클래스 내부에서 다른 객체와 협력하여 동작할 수 있습니다.
예를 들어, 두 사각형의 넓이를 비교하기 위해 equals 메서드는 'r.square()로 다른 객체의 메서드'를 호출합니다.

* 3. 메서드 호출 간 객체 전달
메인 메서드에서 생성한 객체를 클래스 내부의 메서드(equals)에 전달할 수도 있습니다.

예를 들어:
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 3, 4);
        Rectangle r2 = new Rectangle(1, 1, 4, 5);

        System.out.println(r1.equals(r2)); // r1 객체가 r2 객체와 비교
    }
}

*
*
*
* */
