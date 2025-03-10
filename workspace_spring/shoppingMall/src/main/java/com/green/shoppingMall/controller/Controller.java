package com.green.shoppingMall.controller;


import com.green.shoppingMall.dto.ShoppingDTO;
import com.green.shoppingMall.service.ShoppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("malls")
@RequiredArgsConstructor
public class Controller {

  private final ShoppingService shoppingService;

 //상품등록 api
  //localhost:8080/malls
  @PostMapping("")
  public void insertShoppingMall(@RequestBody ShoppingDTO shoppingDTO){
    shoppingService.insertShopping(shoppingDTO);
  }

  @GetMapping("")
  public List<ShoppingDTO> getShoppingList(){
    return shoppingService.getShoppingList();
  }

  @GetMapping("/{itemNum}")
  public ShoppingDTO getShopping(@PathVariable("itemNum") int itemNum){
    return shoppingService.getShopping(itemNum);
  }

  @PutMapping("/{itemNum}")
  public void updateShopping(@PathVariable("itemNum") int itemNum, @RequestBody ShoppingDTO shoppingDTO){
    shoppingDTO.setItemNum(itemNum);
    shoppingService.updateShopping(shoppingDTO);
  }
}
