package study;

//직장동료
public class CompFriend extends Friend {
//private String name;
//private String tel;
  private String dept;

  public CompFriend(String name, String tel, String dept) {
    super(name,tel);
    this.dept = dept;
  }

  public void showInfo(){
  //System.out.println("이름: " + name);
  //System.out.println("연락처: " + tel);
    super.showInfo();
    System.out.println("부서명: " + dept);

  }
}
