package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boards")
public class Controller {
  private BoardService boardService;

  public Controller(BoardService boardService) {
    this.boardService = boardService;
  }

  @GetMapping("")
  public List<BoardDTO> getBoardList(SearchDTO searchDTO) {
    return boardService.getBoardList(searchDTO);
    //BoardDTO 로 받을 수 없다.
    // 1. DB에 searchKeyword, searchValue 가 없다
    // 2. boardDTO 객체로 #{}의 문법을 통해 getter 호출 불가능
    //그럼 만들면 되지
  }

  /*쿼리스트링을 자바로 받을때 2가지 방법 */
  /*1. @RequestParam("searchKeyword") String searchKeyword, @RequestParam("searchValue) String searchValue*/
  /*2. DTO 클래스로 받기*/

  @GetMapping("/{boardNum}")
  public BoardDTO getDetailList(@PathVariable("boardNum") int boardNum) {
    return boardService.getBoardDetail(boardNum);
  }

  @PostMapping("")
  public void insertBoard(@RequestBody BoardDTO boardDTO) {
    boardService.insertBoard(boardDTO);
  }

  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }

  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
    //boardDTO 에는 쿼리에서 title 과 content 밖에 들어있지 않아서
    //boardNum 값도 pathVariable 로 받는다
  }



}

