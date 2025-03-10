package list_prac;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {

    Student stu1= new Student("박자바",100,100);
    Student stu2= new Student("김자바",90,50);
    Student stu3 = new Student("이자바",50,50);

    List<Student> students = new ArrayList<>();
    //List<Student> 전체가 자료형.
    //자료형 변수명;

    students.add(stu1);
    students.add(stu2);
    students.add(stu3);
    //students.add(new Student("최자바",90,80));

    for(int i = 0; i < students.size(); i ++){
      System.out.println(students.get(i));
    }

    System.out.println();

    for(int i = 0; i < students.size(); i++){
      if(students.get(i).getSum() > 150){
        System.out.println(students.get(i));
      }
    }

    System.out.println();
  /*
   for(Student student : students){
      if(student.getSum() >= 150){
        System.out.println(students);
      }
    }
    */
    int sum = 0;
    for(int i =0; i < students.size(); i ++){
      sum += sum +  students.get(i).getSum();
      //sum += 10; sum = sum + 10;
    }
    double avg = (double) sum / students.size();
    System.out.println(avg);

    System.out.println();


    // 총점이 1등인 '학생'의 모든 정보 니까 '인덱스'로 접근해야한다.
    int maxIndex = 0;//최고점수가 있는 index
    for(int i = 0; i < students.size(); i++){
      if(students.get(i).getSum() > students.get(maxIndex).getSum()){
        maxIndex = i;
      }
    }
    System.out.println(students.get(maxIndex));
  }
}
