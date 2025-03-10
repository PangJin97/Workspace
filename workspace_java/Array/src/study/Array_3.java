package study;

//배열의 값 저장 및 읽기
public class Array_3 {
  public static void main(String[] args) {
    //정수를 3개 저장할 수 있는 배열 arr1을 셍성
    int[]arr1 = new int[3]; // 0 0 0

    //배열 출력은 (참조)변수명으로 할 수 없음!!!
    System.out.println(arr1);

    //arr1의 0번째 요소를 출력
    System.out.println(arr1[0]);
    //System.out.println(arr1[3]); 주의! 오류난다. 0번째부터 순서니까 3번째는 없다.

    //배열에 각 요소에 값 저장
    //arr1의 0번째가 아닌 첫번째 요소에 3을 저장
    arr1[1] = 3;
    System.out.println(arr1[1]);

    //배열의 모든 요소의 값을 출력
    for(int i = 0; i < 3; i++){
      System.out.println(arr1[i]);
    }

    /// ///////////////////////////////////////////////////////

    System.out.println();

    //배열의 모든 요소를 출력할 때 사용할 수 있는  좋은 명령어
    int[]arr2 = new int[5];

    //arr2의 모든 요소를 출력
    for(int i = 0; i < 5; i++){
      System.out.println(arr2[i]);
    }
  //배열의 길이(크기, 요소의 개수)를 알 수 있는 명령어
    System.out.println("arr2 배열의 크기 : " + arr2.length);
    // 반복문을 쓸 때 사용하는데

//    for(int i = 0; arr2.length; i++){
//      System.out.println(arr2[i]);
//    }

    //i < 5를 arr2.length로 바꾸기만 하면됨

  }
}
