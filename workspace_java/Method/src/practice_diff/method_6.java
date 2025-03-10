package practice_diff;

public class method_6 {
  public static void main(String[] args) {

    int[] arr1={1,10,9,5,6,7,8};

    int maxDate = test6(arr1);
    System.out.println(maxDate);

  }
  public static int test6(int[] arr){
    //최댓값은 정수니까 리턴타입은 int.

    int max= arr[0];

    for(int i = 0; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }
}
