package test;

public class Member {

  private String id;
  private String pw;
  private String name;
  private int age;


  public void setInfo(String id, String pw, String name, int age){
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  public void showInfo(){
    System.out.println("아이디: " + this.id);
    System.out.println("비밀번호: " + this.pw);
    System.out.println("이름: " + this.name);
    System.out.println("나이: " + this.age);
  }


  public boolean isLogin(String id, String pw){

    if(id.equals("java")&&pw.equals("1234")){
      return true;
    }
    else {
      return false;
    }
  }
}
