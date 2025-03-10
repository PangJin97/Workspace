public class IF_ELSEIF_ELSE_1 {
  public static void main(String[] args) {
  //조건이 3개 이상일때 사용

  //정수가 짝수면 1출력, 홀수면 2출력, 0이면 3 출력
    int num = 5;

    //만약에 ~ 라면
    if(num % 2 == 0){
      System.out.println(1);
    }
    //그렇지 않고, 만약에 ~~라면
    //else if 구문은 필요시 여러개 사용가능
    else if(num % 2 != 0){
      System.out.println(2);
    }
    //else if( num == 0) 이렇게 넣을 수 도 있는데 홀수 짝수 빼면 0밖에 없잖아.
    // 그러니까 그냥 else쓴다.
    else{
      System.out.println(3);
    }




  }
}
