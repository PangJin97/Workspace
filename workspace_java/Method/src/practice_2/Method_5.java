package practice_2;

public class Method_5 {
  public static void main(String[] args) {
    youmi(75);

    String str = youmi(75);
    System.out.println(str);

  }
  public static String youmi(int num1){
    if(num1 >= 90){
      return "A";
    }
    else if (num1 >= 70) {
      return "B";
    }
    else{
      return "C";
    }

  }
}
