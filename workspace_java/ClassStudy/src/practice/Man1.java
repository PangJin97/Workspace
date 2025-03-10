package practice;

public class Man1 {
  String name;
  int age;
  String address;

  public void initMan1(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }


  public String getName() {
    return name;
    //이 클래스에서 정의한 name값을 리턴하겠다.
  }
  //각 멤버변수의 값을 리턴하는 메소드
  //name을 리턴하는 메서드

  //getter - > 멤버변수 '하나'의 값을 리턴하는 메서드
// 받아오겠다, 얻어오겠다 = get 이라는 키워드
// 메서드의 이름 : get + 변수명;
//get 변수명은 변수명과 일치해야한다.
//getName1 이런식이면 안됨.


  public void setName(String name) {
    this.name = name;
  }

  //멤버변수의 각각의 값을 변경하는 메소드
//setter 만드세요

//setter => 멤버변수 '하나'의 값을 변경시키는 메서드
//initMan 에 초기화된 변수와 다름 세터는 하나의 값만 변경할때.

//       => setter 메서드는 이름이 정해져 있음.(set + 멤버면수명)
//setter는 리턴은 보이드; 값만 정해주지 반환하지 않음

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }



  public void setAddress(String address) {
    this.address = address;
  }
  public void printInfo(){
    System.out.println("이름 : " + getName());
    System.out.println("나이 : " + getAge());
    System.out.println("주소 : " + getAddress());
  }
}
