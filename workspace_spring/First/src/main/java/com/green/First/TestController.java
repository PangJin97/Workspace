package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

//@ : anotation 어노테이션
@RestController
public class TestController {

  @GetMapping("/t1")

  public String test1(){
    return "java";
  }

  // http://localhost:8080/t2
  @GetMapping("/t2")

  public int test2(){
    return 10;
  }

  @GetMapping("/t3")
  public Person test3(){
    Person p = new Person("kim",20,"울산시");
    return p;
  }

  @GetMapping("/t4")
  public List<Person> test4(){
    //person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    List<Person> list = new ArrayList<>();

    Person p1 = new Person("김자바", 20, "서울시");
    Person p2 = new Person("박자바", 29, "부산시");
    Person p3 = new Person("이자바", 15, "울산시");

    list.add(p1);
    list.add(p2);
    list.add(p3);

    return list;
  }

  //axios.get
  @GetMapping("/t5")
  public List<Student> test5(){
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("김자바",80,50,30));
    studentList.add(new Student("박자바",100,20,70));
    studentList.add(new Student("이자바",90,40,90));
    studentList.add(new Student("최자바",20,30,30));
    studentList.add(new Student("유자바",50,50,80));

    return studentList;
  }

  //react 에서 전달하는 데이터를 자바에서 받는 문법은 2가지 존재
  //1. 클래스를 활용하는 방법
  // =>react 에서 전달하는 객체의 키와 key 와
  //'자바에서 데이터를 받기 위해 매개변수에 선언한 클래스의 변수명이'
  //'동일하면 데이터를 자동으로 받아온다.'

  //2. Collection Framework 의 Map 을 활용하는 방법
  //=>이거는 나중에,,,

  //axios.post
  @PostMapping("/t6")
  public void test6(@RequestBody Student student){
    System.out.println(student.toString());
  }

  //DTO : Data Transfer Object
  //=> 데이터를 이동시켜 주는 객체.(변수와 갯터 셋터 밖에 없다)
  @PostMapping("/t7")
  public void test7(@RequestBody PhoneDTO phone){
    System.out.println(phone.toString());
  }

  @PostMapping("/t8")
  public int test8(@RequestBody StudentDTO student){

    int sum = student.getKorScore() + student.getEngScore()+student.getMathScore();
    return sum;
  }
  //PostMapping 은 리턴도 가능하다 즉, 값 보내주기도 가능!

  @PostMapping("/t9")
  public void test10(@RequestBody DataDTO data) {
    System.out.println(data.toString());
    //특정 값을 보내려면 리턴값이 있어야 한다
    //이 문제는 특정값이 아닌 전부 필요한 데이터 리턴 굳이 안넣어도 됨!
  }

  @GetMapping("/getLottoNum")
  public int getLottoNum(){
    return (int)(Math.random()*45+1);
  }


  @GetMapping("/getBoardList")
  public List<Board> sendBoardList() {
    List<Board> boardList = new ArrayList<>();

    boardList.add(new Board(1,"제목1","김자바",5,"제목1 내용입니다"));
    boardList.add(new Board(2,"제목2","김자바",0,"제목2 내용입니다"));
    boardList.add(new Board(3,"제목3","김자바",1,"제목3 내용입니다"));
    boardList.add(new Board(4,"제목4","김자바",3,"제목4 내용입니다"));
    boardList.add(new Board(5,"제목5","김자바",10,"제목5 내용입니다"));

    return boardList;
    }

  @GetMapping("/getOrderList")
  public List<Order> sendOrderList(){
    List<Order> orderList = new ArrayList<>();

    orderList.add(new Order(1,"데님 청바지",15000,2,10));
    orderList.add(new Order(2,"맨투맨 반팔 티셔츠",10000,3,20));
    orderList.add(new Order(3,"오버핏 니트",25000,2,30));
    orderList.add(new Order(4,"롱패딩",55000,1,40));
    orderList.add(new Order(5,"맨투맨 긴팔 티셔츠",12000,3,50));

    return orderList;
  }
}
