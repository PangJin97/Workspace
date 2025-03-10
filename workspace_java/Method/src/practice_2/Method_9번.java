package practice_2;

public class Method_9번 {
  public static void main(String[] args) {
    test9(30);

    int a = test9(30);
    System.out.println(a);
  }
  public static int test9(int num){

    int sum=0;
    for(int i =1; i < num+1; i++){
      if(i%2 == 1){
        sum = sum + i;
      }
    }
    return sum;
  }
}
