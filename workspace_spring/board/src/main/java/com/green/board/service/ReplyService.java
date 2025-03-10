package com.green.board.service;

import com.green.board.dto.ReplyDTO;

import java.util.List;

public interface ReplyService {

  public void replyInsert(ReplyDTO replyDTO);

  public List<ReplyDTO> getReply(int boardNum);

  public void deleteReply(int replyNum);

}
