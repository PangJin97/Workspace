package list_prac;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {
    Member m1 = new Member("Saria", "1111", "tenka", 23);
    Member m2 = new Member("tenka", "2222", "saria", 24);
    Member m3 = new Member("java","3333", "java",25);

    List<Member> memberList = new ArrayList<>();

    memberList.add(m1);
    memberList.add(m2);
    memberList.add(m3);


    for(int i = 0; i < memberList.size(); i ++){
      System.out.println(memberList.get(i));
    }

    int sum = 0;
    for(Member member : memberList){
      sum = sum + member.getAge();
    }
    System.out.println(sum);

    for(int i = 0; i < memberList.size(); i++){
      if(memberList.get(i).getId().equals("java")){
        memberList.remove(i);
        break;
        //찾고 지웠으면 그만두자.
      }
    }

    for(int i = 0; i < memberList.size(); i ++ ){
      System.out.println(memberList.get(i));
    }
  }
}
