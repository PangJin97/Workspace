package practice_2;

public class Method_10 {
  public static void main(String[] args) {
    test10("GOODBYE");

    Boolean z = test10("GOODBYE");
    System.out.println(z);

  }
  public static boolean test10(String A){
      // return = A.length%2 == 0 ? true : false
      //삼항연산자

      //return = A.length%2 == 0;
      //비교연산결과가 참이라서 그냥 적어도 됨

    if(A.length()%2==0){
      return true;
    }
    else{
      return false;
    }
  }
}
