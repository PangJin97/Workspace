package study;

/*
* method 의 리턴타입
* -메서드의 실행결과, 리턴되는 데이터의 자료형
* -리턴 : 메서드를 호출하는 곳에 리턴메서드의 결과값(리턴값)을 툭 던져줌
*
* -리턴되는 데이터의 자료형과 메서드의 리턴타입은 반드시 일치
* -return 명령어는 실제 데이터를 리턴하는 역할을 하며
* -return 명령어 뒤에는 어떠한 코드도 올 수 없다!
* -메서드에서 return 명령어는 한 번 만 실행할 수 있다.
*
*-호출된 메서드에서 되돌려받은 값을 쓸 수 있음
*
* */

public class Method_5 {
  public static void main(String[] args) {
    int a = aaa();
    System.out.println(a);
    //aaa(); 이라는 내가 만든 메서드(함수)의 결과값(리턴값)이 3이니까
    //호출받은 곳에서 3을 툭받아서(되돌려받아서),
    //aaa(); = 3

    //a = 3

   int sum = bbb(10,20);
   //리턴받은 데이터는 우리가 받아서 쓸 수 있다
    System.out.println(sum);

  }
  public static int aaa(){
    System.out.println(5);
    //단순히 5를 출력한다는 의미

    //메서드 실행 후 3을  리턴하겠습니다.
    //리턴타입과 리턴값의 자료형이 일치해야한다
    return 3;
    //return 5; 리턴은 한번만 실행 가능.
  }


  //return 명령어를 한번만 실행 할 수 있다의 의미
  public static int ccc(){
    //두 수 중 큰 수를 리턴
    int a = 5;
    int b = 10;

    if(a > b){
      return a;
    }
    else{
      return b;
    }
  }
  //작성이 아니라 '실행'이다!


  // 매개변수로 전달된 두수의 합을 리턴하는 메서드
  public static int bbb(int num1, int num2){
    return (num1 + num2);
    //System.out.println("222"); 리턴 뒤에는 코드 못옴
  }

}


