package Static_study;

public class Count {
  static int cnt;

  //static 변수 초기화 구문
  static{
    cnt = 0;
  }

  public Count(){
    //cnt = 0; static 변수는 생성자에서 초기화 하지 않는다.
    //아무리 공용변수라도 0으로 계속 초기화됨.

    System.out.println("생성자 실행~");
    cnt++;
    System.out.println("cnt = " + cnt);
  }



}
