package ObjectClass;

public class Student {
  int stuNum; //학번
  String name;

  @Override
  //매개변수로 자료형 상관없이 아무거나 주세요
  //=> 모든 데이터를 비교하기 위해
  //Object obj
  public boolean equals(Object obj) {
   Student student = (Student)obj;
    if(stuNum == student.stuNum){
      return true;
    }
    else{
      return false;
    }
  }

  public Student(int stuNum, String name) {
    this.stuNum = stuNum;
    this.name = name;
  }
}
