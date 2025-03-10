package com.green.Second;

import org.springframework.stereotype.Component;

// BoardService service = new BoardService();
// 내부적으로 만들어짐
@Component("service")
public class BoardService {
  public void bbb(){
    System.out.println("bbb 메서드 실행");
  }
}
