package com.green.shoppingMall.controller;

import com.green.shoppingMall.dto.BoardDTO;
import com.green.shoppingMall.dto.JoinDTO;
import com.green.shoppingMall.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
  private final TestService testService;


  @GetMapping("/1")
  public List<JoinDTO> tes1(){
    return testService.getEmpList();
  }

  @GetMapping("/2")
  public List<BoardDTO> tes2(){
    return testService.joinList();
  }


}
