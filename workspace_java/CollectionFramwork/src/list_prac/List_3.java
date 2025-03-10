package list_prac;

import java.util.ArrayList;
import java.util.List;

public class List_3 {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("홍길동");
    list.add("김자바");
    list.add("이자바");
    list.add("삼자바");

    for(int i = 0; i < list.size(); i++){
      if(list.get(i).equals("홍길동")){
        System.out.println("해당 이름이 존재합니다.");
      }
    }
  }
}
