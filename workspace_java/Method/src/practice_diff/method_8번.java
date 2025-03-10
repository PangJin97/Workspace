package practice_diff;

public class method_8번 {
  public static void main(String[] args) {
    int[] a = {1,2,3};
    int[] b = {4,5,6};

    int[] result = zero(a,b);
    //새로운 배열을 만들었잖아
    //리턴을 받았고 그 값을 쓰려면
    //새로운 정수형 배열에 담아서
    //모든 요소 출력
    for(int i = 0; i < result.length; i++ ){
      System.out.println(result[i]);
    }


  }
  public static int[] zero(int[] arr1, int[] arr2){

    int[] newArr = new int[arr1.length + arr2.length];

    for(int i = 0; i < arr1.length; i++){
      newArr[i]=arr1[i];
    }
    for(int i = 0; i < arr2.length; i++){
      newArr[arr1.length+i]=arr2[i];
    }

    return newArr;
  }
}
