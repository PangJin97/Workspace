package com.green.shoppingMall.mapper;

import com.green.shoppingMall.dto.OrderDTO;
import com.green.shoppingMall.dto.ShoppingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

  //주문 등록
  public void insertOrder(OrderDTO orderDTO);

  //주문목록
  public List<OrderDTO> getOrderList();
}
