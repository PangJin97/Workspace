package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
  private BoardMapper boardMapper;

  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  public List<BoardDTO>getBoardList(SearchDTO searchDTO){
    return boardMapper.getBoardList(searchDTO);
  }

  @Override
  //조회 수 증가는 상세정보 기능에 포함되기 때문에
  //상세조회 할때 같이 조회수를 증가 시킨다.
  public BoardDTO getBoardDetail(int boardNum) {
    //조회 수 증가 쿼리 실행
    boardMapper.updateCnt(boardNum);
    //상세 정보 조회 쿼리
    return boardMapper.getBoardDetail(boardNum);
  }

  @Override
  public void insertBoard(BoardDTO boardDTO) {
    boardMapper.insertBoard(boardDTO);
  }

  @Override
  public void deleteBoard(int boardNum) {
    boardMapper.deleteBoard(boardNum);
  }

  @Override
  public void updateBoard(BoardDTO boardDTO) {
    boardMapper.updateBoard(boardDTO);
  }


}
