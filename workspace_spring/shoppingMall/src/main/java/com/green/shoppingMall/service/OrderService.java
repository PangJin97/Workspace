package com.green.shoppingMall.service;

import com.green.shoppingMall.dto.OrderDTO;
import com.green.shoppingMall.dto.ShoppingDTO;

import java.util.List;

public interface OrderService {

  //주문 등록
  public void insertOrder(OrderDTO orderDTO);

  //주문 목록
  public List<OrderDTO> getOrderList();
}
