package practice;

public class 문제14번 {
  public static void main(String[] args) {
    int[]arr={5, 4, 3, 2, 1};

    int[]newArr = new int[arr.length];
    //위에 있는 길이가 바뀌어도 수정안해도 되게
    //상수로 두지말고 변수로 두는게 낫다.

//    newArr[0] = arr[0];
//    newArr[1] = arr[1];
//    newArr[2] = arr[2];
//    ....
//    newArr[4] = arr[4];

    for(int i = 0; i < arr.length; i++){
      newArr[i] = arr[i];
    }
    for(int i = 0; i < newArr.length; i++){
      System.out.println(newArr[i]+"");
    }

  }

}
