public class while_6번 {
  public static void main(String[] args) {
    //1~100의 수 중 3의 배수의 갯수

    int i = 1;
    int ist = 0; // 결과를 저장할 변수


    while(i < 101){
      if(i % 3 == 0){
        ist++;
      }
      i++;
    }
    System.out.println(ist);
  }
}
