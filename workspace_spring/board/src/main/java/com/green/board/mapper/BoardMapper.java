package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  public List<BoardDTO> getBoardList(SearchDTO searchDTO);
  //#{searchValue}는 => searchDto.getSearchValue 로 해석되는데
  //없잖아?? 없으면 만들면 되지
  //빈값을 채우기위해 DTO클래스를 새로 만들어야함

  public BoardDTO getBoardDetail(int boardNum);

  public void insertBoard(BoardDTO boardDTO);

  public void deleteBoard(int boardNum);

  public void updateBoard(BoardDTO boardDTO);

  //조회 수 증가 쿼리 실행 메서드
  public void updateCnt(int boardNum);

}
