package practice_diff;

public class method_1 {
  public static void main(String[] args) {

    diff1(7);
    //출력문이 함수 내에 있으니까
    //그냥 함수만 입력해도 출력됨

  }
  public static void diff1(int num){
    int nine=0;

    for(int i = 1; i < 10; i++){
      nine=num*i;
      System.out.println(num + " * " + i +" = " + nine);
    }
  }
}

