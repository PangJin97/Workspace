public class Break_Continue {
  public static void main(String[] args) {
//반복문에 break, continue라는 명령어를 사용할 수 있다.

   //break
  //가장 가까운 반복문을 종료(벗어남)
   int i = 1;
   while(i < 6){
     if(i==3){
       break;
     }
     System.out.println(i);
     i++;
   }


    System.out.println();

    /// ////////////////////////////////////////////////

    //continue
    //가장 가까운 반복문의 마지막으로 이동한다.

    int a =1;
    while(a < 6){
      a++;

      if(a == 3 ){
        continue;
      }
      System.out.println(a);
      //마지막 명령어 뒤로 온다는 뜻, 여기서 다시 시작
      //반복하다 a==3가 되는 순간 출력하지 않고 다음 라인으로

    }
  }
}
