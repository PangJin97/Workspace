package com.green.basic_board.mapper;

import com.green.basic_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//해당 인터페이스가 board-mapper.xml 파일에 작성한 쿼리를
//실행하는 인터페이스
//'쿼리를 실행하는 인터페이스'는 @Mapper 어노테이션을 사용
//@Mapper 어노테이션이 붙은 인터페이스를 쿼리 실행 메서드가 존재하는 파일임을 인지, 객체 생성도 해줌
//해당 mapper 인터페이스와 연결될 xml 파일에 namespace 부분에 연결할
//인터페이스명을 패키지까지 포함해서 작성한다.

@Mapper
//@Component -> Mapper 가 객체 생생해줌
public interface BoardMapper {
  /*
  1. 메서드 명은 반드시 xml 파일에 작성한 '쿼리 id와 일치'

  2. 메서드의 '매개변수는 실행할 쿼리의 빈 값을 채울 용도'로 사용
  => 변할 수 있는 값, 변해야 하는 값

  3. 메서드의 리턴 타입은 쿼리 '실행 결과 전체'를 자바로 가져올 수 있는 자료형
  => mapper.xml의 resultType과의 차이점
   */


  //쿼리를 이 메서드로 실행 시키고 싶은거임
  //게시글 목록 조회 쿼리를 실행시킬 메서드

  public List<BoardDTO> selectBoardList();
  //매개변수는 필요없다. -> 매개변수가 반드시 있을 필요가 없다.

  //하나의 게시글 정보를 조회하는 쿼리를 실행시킬 메서드
  public BoardDTO getBoard(int boardNum);


  //게시글 등록 쿼리 실행 메서드
  public int insertBoard(BoardDTO boardDTO);
  // 리턴은 쿼리 실행 결과를 담는 자료형 => INSERT, UPDATE, DELETE 는 영향받은 행의 갯수가 결과 -> int
  //INSERT, UPDATE, DELETE 의 리턴 자료형은 int -> 안되면 외우셈

}

















