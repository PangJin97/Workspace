package com.green.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {
  private Phone phone;
  private BoardService boardService;
  //멤버변수 선언한거와 비슷

  //내부적으로 객체는 생성했으나 가져다 쓰려면??

  //일반적으로 클래스에 있는 변수와 메서드를 쓰려면
  //객체 생생하고 호출하며 써야하는데

  //어노테이션 component 를 통해
  //내부적으로 객체는 생성했으니 선언만 하는 것

  //궁극적으로 객체 쓰려고 하는거임 

  @Autowired
  public PhoneController(Phone phone, BoardService boardService){
    this.phone = phone;
    this.boardService = boardService;
  }

  //DI : 의존성 주입
  //생성자 주입

  //일반적인 매개변수가 있는 생성자랑 비슷하다
  //매개변수로 자료형 멤버변수 넣었잖아

  //똑같이 클래스 자료형 + 객채명 넣은 거임
  //그리고 this.멤버변수 = 매개변수


  public void aaa(){
    System.out.println(phone.getModelName());
    boardService.bbb();
  }
}
