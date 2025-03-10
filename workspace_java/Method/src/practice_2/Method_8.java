package practice_2;

public class Method_8 {
  public static void main(String[] args) {
    test8(30,50,90);

  }
  public static double test8(int num1 ,int num2 ,int num3){
     return (num1 + num2 + num3)/3.0;
     //매개변수가 정수라도 실수가 더 커서 자동 형변환
    //실수값을 리턴으로 받아야하니 그냥 3이 아니라 3.0
  }
}
