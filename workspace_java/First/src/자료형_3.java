public class 자료형_3 {
  public static void main(String[] args) {
// 형(자료형 date type) 변환
// 정수를 실수로, 실수를 정수로

    int num1 = 5;
    double num2 = num1;
//  정수가 실수안에 포함되기 때문에 자료형이 달리도 허용한다
//  대신 num2는 '실수 타입'이라 '실수'로 자료형이 변환됨.

    System.out.println("num2 = " + num2 );
//  자동형변환(promotion)
//  double num3 = 5.5;
//  int num4 = num3;
//  반대는 안되용.  정수 범위가 실수보다 좁다. 그래서 자동 형 변환이 안됨



//  강제 형 변환(casting)
    double num3 = 5.5;
    int num4 = (int)num3;
    System.out.println("num4 = " + num4);
  }
}


