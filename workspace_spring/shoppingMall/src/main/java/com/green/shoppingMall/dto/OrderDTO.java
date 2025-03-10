package com.green.shoppingMall.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int OrderNum;
  private int itemNum;
  private String buyer;
  private int buyCnt;
  private int buyPrice;
  private LocalDateTime buyDate;
  //
  private int price;
  private ShoppingDTO shoppingDTO;
  //값 받아오기 위해 dto 에 변수 선언(주문할때 상품단가 => price 받기 위해서 만듬)
}
