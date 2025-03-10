package practice;

public class 문제16번 {
  public static void main(String[] args) {
    //자바에서 랜덤 숫자를 발생시키고 싶을 때는
    //Math.random()명령어를 사용!
    //Math.random() : 0 <= x < 1.0 사이의 랜덤한 실수값 생성
    double r = Math.random();
    System.out.println(r);

    //0부터 10까지의 랜덤한 정수를 생성
    int I = (int)(Math.random() * 51) + 50;
    //(0.0  ~  51.0 ) + 50
    System.out.println(I);
    //계속 0만 나오는데 *10을 안함 그래서 괄호넣기
  }
}
