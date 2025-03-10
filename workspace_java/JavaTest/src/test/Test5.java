package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    //문제 해결을 위한 변수
    Scanner sc = new Scanner(System.in);
    int[] baseball = new int[3];
    int[] answer = new int[3];
    int tryCnt = 0; // 도전횟수
    int strike = 0;
    int ball = 0;

    //크기가 3인 중복되지 않은 1~9까지의 랜덤한 정수가 담긴 배열생성
    for (int i = 0; i < baseball.length; i++) {
      // 1~9까지의 랜덤 정수를 저장
      baseball[i] = (int) (Math.random() * 9 + 1);
      //중복 제거는 => 값을 넣고 나서 판단
      //중복 검사
      for (int j = 0; j < i; j++) {
        if (baseball[i] == baseball[j]) {
          i--;
          break;
        }
      }
    }
    System.out.println("만들어진 숫자: " + Arrays.toString(baseball));
    System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

    while (true) {
      System.out.print(++tryCnt + " >> ");
      answer[0] = sc.nextInt();
      answer[1] = sc.nextInt();
      answer[2] = sc.nextInt();

      for (int i = 0; i < baseball.length; i++) {
        for (int j = 0; j < answer.length; j++) {
          //System.out.println("i = " + i+ ", j =" + j);
          if (baseball[i] == answer[j]) {
            if (i==j){
              //스트라이크
              strike++;
            }
            else{
              //볼
              ball++;
            }
          }
        }
      }
      System.out.println(strike + "S, " + ball + "B");

      if(strike == 3){
        System.out.println(tryCnt + " 회 만에 정답을 맞췄습니다");
        break;
      }
      else{
        strike = 0;
        ball = 0;
      }
    }
  }
}