package practice;

import java.util.Arrays;
import java.util.Scanner;

public class 문제11번_풀이 {
  public static void main(String[] args) {
    // ----------------변수 선언---------------------//
    Scanner sc = new Scanner(System.in);

    //0번째 요소: 국어, 1번째: 영어 , 2번째: 수학, 3번째 : 평균
    int[]scores = new int[4];

    //만약 과목이 늘었다면?
    // new int 4 - new int [6]
    //과목명 배열안에 있는 값을 { "국어","영어","수학" ,"사회","과학"}


    //과목명을 저장하고 있는 배열
    String[]subjects = {"국어", "영어", "수학"};
    //평균
    double avg  = 0.0;


    // ==================점수 입력 ==================//

    //점수 제대로 입력받으려면 무한루프

    //0~100점 사이의 값을 입력받을 때까지 반복

    //'과목수'만큼 반복
    //총길이에서 -1을 하면 i=3이되고 0,1,2 번째 요소(과목들)들을 반복.
    for(int i = 0; i < scores.length - 1; i++) {

      while (true) {
        System.out.print(subjects[i] + " 점수 입력 : ");
        //문자열 "국어 점수 입력"만 반복하면 안되니까
        scores[i] = sc.nextInt();
        //국어점수만 반복되면 안되니까
        //scores[0]을 i로 바꿔준다.
        //무한루프문도 마찬가지

        //입력받은 점수가 0~100사이면 반복문 벗어남.
        if (scores[i] >= 0 && scores[i] <= 100) {
          break;

          //만약 101 을 넣거나 -1을 넣었다면
          //반복 실행코드가 쭉 내려오다가 걸려서 정상적인 값을
          //입력받기 전까지 계속 while 문 반복한다.

          //정상적인 값을 입력 받으면
          //가장 가까운 반복문을 벗어난다.
          //그리고 while 문을 벗어나고 그 후에 i ++ 한다.
        }
      }
    }

      //======================총점, 평균====================//

    //scores[3]
    //총점은 배열의 마지막 요소
    //scores[scores.length - 1]

    //만약 배열이 {1,2,3,4,5}로 나열되있다면
    //길이는 5이고 마지막 요소는 arr[4]이다.

    //즉 총길이에서 -1한 값이
    // arr[i]에서 i 부분에 들어가면 마지막 요소가 된다.

      //과목수만큼 반복해서 총합한 총점을 계산.
      for(int i = 0; i < scores.length -1; i++){
        scores[scores.length-1]= scores[scores.length-1] + scores[i];


        //scores[scores.length-1]이 총점을 담는 요소니까.

        //sum = 0;
        //sum = sum + i랑 구조가 같다.
      }

      //평균

      avg = scores[scores.length-1] /(double)(scores.length-1);


      //결과 출력

    System.out.println();
    System.out.println("****** 입력하는 정보로 점수 정보를 출력합니다. ******");


    //각 과목의 점수를 출력
    for(int i = 0 ; i < scores.length-1; i++){
      System.out.println(subjects[i] + "점수 = " + scores[i]);
    }
    //국어점수 = 90
    //영어점수 = 80

    //총점
    System.out.println("총점 = " + scores[scores.length-1]);

    //평균
    System.out.println("평균 = " + avg);
  }
}
