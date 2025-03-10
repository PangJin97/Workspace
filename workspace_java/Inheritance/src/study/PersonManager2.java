package study;

public class PersonManager2 {
  public static void main(String[] args) {

    //다향성
    //친구(Friend)객체가 10개 저장할 수 있는 배열 생성

    Friend[] fs = new Friend[10];
    int cnt = 0;

    fs[cnt++] = new UnivFriend("김자바", "010-1111", "생물학과");
    fs[cnt++] = new CompFriend("이자바" ,"010-2222", "회계부");
    //클래스(자료형)이 같기 때문에 반복문 사용가능하다

    for(int i = 0; i < cnt; i++){
      fs[i].showInfo();
      //다형성으로 만든 객체는
      //부모 클래스에서 선언한 메서드만 사용가능하지만
      //오버라이딩을 통해 자식 클래스의 메서드도 호출된다.
    }
  }
}
//showInfo -> 오버라이팅
