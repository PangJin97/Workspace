package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.dto.TestDTO;
import com.green.board.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("replies")
public class ReplyController {

  private ReplyService replyService;

  @Autowired
  public ReplyController(ReplyService replyService){
      this.replyService = replyService;
  }

  @PostMapping("")
  public void replyInsert(@RequestBody ReplyDTO replyDTO){
    replyService.replyInsert(replyDTO);
  }

  @GetMapping("/{boardNum}")
  public List<ReplyDTO> getReply(@PathVariable("boardNum") int boardNum){
    return replyService.getReply(boardNum);
  }

  @DeleteMapping("/{replyNum}")
  public void delete(@PathVariable("replyNum") int replyNum){
    replyService.deleteReply(replyNum);
  }

  //쿼리스트링 연습
//  @GetMapping("/test")
//  public void test(@RequestParam("age") int age, @RequestParam("name") String name){
//    System.out.println("age = " + age);
//    System.out.println("name = " + name);
//  }

  @GetMapping("/test")
  public void test(TestDTO testDTO){
    System.out.println(testDTO);
  }
}
//쿼리 스트링에서 데이터를 많이 받을 때 DTO 로 받을 수 있다
//어노테이션 필요없음.

//REACT pdf 참조
