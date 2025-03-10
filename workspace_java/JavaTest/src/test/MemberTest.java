package test;

import java.sql.SQLOutput;

public class MemberTest {
  public static void main(String[] args) {

    Member m = new Member();

    m.setInfo("java", "1234", "kim", 20);

    m.showInfo();

    boolean login = m.isLogin("java","1234");

    if(login){
      System.out.println("로그인가능");
    }else{
      System.out.println("로그인 불가능");
    }

  }
}
