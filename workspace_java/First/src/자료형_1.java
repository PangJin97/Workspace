
/*
*
* 자료형(date type)
* 자바의 자료형은 크게 기본자료형, 참조 자료형으로 구분.
* 기본자료형(primivite type) 8개 존재, 8개 모두 소문자로 시작.
* 참조자료형은 무한대.
*
* --기본자료형--
* 참과 거짓: boolean -> true, false
* 정수: byte, short, int, long
* 실수: float, double
* 문자: char
*
* ->
* 문자열 vs 문자
* 문자 : 한 글자 동시에 ''표로 감싸짐
* 문자열 : 여러 글자 !! "" 쌍따옴표에 싸여진 글자
* ex > 1. 'a' : 문자  2. "java" :  문자열 3. "A" : 문자열 4. "" : 문자열
* 자바의 기본자료형에는 문자열을 저장할 "기본'자료형을 제공하지 않는다.
* 문자열 참조 자료형: String
*
*
*
*
* */

public class 자료형_1 {
  public static void main(String[] args) {

  //참과 거짓
    boolean a = true;
    boolean b = false;
  //boolean c = "trust"; 주의 trust넣을때 문자열이라고 착각하지말고 "" 넣지말라고
    System.out.println(a);

  //정수
    int d  = 1;
    byte e = 1;
    short f = 1;
    long g = 1;  //정답은 아님
  // 기본적으로 정수는 int로 해석하는데 long이 정수보다 범위가 커서 1;로 끝내도 문제가 되지 않지만 정확히 하면
  // Long g = 1L이 맞음
  //Long > i

  // 실수
    double h = 1.5;
  //float I = 1.5;
  // 실수는 일반적으로 double로 해석하는데 double이 더 작은 범위기 때문에 오류가 뜬다.
  //그래서 1.5F;로 해야함
  //float > double

  // 문자열
    String s = "hello";
  //문자열은 기본자료형이 없다. 참조 자료형
     System.out.println(s);

  }
}
