package com.green.shoppingMall.service;

import com.green.shoppingMall.dto.OrderDTO;
import com.green.shoppingMall.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderMapper orderMapper;

  @Override
  public void insertOrder(OrderDTO orderDTO) {
    orderMapper.insertOrder(orderDTO);
  }

  //주문목록
  @Override
  public List<OrderDTO> getOrderList() {
    return orderMapper.getOrderList();
  }
}
