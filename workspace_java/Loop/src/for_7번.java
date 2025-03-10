public class for_7번 {
  public static void main(String[] args) {

    int num=0;

    for (int i=1; i < 101; i++){
      if(i % 5 == 0){
        num++;
        System.out.print(i + " ");
        //해당하는 숫자도 출력하자
      }
    }
    System.out.println();
    System.out.println(num);
  }
}
