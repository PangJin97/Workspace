package study;

//대학 동창 정보
public class UnivFriend extends Friend {

  /*
 private String name;
  private String tel;
  */

  private String major;

  public UnivFriend(String name, String tel, String major) {
    super(name, tel);
    this.major = major;
  }

  public void showInfo(){
    //System.out.println("이름: " + name);
    //System.out.println("연락처: " + tel);
    super.showInfo();
    System.out.println("전공: " + major);
  }


}


