package practic2;

public class Member_1 {
  private String name;
  private String id;
  private String pw;

  public Member_1(){
    this.name = "김자바";
    this.id = "naver";
    this.pw = "4444";
  }

  public void setName(String name){
    this.name = name;
  }
  public void setId(String id){
    this.id = id;
  }
  public void setPw(String pw){
    this.pw = pw;
  }

  public String getName(){
    return this.name;
  }
  public String getId(){
    return this.id;
  }
  public String getPw(){
    return this.pw;
  }

  public void displayInfo(){
    System.out.println("이름 " + getName());
    System.out.println("아이디 " + getId());
    System.out.println("이름 " + getPw());
  }


}
