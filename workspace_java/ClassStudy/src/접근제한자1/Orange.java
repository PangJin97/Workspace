package 접근제한자1;

/*
* 접근 제한자
*  - 멤버변수, 메서드, 클래스의 사용 범위를 지정.
*  - 지역변수는 접근제한자 못함
*  - 종류: public > default > protected > private
*
* public 선언된 변수와 메서드는 : 같은 프로젝트라면 접근이 가능
*
* default 선언된 변수와 메서드 : 같은 패키지 내에서 접근 가능
* -(아무것도 안적으면 default)
* -(default)int a; 변수 사용할때 default 사용한것
* -메서드도 동일하게
*
* private 선언된 변수와 메서드 : 변수, 메서드를 선언한 클래스 안에서만
* 접근 가능
*
*
* => 우린 코드치기 바쁘다.... 연습할때는
* -멤버변수는 무조건 private
* -메서드는 무조건 public.
*
* ->클래스는 default 랑 public 만 올 수 있다.
*
* */
public class Orange {
  private int a;
  int b; //디폴트 접근자
  public int c;

  private int price;
  public void setPrice(int price){
    if(price < 0){
      price = 0;
    }
    else {
      this.price = price;
    }
  }
  //변수에 직접적으로 입력하는 거에 대한 실수 방어.



  private void aaa(){}
  void bbb(){}
  public void ccc(){}

}
