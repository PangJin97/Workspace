package practice_diff;

public class method_5 {
  public static void main(String[] args) {
    int[] a = {5,1,7,10};
    //배열을 호출할때 지금은, 문법을 모르기 때문에
    //임의의 배열을 만들어야한다.
    test5(a);
  }
  public static void test5(int[] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
