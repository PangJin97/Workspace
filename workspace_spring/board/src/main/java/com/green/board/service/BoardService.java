package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface BoardService {

  public List<BoardDTO> getBoardList(SearchDTO searchDTO);

  public BoardDTO getBoardDetail(int boardNum);

  public void insertBoard(BoardDTO boardDTO);

  public void deleteBoard(int boardNum);

  public void updateBoard(BoardDTO boardDTO);

  //조회수 증가는 상세조회 기능안에 포함된다!!!
  //즉 별개의 기능으로 만들지 않는다는 뜻이다

}

