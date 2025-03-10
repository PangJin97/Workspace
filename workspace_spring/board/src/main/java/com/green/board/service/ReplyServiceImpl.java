package com.green.board.service;

import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

  private ReplyMapper replyMapper;

  @Autowired
  public ReplyServiceImpl(ReplyMapper replyMapper){
    this.replyMapper = replyMapper;
  }


  @Override
  public void replyInsert(ReplyDTO replyDTO) {
    replyMapper.replyInsert(replyDTO);
  }

  @Override
  public List<ReplyDTO> getReply(int boardNum) {
    return replyMapper.getReply(boardNum);
  }

  @Override
  public void deleteReply(int replyNum) {
    replyMapper.deleteReply(replyNum);
  }
}
