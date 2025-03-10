package com.green.rest.controller;

import com.green.rest.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

//객체 생성 + 관제탑 역할 부여
//이 클래스는 모든 요청(url)을 받는 클래스
@RestController
@RequestMapping("/members")
@Slf4j
public class MemberController {

  @GetMapping("")
  //url : localhost:8080/members 요청이 들어오면
  //메서드 실행시켜줌
  //제어할 자원을 명사로(복수형)
  //소문자
  //복합어는 하이폰(-)
  //마지막에 / 는 포함하지 않는다
  //url 에 제어의 상태를 포함하지 않음
  public void getMemberList(){
    System.out.println("getMemberList() 메서드 실행");
  }


  //회원 한명을 조회 하는 기능
  //rest -> localhost:8080/members/aaa
  //{}는  url 에서 넘어오는 데이터를 받을 때 사용하는 문법 => 쿼리의 primary 키 값을 받는다
  //memId = aaa
  //{}변수
  @GetMapping("/{memId}")
  public void getMember(@PathVariable("memId") String id){
    System.out.println("getMember() 메서드 실행");
    System.out.println("id = " + id);
  }

  // rest -> localhost:8080/members/java/20
  @GetMapping("/{memId}/{memAge}")
  public void getMember2(@PathVariable("memId")String memId, @PathVariable("memAge")int memAge){
    System.out.println("memId = " + memId);
    System.out.println("memAge = " + memAge);
  }

  // 회원 등록 -> localhost:8080/members
  @PostMapping("")
  public void insertMember(@RequestBody MemberDTO boardDTO){
    System.out.println("insertMember() 메서드 실행");
    System.out.println(boardDTO.toString());
  }



  //회원 한명을 삭제하는 기능을 제공하는 REST API
  //(DELETE) localhost:8080/members/aaa
  @DeleteMapping("/{manId}")
  public void deleteMember(@PathVariable("manId") String manId){
    log.info("회원 한명 삭제");
    log.info("manId: " + manId);
  }


  //회원 한 명의 이름과 나이를 변경하는 기능을 제공하는 REST API
  //(PUT) localhost8080/members/aaa  => 여기도 마찬가지로 url 에 pk 값 넣기(manId)
  @PutMapping("/{manId}")
  public void putMember(@PathVariable("manId") String manId, @RequestBody MemberDTO memberDTO){
    log.info("회원 한 명의 정보변경");
    log.info("manId: " + manId);
    log.info("memberDto = " + memberDTO);
  }

}

//url 작성 규칙 문법 = rest -> 이 규칙은 상태를 표현하는 특징을 지님

//쿼리문이 근간이다
//url {}변수는 primary key 로
//{}변수를 requestbody나 pathvariable 로 받는다

//삽입(insert) - POST(등록)
//조회(SELECT) - GET(조회)
//수정(UPDATE) - PUT
//삭제(DELETE) - DELETE

//PUT은 requestbody, pathvariable 둘 다 가능
//get과 delete는 pathvariable만 가능하고 requsetbody는 불가능하다
//post는 requsetbody
