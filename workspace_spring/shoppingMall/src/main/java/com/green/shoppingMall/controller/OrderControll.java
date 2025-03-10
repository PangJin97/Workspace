package com.green.shoppingMall.controller;

import com.green.shoppingMall.dto.OrderDTO;
import com.green.shoppingMall.dto.ShoppingDTO;
import com.green.shoppingMall.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderControll {

  private final OrderService orderService;

  @PostMapping("")
  public void insertOrder(@RequestBody OrderDTO orderDTO){
    orderService.insertOrder(orderDTO);
  }

  //주문 목록
  @GetMapping("")
  public List<OrderDTO> getOrderList(){
   return orderService.getOrderList();
  }


}
