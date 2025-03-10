package Diff;

public class Method_9 {
  public static void main(String[] args) {

    int[] arr1={2,5,7,20,10,3};

    int[] arr2 = printArr(arr1);
    for(int i =0; i < arr2.length; i++){
      System.out.println(arr2[i]);
    }

  }
  public static int[] printArr(int[] arr){

    int even = 0;
    for(int i =0; i<arr.length; i++){
      if(arr[i]%2==0){
        even = even + 1;
      }
    }
    int[] newArr = new int[even];

    int index=0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i]%2==0){
        newArr[index]=arr[i];
        index++;
      }
    }
    return newArr;
  }
}
