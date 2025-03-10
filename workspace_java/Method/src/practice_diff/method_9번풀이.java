package practice_diff;

//배열은 배열 생성시 크기가 정해지면 크기 변경이 불가하다.
//이 개념 때문에 홀수 제거하는게 불가능함.
//그래서 완전히 '새로운 배열'을 만들어 줘야한다. ->접근을 이렇게
//그러니 요소자리도 새로 정해줘야함


import java.util.Arrays;

public class method_9번풀이 {
  public static void main(String[] args) {

    int[] arr1 = {5,7,10,3};

    int[] result = printArr(arr1);

    System.out.println(Arrays.toString(result));

  }
  public static int[] printArr(int[] arr){

    //매개변수로 전달된 배열에서 짝수만 갖는 새로운 배열 생성.

    //0. 생성할 배열의 크기 구함.
    //매개변수로 전달된 배열의 요소에서 짝수의 갯수를 파악

    //1.배열 생성
    //int[] newArr = new int[짝수의 갯수];

    int arrLength = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 == 0){
        arrLength = arrLength + 1;
      }
    }
    int[] newArr = new int[arrLength];

    //2. 매개변수로 전달되 배열의 요소 중 짝수만 newArr 배열에 저장

    int index = 0; // newArr 의 index(순서,목차)를 파악하기 위한 변수
    for(int i = 0; i < arr.length; i++ ){
      if(arr[i] % 2 == 0){
        newArr[index++]=arr[i];
        //후위 연산자 가능.
        //다른 모든 연산이 끝나고 그제서야 1증가.

        /*
        newArr[index]=arr[i];
        index++;

       증감연산자의 연산순서만 알면
       한줄로 줄일 수 있다.

        */
      }
    }
    return newArr;
  }
}
