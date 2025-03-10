package practice;

public class 문제10번 {
  public static void main(String[] args) {

    int[]arr1=new int[8];
    int ist=0;
    for(int i =0; i < arr1.length; i++){
      arr1[i]=i+1;
      System.out.print(arr1[i] + " ");
      if(i%2==0){
        ist=ist+1;
      }
    }
    System.out.print(ist + " ");
  }
}
