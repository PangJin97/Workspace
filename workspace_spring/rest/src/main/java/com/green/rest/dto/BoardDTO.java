package com.green.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//연습!!
@Getter
@Setter
@ToString
public class BoardDTO {

  //쿼리의 컬럼명과 동일하게
  //다만 자바의 방식대로
  private int boardNum;
  private String title;
  private String content;
  private String writer;

}
