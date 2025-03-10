package list_prac;

import java.util.ArrayList;
import java.util.List;

public class List_4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList();


    for(int i = 0; i < 10; i++){
     list.add((int)(Math.random()*100+1));
    }

    int isEven = 0;
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
      if (list.get(i)%2==0){
        isEven = isEven + 1;
      }
    }
    System.out.println("짝수의 개수: " + isEven);
  }
}
