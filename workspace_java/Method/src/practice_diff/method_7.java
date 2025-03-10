package practice_diff;

public class method_7 {
  public static void main(String[] args) {

    String[] str1 = {"홈", "스윗", "홈"};

    String t = test7(str1);
    System.out.println(t);
  }

  public static String test7(String[] arr){
    String result = "";
    //문자열 더하면 문자열 나열 - > 문자열의 총합
    for(int i =0; i < arr.length; i++){
      result = result + arr[i];
    }
    return result;
    //test7() = (문자열) x
  }
}
