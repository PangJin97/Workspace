package com.green.shoppingMall.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class BoardDTO {

  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private int redCnt;
  private LocalDateTime regDate;
  private List<ReplyDTO> replyList;
  /*1 대 n 관계 board : board_reply*/
  /*List<ReplyDTO> replyList 댓글여러개를 가지니까
  * list로 받는다  */
}
