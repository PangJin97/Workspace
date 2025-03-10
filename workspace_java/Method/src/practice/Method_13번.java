package practice;

public class Method_13번 {
  public static void main(String[] args) {
    int a = 5;
    int b = 15;
    printNum(a ,b);
    //인자값을 상수보다 변수로 많이써라
    //이름에 연연하지 말고 자료형에 신경써라
    //인자변수a, b 자료형도 int , 매개변수 num1 과 num2의 자료형도 int

    //int num1 = a가 들어온다고 해석하면된다.
  }
  public static void printNum(int num1, int num2){
    int max = num1 > num2 ? num1 : num2;
    int min = num1 > num2 ? num2 : num1;

    for(int i=min+1; i < max; i++){
      System.out.println(i);
    }

  }
}
