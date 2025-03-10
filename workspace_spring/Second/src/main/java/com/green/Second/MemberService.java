package com.green.Second;

import org.springframework.stereotype.Component;

//MemberService memberService = new MemberService();
//이름을 지정해주지 않으면
// 클래스명에서 앞글자에서 소문자로 바꿔서 명명한다.
@Component
public class MemberService {

  public void aaa(){
    System.out.println("aaa 메서드 실행~");
  }
}
