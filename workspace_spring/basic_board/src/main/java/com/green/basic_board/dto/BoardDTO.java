package com.green.basic_board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Setter
@Getter
@ToString
public class BoardDTO {
  //DB의 칼럼명과 똑같이 자바식으로!!!
  private String title;
  private int boardNum;
  private String writer;
  private String content;
  private int readCnt;
  private Timestamp createDate;
  //날짜의 자료형은 Timestamp
}
