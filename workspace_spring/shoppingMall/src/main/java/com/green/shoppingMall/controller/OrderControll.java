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

  /*
  [
    {
        "itemNum": 0,
        "buyer": "김자바",
        "buyCnt": 1,
        "buyPrice": 40000,
        "buyDate": "2025-03-03T13:19:21",
        "price": 0,
        "shoppingDTO": {
            "itemNum": 0,
            "itemName": "상품4",
            "itemPrice": 40000,
            "seller": null,
            "itemIntro": null,
            "regDate": null
        },
        "orderNum": 0
    },
    {
        "itemNum": 0,
        "buyer": "유자바",
        "buyCnt": 2,
        "buyPrice": 40000,
        "buyDate": "2025-03-03T13:19:53",
        "price": 0,
        "shoppingDTO": {
            "itemNum": 0,
            "itemName": "상품2",
            "itemPrice": 20000,
            "seller": null,
            "itemIntro": null,
            "regDate": null
        },
        "orderNum": 0
    },
    {
        "itemNum": 0,
        "buyer": "이자바",
        "buyCnt": 4,
        "buyPrice": 120000,
        "buyDate": "2025-03-03T13:19:34",
        "price": 0,
        "shoppingDTO": {
            "itemNum": 0,
            "itemName": "상품1",
            "itemPrice": 30000,
            "seller": null,
            "itemIntro": null,
            "regDate": null
        },
        "orderNum": 0
    }
]
*/


}
