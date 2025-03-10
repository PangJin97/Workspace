package study;

//변수는 사용 가능한(인식 가능한) 범위가 존재한다.
//변수의 사용 영역은 해당 변수가 선언된 { } 안에서만 가능!
// - > 선언된 위치에서만 사용가능하다.

public class 변수의사용영역 {
  public static void main(String[] args) {
    int num1 = 5;

    if(num1 > 3){
      //변수 num2는 if문 안에서만 사용 가능.

      int num2 = 10;
      System.out.println(num1);
      System.out.println(num2);
    }

    /*
    System.out.println(num1);
    System.out.println(num2);
    오류 발생
    */

    System.out.println();
    /// ///////////////////////////
   // int num3 = 15;
    //메인 메서드에서 인식한다
    //아래 num3모두가 오류남(변수 이름 중복)
    if(10 > 5){
      int num3 = 5;
    }

    if(3 > 1){
      int num3 = 10;
    }
    //중괄호 안에서만 인식 한다.

    /// ////////////////////////////////////////
    for(int i =0; i < 10; i++){
      //for문의 ()안에서 정의된 변수 i는 어디까지 사용 가능?
      //여기 for문 안에서만 사용가능함.

    }
    for(int i = 0; i < 10; i++){
      //마찬거지 여기의 i도 여기서만 인식 되기 때문에
      //중복되어도 상관없다.
    }
    /// /////////////////////////////////

    for(int i=0; i < 10; i++){
      int data = 1; //계속 반복해서 1로 초기화 됨, 변수를 반복문 안에 두는 걸 조심
      System.out.println("data = " + data);
      data++;
    }
  }
}

/*
*
* 1. 클래스 영역에 선언되는 '전역변수'는 선언된 영역 전체에서 사용 가능하다.
* 2. 조건문, 반복문, 메소드 안에 선언되는 '지역변수'는
*    그 내부영역에서 사용 가능하다.
*
* */
