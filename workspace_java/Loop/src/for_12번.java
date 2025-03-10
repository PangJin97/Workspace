public class for_12번 {
  public static void main(String[] args) {


    int sum = 0;//합을 저장할 변수

    int i = 1;
  //굳이 for문에서 바깥쪽에 시작변수를 둘 필요는 없지만
  // 변수는 해당 변수가 선언된 중괄호 안에서만 사용가능 하기 때문에. 바깥에
    for(i = 1; i < 100; i++){
      sum = sum + i;
      if(sum > 300){
        break;
      }
    }
    System.out.println("합 : " + sum);
    System.out.println("마지막에 더해진 값 : " + i);
  }
}

