package practice;

public class 문제10번_For_each {
  public static void main(String[] args) {
  int[]arr = {1, 2, 3,4, 5, 6, 7, 8};
  int evenCnt = 0;

  for( int e : arr){
    if(e%2==0){
      evenCnt++;
      }
    }
    System.out.println(evenCnt);
  }
}
