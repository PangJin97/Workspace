package practice_diff;

public class method_3 {
  public static void main(String[] args) {

    int result = test3();
    System.out.println(result);

    System.out.println(test3());
    //test3();의 리턴값이 정수라 그냥 출력문에 넣어도 됨

  }
  public static int test3(){
   return (int)(Math.random()*50+1);
  }
}
