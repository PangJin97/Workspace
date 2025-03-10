/*키보드로 국어 영어, 수학 점수를 입력받은후
* 입력 받은 국어, 영어, 수학 점수 및, 총점 평균을 출력
* 단 국어, 영어 , 수학 점수는 정수만 저장 된다고 가정*/

//문제를 해결하기 위해 필요한 변수 생각(변수 부터 생각)
//그 다음 자료형 판단하기

import java.util.Scanner;

public class 성적프로그램_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  //이거부터 복사하고

    int korScore;
    int engScore;
    int mathScore;
    int totalScore;
    double avg;

  //다음으로 변수 지정하기.


    System.out.println("국어 점수 : ");
  //콘솔에 입력할 장소 출력하기
    korScore = sc.nextInt();
  //자료형 판단하기,
  // 콘솔에서 입력한 것을 가져와서 저장하는 변수 초기화하기

    System.out.println("영어 점수 : ");
    engScore = sc.nextInt();

    System.out.println("수학 점수 : ");
    mathScore = sc.nextInt();


    totalScore = korScore + engScore + mathScore;
    avg = totalScore / 3;
    //변수의 초기화하기

    //총점과 평균은 입력받는 것이 아니라 출력만 하면 된다.
    //avg = totalScore / 3.0;
    //정수끼리의 연산결과는 무조건 정수로 나옴. 실수로 결과로 내고 싶으면 사이에 실수를 넣어야함

    System.out.println(" 국어점수 = " + korScore);
    System.out.println(" 수학점수 = " + mathScore);
    System.out.println(" 영어점수 = " + engScore);
    System.out.println(" 총점 = " + totalScore);
    System.out.println(" 평균 = " + avg);






//    System.out.print(" 국어 점수 : ");
//    int kor = sc.nextInt();
//    System.out.print(" 영어 점수 : ");
//    int eng = sc.nextInt();
//    System.out.print(" 수학 점수 : ");
//    int math = sc.nextInt();
//
//
//    System.out.println(" 총점 = " + (kor + eng + math));
//    System.out.println(" 평점 = " + ((kor + eng + math)/3));

  }
}
