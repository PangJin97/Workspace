public class while_7번 {
  public static void main(String[] args) {

    int i = 1;
    int ist = 0;//5의 배수의 갯수를 저장할 변수


    while (i < 101){
      if(i % 5 == 0){
        ist++;
        System.out.print(i + " ");
      }
      i++;
    }
    System.out.println();
    System.out.println("5의 배수의 개수 : " + ist);

  }
}
