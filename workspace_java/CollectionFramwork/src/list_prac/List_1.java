package list_prac;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("java");
    list.add("python");
    list.add("c++");

    for(int i =0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
