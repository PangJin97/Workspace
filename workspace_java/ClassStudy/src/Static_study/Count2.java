package Static_study;

public class Count2 {
  static int cnt;
  int number;

  public void aaa(){
    System.out.println(cnt);
    bbb();

  }

  public  static void bbb(){
    //System.out.println(number);
    //static 부분들이 이 제일 먼저 해석됨.
    //그래서 number 가 뭔데? aaa()가 뭔데? 해석을 못함.
    //순서에 유의하기.

  }

  public static void main(String[] args) {
   // aaa();
  }
}
