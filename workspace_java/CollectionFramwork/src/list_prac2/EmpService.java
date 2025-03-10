package list_prac2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  Scanner sc = new Scanner(System.in);

  List<Emp> empList = new ArrayList<>();

  public EmpService(){
    Emp emp1 = new Emp(1001,"홍길동","개발부","1111-1234",1000);
    Emp emp2 = new Emp(1002,"김길동","개발부","1111-3333",2000);
    Emp emp3 = new Emp(1003,"최길동","개발부","1111-4444",3000);
    Emp emp4 = new Emp(1004,"이길동","운영팀","1111-4444",5000);
    Emp emp5 = new Emp(1005,"조길동","기획실","1111-4444",7000);

    empList.add(emp1);
    empList.add(emp2);
    empList.add(emp3);
    empList.add(emp4);
    empList.add(emp5);

  }

  public void logIn(){
    boolean stop = true;

    while (stop){
      System.out.print("사번: ");
      int empNum = sc.nextInt();
      System.out.print("비밀번호(연락처의 마지막 4자리): ");
      String tel = sc.next();

      boolean isFound = false;

      for(int i = 0; i < empList.size(); i ++){
        if(empList.get(i).getTel().substring(5).equals(tel) && empList.get(i).getEmpNum() == empNum){
          System.out.println("로그인 하였습니다.");
          System.out.println(empList.get(i).getName()+"님 반갑습니다.");
          stop = false;
          isFound = true;
          break;
        }
      }
      if(!isFound) {
        System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
      }
    }
  }


  public void payment() {
    System.out.print("부서명: ");
    String dept = sc.next();
    System.out.println("==" + dept + " 월급 현황==");
    int sum = 0;
    double avg;
    for (int i = 0; i < empList.size(); i++) {
      if (empList.get(i).getDept().equals(dept)) {
        System.out.println("이름: " + empList.get(i).getName() + ", " + "월급: " + empList.get(i).getMoney());
        sum = sum + empList.get(i).getMoney();
      }
    }
    avg = (double)sum / empList.size();
    System.out.println("개발부서의 월급 총액은 " + sum + " 원이며, 평균 급여는 " + avg + "원입니다.");
  }
}


