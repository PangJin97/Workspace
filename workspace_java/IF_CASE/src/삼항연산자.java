public class 삼항연산자 {
  public static void main(String[] args) {
    //a + b
    int a = 3;
    int b;


    if(a>5){
      b = 1;
    }
    else{
      b = 2;
    }

    b = a > 5 ? 1 : 2;
    //a가 5보다 크니? 참이면 1 , 거짓이면 2
    //삼항연산자로 '변수 저장'하기


    System.out.println(b);


  //참 또는 거짓을 판별하는 조건  ?  참일 때 실행내용 : 거짓일때 실행내용;
  // if else 문을 웬만하면 바꿀 수 있다.
  //num이 5이면 "참" 출력, 그렇지 않으면 "거짓" 출력

  int num = 5;
  if(num==5){
    System.out.println("참");
  }
  else{
    System.out.println("거짓");
  }

    System.out.println( num == 5 ? "참" : "거짓" );
  //삼항연산자을 '출력문' 안에서 넣을 수 있다.




    //문제!
    //키보드로 정수 두 개를 입력받아,
    //입력받은 수 중에서 큰 수는 max라는 변수에 저장하고,
    //작은 수는 min이라는 변수에 저장.
    int num1 = 3;
    int num2 = 7;
    int max;
    int min;

    max = num1 > num2 ? num1:num2;
    min = num1 > num2 ? num2:num1;

    //if else문은 삼항 연산자로 바꾸는 연습


  }
}
