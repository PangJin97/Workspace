public class IF_ELSEIF_ELSE_2 {
  public static void main(String[] args) {
    int num = 5;

    if(num >= 5){
      System.out.println(1);
    }
    else if(num == 5){
      System.out.println(2);
    }
    else{
      System.out.println(3);
    }

    //if, else if, else는 한쌍이다, 그래서 하나만 출력됨
    //코드는 위에서 부터 아래로, 셋중에 하나만 나올 수 있기 때문에 if가 충족되서 뒤에건 해석 안함.


    //if가 두개이면 서로 다른 조건문으로 별도로 해석한다,

  }
}
