package Prac;

public class MyStudent implements StudentUtil {


  @Override
  public int getTotalScore(Student stu) {
    return (stu.getKorScore() + stu.getMathScore() + stu.getEngScore());
  }

  @Override
  public Student getHighScoreStudent(Student stu, Student stu1) {
   return getTotalScore(stu) > getTotalScore(stu1) ? stu : stu1;
  }



  @Override
  public String getGradeByStudentName(Student[] students, Student stu) {

    String grade = "학생정보없음";

    for (int i = 0; i < students.length; i++) {
      if (students[i].getName().equals(stu.getName())) {
        double avg = getTotalScore(students[i]) / 3.0;
        grade = getGradeByAvg(avg);
        break;
      }
    }
    return grade;
  }
  //else 넣고 학생정보없음 하면 안됨! 반복문이니까

  //평균 점수로 등급을 문자열로 리턴하는 메서드
  //함수 만들기
  public String getGradeByAvg(double avg){

    String grade = "";
    if(avg >= 90 && avg <= 100){
      grade = "A";
    }else if(avg >= 80){
      grade = "B";
    }else if(avg >= 70){
      grade = "C";
    }else {
      grade = "D";
    }
    return grade;
  }

  @Override
  public int[] getTotalScoresToArray(Student[] students) {
    int[] arr = new int[students.length];
    for (int i = 0; i < students.length; i++){
      arr[i] = getTotalScore(students[i]);
    }
    return arr;
  }
}

//메서드의 활용!
//메서드를 잘 만들면 여러번 활용할 수 있다. 
