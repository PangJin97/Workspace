package com.green.shoppingMall.service;

import com.green.shoppingMall.dto.BoardDTO;
import com.green.shoppingMall.dto.JoinDTO;

import java.util.List;

public interface TestService {

  public List<JoinDTO> getEmpList();

  public List<BoardDTO> joinList();
}
