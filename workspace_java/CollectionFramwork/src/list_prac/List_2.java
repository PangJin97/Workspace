package list_prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    for(int i =0; i< 5; i ++ ){
      list.add(sc.nextInt());
    }

    int sum = 0;
    for(int i = 0; i < list.size(); i ++){
      sum = sum + list.get(i);
    }
    System.out.println(sum);
  }

}
