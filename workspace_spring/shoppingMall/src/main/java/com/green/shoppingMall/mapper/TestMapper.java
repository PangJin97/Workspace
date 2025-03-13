package com.green.shoppingMall.mapper;

import com.green.shoppingMall.dto.BoardDTO;
import com.green.shoppingMall.dto.JoinDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {


  public List<JoinDTO> getEmpList();

  public List<BoardDTO> joinList();

}
