package practice;

public class Method_14번 {
  public static void main(String[] args) {
    int a=2;
    int b=17;
    printFive(a,b);
  }

  public static void printFive(int num1, int num2){
    int max = num1 > num2 ? num1 : num2;
    int min = num1 > num2 ? num2 : num1;

    int cnt=0;
    for(int i = min+1; i < max; i++){
      if(i%5==0){
        cnt = cnt+1;
      }
    }
    System.out.println(cnt);
  }
}
