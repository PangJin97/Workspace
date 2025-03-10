package com.green.shoppingMall.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
/*@NoArgsConstructor 매개변수 없는 생성자
  @AllArgsConstructor 모든 변수를 매개의 변수로 갖는 생성자 */

//@RequiredArgsConstructor final 키워드를 갖는 변수를 매개변수로 받는 생성자를 만들어줌

//상단 메뉴 바에 view 에서 tool window 의 constructor 에서 확인
public class ShoppingDTO {
  private int itemNum;
  private String itemName;
  private int itemPrice;
  private String seller;
  private String itemIntro;
  private LocalDateTime regDate;
}
