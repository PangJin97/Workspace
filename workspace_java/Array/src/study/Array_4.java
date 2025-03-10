package study;

//배열이 자료형이라는 의미
//자료형이 다르면 값 저장 못 함\
//반드시 인지

public class Array_4 {
  public static void main(String[] args) {
    int[]arr1={1,2,3};
    int a = 5;

    //a = arr1 자료형 불일치
    a = arr1[1];

    String[]arr2={"java","house"};
    int[]arr3={1,5};
    //arr3 = arr2; 안됨
    //String abc = arr2; 안됨

    int[] arr4 = {5, 10};
    //arr4 = arr3; 같은 정수형 배열
    //arr4가 arr3와 같은 값을 가짐
    //arr4 = {1,5};
    //arr3 = {1, 5, 7}이면 arr4 = { 1, 5, 7};

    //arr4 = sc.nextInt(); => 불가능
    //arr4[2] = sc.nextInt(); => 가능
  }
}
