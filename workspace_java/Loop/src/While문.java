/*
* 반복문(while, for)
* 특정 코드를 원하는 횟수만큼 반복적으로 실행하는 코드
*
*
*반복 시작 조건;
*
* while(반복 조건){
*    반복 실행할 코드
*    반복 실행할 코드...
*    반복을 파기할 조건
* }
*
* */
public class While문 {
  public static void main(String[] args) {
    int num = 0;
    //반복 시작 조건
    //0으로 잡고 시작하셈

    //num이 3보다 작을 동안(while) 반복하겠다.
    while (num < 3){
          //반복조건
      System.out.println("java");
      //반복을 실행할 코드
      num++;
      //반복을 파기할 조건.
      //위치는 상관없으니 통상적으로 마지막에서 온다.
      //해석순서가 굉장히 중요하니 헷갈리지 말자.
    }

  }
}
