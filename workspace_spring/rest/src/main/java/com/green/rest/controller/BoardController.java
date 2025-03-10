package com.green.rest.controller;

import com.green.rest.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

// 연습!!

@RestController
@Slf4j
//출력문 대신 씀
@RequestMapping("/boards")
public class BoardController {

  // 1. 모든 게시글을 조회하는 기능을 제공하는
  //REST_API

  //(GET) localhost:8080/boards
  @GetMapping("") //  /boards
  public void getBoardList(){
    log.info("게시글 목록 조회");
    //Slf4j - 이력이 남는 출력문(실무에서 많이쓴다)
  }


  // 2. 하나의 게시글의 정보를 조회하는 기능을 제공하는 REST_API
  //(GET) localhost:8080/boards/1
  // 쿼리의 프라이머리 키를 가진 컬럼 BOARD_NUM = 1
  //그럼 BOARD_NUM 이 1인 데이터만 받아올 수 있다.
  @GetMapping("/{boardNum}")
  public void getBoardNum(@PathVariable("boardNum") int boardNum){
    log.info("게시글 상세정보 조회");
    log.info("boardNum: " + boardNum);
  }



  // 3. 하나의 게시글을 등록하는 기능을 제공하는 REST_API
  //(POST) localhost:8080/boards
  @PostMapping("")
  public void insertBoard(@RequestBody BoardDTO boardDTO){
    log.info("게시글 등록");
    log.info(boardDTO.toString());
  }
}
