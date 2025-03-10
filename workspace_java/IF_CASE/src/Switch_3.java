public class Switch_3 {
  public static void main(String[] args) {

/*
*  0~100사이의 임의의 정수를 변수에 저장하고
*  90 <= x <= 100 -> 문자열 'A'를 출력
*  80 <= x <= 89 -> 문자열 'b'를 출력
*  70 <= x <= 79 -> 문자열 'c'를 출력
*   x <= 69 -> 문자열 'd'를 출력
* */
    int num;

    num=89;

    switch(num / 10){
      case 10 :
      case 9 :
        System.out.println("A");
        break;
      case 8 :
        System.out.println("B");
        break;
      case 7 :
        System.out.println("C");
        break;
      default:
        System.out.println("D");
    }
  }
}
