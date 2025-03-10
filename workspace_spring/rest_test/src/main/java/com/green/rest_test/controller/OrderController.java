package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("orders")
public class OrderController {

  @GetMapping("")
  public List<OrderDTO> getOderInfos(){
    List<OrderDTO> orderList = new ArrayList<>();

    orderList.add(new OrderDTO(1,"데님 청바지",15000,2,"a"));
    orderList.add(new OrderDTO(2,"맨투맨 반팔 티셔츠",10000,3,"b"));
    orderList.add(new OrderDTO(3,"오버핏 니트",25000,2,"c"));
    orderList.add(new OrderDTO(4,"롱패딩",55000,1,"d"));
    orderList.add(new OrderDTO(5,"맨투맨 긴팔 티셔츠",12000,3,"e"));

    return orderList;
  }

  @GetMapping("/{number}")
  public void getOrderInfo(@PathVariable("number") int number){
    log.info("하나의 주문 정보 조회");
    log.info("number: " + number);
  }

  @PostMapping("")
  public void insertOrderInfo(@RequestBody OrderDTO orderDTO){
    log.info("하나의 주문 정보 등록");
    log.info("orderDTO: " + orderDTO);
  }

  @DeleteMapping("/{number}")
  public void deleteOrderInfo(@PathVariable("number") int number){
    log.info("하나의 주문 정보 삭제");
    log.info("number: " + number);
  }

  @PutMapping("/{number}")
  public void updateOrderInfo(@PathVariable("number") int number, @RequestBody OrderDTO orderDTO){
    log.info("하나의 주문정보에서 상품명과 상품가격을 수정하기");
    log.info("number: " + number);
    log.info("orderDTO: " + orderDTO);
  }
}
