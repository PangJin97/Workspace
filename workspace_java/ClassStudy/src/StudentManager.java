import java.util.Scanner;

public class StudentManager {
  //학생 등록 기능
  //학생정보변경(연락처) 기능
  //각각의(한 명의)학생정보출력 기능
  //모든 학생 정보 출력 기능


  private Scanner sc;
  private Student[] students; //학생을 3명 만든게 아니라 공간을 3개 만든것
  //둘다 멤버변수라 private

  // 생성과 함께 초기화 하는건 좋지 않다
  // 생성자에서 초기화 하기
  // 생성자는 객체 만들었을때 자동으로 실행된다.

  private int index; // students 배열의 요소를 지정

  public StudentManager(){
    sc = new Scanner(System.in);
    students = new Student[3];
    index = 0;
  }


  //학생 등록 기능
  public void regStudent(){
    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");

    System.out.print("이름: ");
    String name = sc.next();
    System.out.print("나이: ");
    int age = sc.nextInt();
    System.out.print("연락처:");
    String tel = sc.next();
    System.out.print("학점: ");
    String grade = sc.next();

    //위에서 입력받은 정보로 학생을 생성한다.(키보드로 입력 받은 값을 갇는 학생 생성)
    Student stu = new Student(name, age, grade, tel);

    students[index++] = stu;
    //생성한 학생을 students 배열에 저장.
    //학생을 등록할때 마다 index 1증가.
    
    //stu 각각의 객체를 배열에 넣어서 stu. 이렇게 불러오는건 안되고 students[i]. 으로 불러와야한다.
    // 여기서 키보드로 입력받은 값은 로컬변수지 멤버변수가 아니다!!!
    //멤버변수는 private.
  }

  //학생정보 변경
  public void setTelInfo(){

    System.out.println("학생의 연락처를 변경합니다.");
    System.out.print("변경학생: " );
    String name = sc.next();
    System.out.print("연락처: ");
    String newTel = sc.next();
    for(int i = 0; i < index; i++){
      if(students[i].getName().equals(name)){
        students[i].setTel(newTel);
        System.out.println("변경이 완료되었습니다.");
        return;
      }
    }
    System.out.println("이름을 다시 입력하세요");
  }

  //학생 정보 출력(한명)
  public void printStuInfo(){
    System.out.print("정보를 열람할 학생: ");
    String name = sc.next();
    for(int i  = 0; i < index; i ++){
      if(students[i].getName().equals(name)){
        System.out.println("요청하신 학생의 정보입니다");
        students[i].printStudent();
        return;
      }
    }
    System.out.println("이름을 다시 입력하세요");
  }

  //모든 학생 정보 출력
  public void printStuInfoAll(){
    System.out.println("모든 학생의 정보입니다. 현재 학생 수는 "+ index +"명입니다.");
    //학생이 저장 될때마다 인덱스가 1씩 증가하니까 인덱스는 학생 수
    for(int i = 0; i < index; i++){
      students[i].printStudent();
      System.out.println();
    }

  }

}


/*
* 
* 멤버 변수와 로컬 변수의 차이
멤버 변수 (Instance Variable):

클래스 내부에 선언되고, 객체가 생성될 때 초기화되는 변수입니다.
클래스의 모든 메서드에서 접근 가능하며, 객체의 상태를 저장합니다.
객체의 수명 동안 유지됩니다.

* 
* 
* 로컬 변수 (Local Variable):

메서드 내부에서 선언되고, 해당 메서드가 실행될 때 생성됩니다.
메서드가 끝나면 소멸되며, 메서드 내부에서만 접근할 수 있습니다.
메서드의 특정 동작을 수행하기 위한 일시적인 데이터를 저장합니다.
코드에서의 상황
작성하신 코드는 다음과 같은 로컬 변수를 선언하고 있습니다:

* 
* 
java

System.out.print("변경할 학생의 이름: ");
String name = sc.next();

* 왜 로컬 변수를 사용하는가?

* 1. name은 입력값 저장을 위한 로컬 변수
sc.next()로 사용자 입력을 받는 데이터는 메서드 내부에서 처리되는 임시 값입니다.
입력값을 저장하기 위해 별도의 로컬 변수 name을 선언한 것입니다.
이 데이터는 메서드의 실행이 끝나면 '더 이상 필요하지 않으므로 멤버 변수로 선언할 필요가 없습니다'.

* 2. 멤버 변수를 사용할 이유가 없음
name은 학생 이름을 찾기 위한 비교 용도로만 사용되므로, 클래스 전체에서 유지될 필요가 없습니다.
멤버 변수로 선언하면 객체의 상태로 유지되며, 다른 메서드에서 이 변수에 의존할 가능성이 생깁니다. 그러나 여기서는 그런 필요가 없기 때문에 로컬 변수가 적절합니다.
3. 코드의 명확성과 안전성
로컬 변수를 사용하면 해당 메서드에서만 사용되고, 다른 메서드나 객체의 상태에 영향을 주지 않습니다.
만약 name을 멤버 변수로 사용한다면, 다른 메서드에서도 동일한 이름의 변수를 사용할 때 혼란이 생길 수 있습니다.

* 
* 
* */