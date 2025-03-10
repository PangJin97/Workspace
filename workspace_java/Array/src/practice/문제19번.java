package practice;

import java.util.Arrays;

public class 문제19번 {
  public static void main(String[] args) {

    int[]arr = new int[10];

    //배열의 각 요소에 데이터를 저장.
    for(int i = 0; i < arr.length; i++){
      arr[i] = (int)((Math.random()*100)+1);
    }
    //배열 데이터 확인을 위한 출력
    System.out.println( Arrays.toString(arr));


    int max = arr[0]; // 0번째 요소를 가장 큰 값으로 가정.
    int min = arr[0]; // 0번째 요소를 가장 작은 값으로 가정.

    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
       max = arr[i];
       //배열 요소의 값이 max보다 크면 max에 arr[i]요소의 값을 넣는다.
      }
      if(min > arr[i]){
        //배열 요소이 값이 min보다 작으면 min에 arr[i]요소의 값을 넣는다.
        min = arr[i];
      }
    }
    System.out.println("최대값 : " + max);
    System.out.println("최솟값 : " + min);
  }
}
