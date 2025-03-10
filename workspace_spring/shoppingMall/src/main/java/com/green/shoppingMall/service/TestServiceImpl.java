package com.green.shoppingMall.service;

import com.green.shoppingMall.dto.BoardDTO;
import com.green.shoppingMall.dto.JoinDTO;
import com.green.shoppingMall.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
  private final TestMapper testMapper;

  @Override
  public List<JoinDTO> getEmpList() {
    return testMapper.getEmpList();
  }

  @Override
  public List<BoardDTO> joinList() {
    return testMapper.joinList();
  }
}
