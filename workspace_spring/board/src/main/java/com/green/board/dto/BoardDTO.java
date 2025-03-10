package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BoardDTO {
  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private int readCnt;
  private LocalDateTime regDate;
  //DB에서 시간자료형을 받아오는 자료형은

  //TimeStamp와 LocalDateTime
  //TimeStamp는 시차까지 표현
  //LocalDateTime 우리나라 시간만
}
