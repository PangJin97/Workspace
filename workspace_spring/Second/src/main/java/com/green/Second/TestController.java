package com.green.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  private MemberService memberService;

  //선언만 했지 객체 생성은 안함
  //생성하는게 의존성 주입

  //객체는 선언은 됬는데
  //생성을 해야한다

  //생성자 주입

  @Autowired
  public TestController(MemberService memberService){
    //매개변수로 자료형 멤버변수 넣은거랑 똑같다.
    this.memberService = memberService;
    //의존성 주입
  }

  @GetMapping("/a")
  public void aaa(){
    System.out.println("aaa메서드 실행");
    memberService.aaa();
  }

}
