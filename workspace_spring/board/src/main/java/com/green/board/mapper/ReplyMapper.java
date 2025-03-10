package com.green.board.mapper;

import com.green.board.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {

  public void replyInsert(ReplyDTO replyDTO);
  //매개변수로 BoardDTO boardDTO 가능

  public List<ReplyDTO> getReply(int boardNum);

  public void deleteReply(int replyNum);
}
