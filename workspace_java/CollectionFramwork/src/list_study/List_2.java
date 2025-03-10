package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
  public static void main(String[] args) {

    //정수를 다수 저장할 수 있는 list1 객체 생성
    //배열과 다르게 저장할 데이터의 갯수 제한이 없음.
    List<Integer> list1 = new ArrayList<>();

    //list1에 데이터 추가 (하는 메서드)
    list1.add(5); //0번째 //넣는 순서대로 0부터 index 가 설정된다.
    list1.add(2); //1번째
    list1.add(10); //2번째
    list1.add(6); //3번째
    list1.add(5); //4번째 //데이터 중복 가능

    //list1에 저장된 데이터 읽기 (하는 메서드).
    //get() 메서드의 안에서 index 가 들어감
    System.out.println(list1.get(1));
    //첫번째 있는 데이터 빼주세요

    //list1에 저장된 삭제
    //이녀석도 index 로 접근
    list1.remove(1);
    //첫 번째에 있는 데이터 삭제되고 뒤에 있는 데이터가 땡겨옴

    //데이터 변경
    //0번째 데이터를 8로 바꿉니다.
    list1.set(0, 8);

    //삭제 변경은 거의 안씀....


    //list1에 저장된 데이터의 갯수
    System.out.println(list1.size());
    //5개에서 4개로 줄어듬

    //list1에 모든 데이터 출력
    for(int i = 0; i < list1.size(); i++){
      System.out.println(list1.get(i));
    }



  }
}
