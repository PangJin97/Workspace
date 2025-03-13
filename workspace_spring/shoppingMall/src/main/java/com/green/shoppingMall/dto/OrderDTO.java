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
  //주문테이블 기준으로 상품 정보 테이블은 1대1 관계이니
  //하나의 상품정보를 갖는 ShoppingDTO shoppingDTO를 포함시킨다

  //값 받아오기 위해 dto 에 변수 선언(주문할때 상품단가 => price 받기 위해서 만듬)
}
