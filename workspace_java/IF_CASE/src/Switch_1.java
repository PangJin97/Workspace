/*
* 조건문 - switch case break 문
*
* 조건이 범위라면 if문 사용이 코딩에 수월
* 조건이 특정값이라면 switch문 사용이 코딩에 수월
* */

public class Switch_1 {
  public static void main(String[] args) {
    int num = 2;

    //전반적인 형태
    switch(num){
      case 1:
        System.out.println(1);
      //num값이 1인경우 1을 출력
      //num이 1인 경우에는 ~~ 하겠습니다.
        break;
      //정지 , 멈춤 : 밑에 코드를 해석하지 않는다.
      case 2:
        System.out.println(2);
        System.out.println(2);
        //case안에는 여러줄 적을 수 있다
        break;
      case 3:
        System.out.println(3);
        break;
      default:
        System.out.println(4);
      //break; default에서 끝나는데 굳이? 써야함
      //위에 3가지 케이스가 아닌 경우
    }
    // 조건이 맞은 case부터 아래의 모든 내용을 실행
  }
}
