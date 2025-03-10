public class 연산자_1 {
  public static void main(String[] args) {

    // 1. 산술연산자( +,  -,  *,  /, %)

    System.out.println(6 % 2);
    System.out.println(8 % 3);
    // % : mod(모드) 연산자: 나눗셈의 나머지


    System.out.println();


    System.out.println(8 / 3);
    System.out.println(8.0 / 3);
    /*자바에서는 정수끼리의 연산은 무조건 정수로 결과가 나옴*/
    /*실수가 하나라도 섞이면 실수가 나온다.*/

    int a = 8;
    System.out.println((double) a / 3);

    // + : 산술 연산자와 문자열과 문자열을 연결하는 연산자.
    //문자와 문자,숫자의 결합은 문자열
    //더하기 연산자로 동작하려면 괄호를 이용하여 우선순위 높이기/



    System.out.println();



    /* 2. 비교연산자( > , < , >= , <= , == , != )

    * ' == ' : 같다 ,' != ' : 다르다

    * 참과 거짓을 판단할때 사용한다.*/

    System.out.println(5 > 1);
    System.out.println(3 == 3);
    //비교 연산자도 true와 false라는 결과를 출력한다.
    //( )안에 연산자가 있으면 연산 결과를 출력한다.


    // 3. 논리 연산자

    //두 개 이상의 비교 연산 결과를 연결할때 사용

    //그리고 : ' && '  --> 양쪽의 연산결과가 참이여야 true, 하나라도 거짓이면 false로 출력된다.
    //이거나, 또는, or : ' || '  --> 양쪽의 연산결과 중 하나만 참이여도 true.

    // ' | ', '  &  ': 하나만 존재할 수 있음
    // 3 > 1 | 2 < 1  두개면은 뒤에 것 해석할 필요 없는데 | 하나는 해석해야한다.
    //이렇듯 하나만 쓰면 다른 한쪽도 해석한다.


    System.out.println(3 > 1);
    System.out.println(3 > 1 && 2 < 4 );

    System.out.println(1 == 1 && 2 > 1 || 3 > 5 && 1 < 4);
    // and(&&)와 or(||)이 같이 쓰이면 and(&&)가 우선순위가 높다.

    // 길어지면 &&부분에 괄호 넣기
    // ((1 == 1 && 2 > 1) || (3 > 5 && 1 < 4))




    /*4. 복합 대입 연산자*/

    int num = 3;

    /* num 값을 1증가 '시키는' 코드*/

    num = num + 1;
    num += 1; //복합대입 연산자.
    System.out.println(num);

    num *= 3; //num = num*3

    //변수 num에 3을 곱하고 그 값을 num에 저장한다.

    num -= 4; //num = num-4
    num /= 2; //num = num/2
    num %= 2; //num = num%2



  }
}
