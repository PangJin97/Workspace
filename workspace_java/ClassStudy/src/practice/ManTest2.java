package practice;

public class ManTest2 {
  public static void main(String[] args) {
    Man1 m1 = new Man1();
    m1.initMan1("홍길동",30,"울산시");

    Man1 m2 = new Man1();
    m2.initMan1("유관순",20,"서울시");

    //getter setter 가 왜 쓰는가?
    //m1과 m2 중 나이가 많은 사람의 이름을 출력

    if(m1.getAge() > m2.getAge()){
      System.out.println(m1.getName());
    }
    else if(m2.getAge() > m1.getAge()){
      System.out.println(m2.getName());
    }
    //해석하는게 중요하다.
    //조건에서 메서드를 활용할 수 있다.
    //데이터를 받아왔기 때문에 사용가능
    //getter 사용 예시;

    //setter 는 데이터 변경할때
    //getter 는 데이터를 읽어(가져)올때.

    //-----------------------------------------------------------------//

    //m1 객체의 나이가 30이면 -> 30이라는 나이값 데이터를 가져(읽을때)와야함 getter
    //m1 객체의 이름을 "이순신"으로 변경하세요 -> 값을 변경할때 setter

    if(m1.getAge() == 30){
      m1.setName("이순신");
    }
  }
}
//리턴 = 결과 데이터를 컴퓨터가 나한테 돌려준다.
//나의 입장 : 컴퓨터한테서 데이터를 받는다.
