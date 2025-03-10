package practice;

public class 문제17번 {
  public static void main(String[] args) {
    int[]arr=new int[6];

    for(int e : arr){
      int r = (int)(Math.random()*46);
      e=r;
      System.out.println(e);
    }
  }
}
