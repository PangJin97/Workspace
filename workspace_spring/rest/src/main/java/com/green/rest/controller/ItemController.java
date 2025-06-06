package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@Slf4j
public class ItemController {

  //1. 모든 상품을 조회하는 기능을 제공하는 REST_API
  @GetMapping("")
  public void getItems(){
    log.info("모든 상품 조회");
  }


  //2. 상품하나를 조회하는 기능을 제공하는 REST_API
  @GetMapping("/{itemCode}")
  public void getItem(@PathVariable ("itemCode") int itemCode){
    log.info("상품 하나 조회");
    log.info("itemCode: " + itemCode);
  }

  //3. 상품하나를 등록하는 기능을 제공하는 REST_API

  @PostMapping("")
  public void insertItem(@RequestBody ItemDTO itemDTO){
    log.info("상품 등록");
    log.info("itemDto = " + itemDTO);
  }

  //4. 상품하나를 삭제하는 기능을 제공하는 REST_API

  @DeleteMapping("/{itemCode}")
  public void deleteItem(@PathVariable("itemCode") int itemCode){
    log.info("상품 하나 삭제");
    log.info("itemCode = " + itemCode);

  }

  //5. 상품하나의 상품명과 가격, 색상을 변경하는 기능 제공 REST_API

  @PutMapping("/{itemCode}")
  public void updateItem(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    log.info("itemCode: " + itemCode);
    log.info("itemDto: " + itemDTO);
  }
}
