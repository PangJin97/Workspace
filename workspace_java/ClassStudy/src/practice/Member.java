package practice;

public class Member {
  String name;
  String id;
  String pw;
  int age;


  public void setAllInfo(String name, String id, String pw, int age){
    //이 클래스에서 정의된 name
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }
  //this 가 지칭하는 것 클래스를 의미한다.
  //매개변수 이름을 잘 설정해주면 코딩이 편한데 클래스의 변수명과 차별하기 위해
  //this를 여기서 쓴다
  //여기서는 this는 꼭 붙여줘야한다.

  public void printAll(){
    System.out.println("이름 = " + name);
    //this.name 에서 this 가 생략되있는 거임.
    System.out.println("ID = " + id);
    System.out.println("PW = " + pw);
    System.out.println("나이 = " + age);
  }


}
