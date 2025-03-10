package practice;

public class 문제18번 {
  public static void main(String[] args) {
    int[]arr={1,5,3,8,2};

    // 1. 0번째 요소를 가장 큰값이라 가정하고 시작
    // 2. max라는 변수를 만들고, 거기에 0번째 요소를 저장.
    // 3. 배열의 크기만큼 반복한다.
    // 4. 반복을 하면 배열 요소의 값과 max변수의 값을 비교
    // 5. 만약 max값보다 배열 요소의 값이 크다면
    //배열 요소의 값을 max변수에 저장한다.

    int max = arr[0];

    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    System.out.println("배열의 가장 큰 수 : " + max);



  }
}
