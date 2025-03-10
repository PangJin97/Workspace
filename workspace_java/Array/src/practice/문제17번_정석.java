package practice;

public class 문제17번_정석 {
  public static void main(String[] args) {
    int [] lotto = new int [6];

    for(int i = 0; i < lotto.length; i++){
      lotto[i]=(int)(Math.random()*45 + 1);
      //배열의 모든 요소의 1~45까지의 랜덤한 숫자 지정
    }
    for(int i = 0; i < lotto.length; i ++){
      System.out.println(lotto[i]);
      //배열의 모든 요소 출력
    }
  }
}
