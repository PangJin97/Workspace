package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import com.green.basic_board.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {

  private BoardService boardService;
  //자료형을 인터페이스로 객체 생성 -> 클래스 자료형을 BoardServiceImpl로 줘도 되지만 실무에선 '인터페이스 자료형'으로 준다

  //만약, 클래스안에 셍성자가 1개만 있으면
  //자동으로 @Autowired를 붙여줌
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 목록 조회 기능을 제공하는 REST API
  //(GET) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
   List<BoardDTO> boardList = boardService.selectBoardList();
   return boardList;
  }

  //게시글 하나의 정보를 조회하는 기능을 제공하는 REST API
  //(GET) localhost:8080/boards/1 or 2 or 3 ....
  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    return boardService.getBoard(boardNum);
  }

  //(POST)localhost:8080/boards
  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    return boardService.insertBoard(boardDTO);
  }
}

//데이터 베이스와 스프링자바를 연결하는 순서
/*
* 1. 프로젝트 생성 및 설정
* 2. DB 테이블 생성
* 3. 테이블과 연결될 DTO 클래스 만들기
* 4. resources 파일 밑에 mapper 폴더를 만들고 그 안에 xml 파일을 넣고 쿼리문을 작성한다
* 5. 기본 패키지 안에 mapper 패키지를 만들고 그 안에 쿼리문을 실행하는 mapper 인터 페이스를 만든다 => @Mapper => 객체 생성도 해줌
* 6. 기본 패키지 안에 service 패키지를 만들고 핵심기능을 정의만하는 인터페이스와 그걸 구현하는 클래스 만들기
* => 구현하는 클래스(Impl)에서: mapper에 있는 메서드 호출하기 위해 mapper 에서 객체 생성하고(@Mapper 는 객체도 생성해줌)호출하여
* 생성자 주입 후 구현한다.
* 7. 기본 패키지 안에 controller 패키지만들고 REST-API와 serviceImpl 에서 구현한 메서드 호출
* => Impl 클래스에서 @service 로 객체 생성하고 controller 에서 생성자 주입 후 쓴다, 단 자료형은 service 인터페이스 클래스 자료형으로!!!
*
* */
