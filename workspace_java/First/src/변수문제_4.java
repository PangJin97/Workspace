public class 변수문제_4 {
  public static void main(String[] args) {

    int a =10;
    int b =20;

    System.out.println("a = " + a); //10
    System.out.println("b = " + b); //20
  //직접 숫자를 넣지말고 a와 b에 10, 20이 아닌 다른 숫자가
  //들어와도 a와 b의 있는 숫자가 바뀌어야함

  // 1.변수 c를 만들고, b의 값을 c에 넣는다.
  // 2. a 값을 b에 넣는다.
  // 3. c의 값을 a에 넣는다 .

    int c = 20;
    b = a;
    //b는 가지고 있던 20이 사라지고 a의 10을 가져온다
    a = c;
    //a는 가지고 있던 10이 사라지고 c가 가지고 있던 20을 가져온다.

    System.out.println("a = " + a); //20
    System.out.println("b = " + b); //10

/*
* 핵심은 선언한 변수에는 하나의 값만 있을 수 있다는 것 그래서
* 새로운 변수 c를 선언하고 거기에 값을 옮기는 것.
*
*/
  }
}
