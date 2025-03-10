package com.green.shop.controller;

import com.green.shop.dto.ShopDTO;
import com.green.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class Controller {

  private ShopService shopService;

  @Autowired
  public Controller(ShopService shopService){
    this.shopService = shopService;
  }

  @PostMapping("")
  public int insertProduct(@RequestBody ShopDTO shopDTO){
    //매개변수로 쿼리의 채워줄것!
    //클래스 ShopDTO => 상품명, 상품가격, 상품설명 3개의 데이터가 들어있음
    return shopService.insertProduct(shopDTO);
  }

  @GetMapping("")
  public List<ShopDTO>getShop(){
    List<ShopDTO> shopDTOList = shopService.getShop();
    return shopDTOList;
  }

  @GetMapping("/{itemCode}")
  public ShopDTO getProducts(@PathVariable("itemCode") int itemCode){
    return shopService.getProducts(itemCode);
  }

  //local:8080/shops/5
  @DeleteMapping("/{itemCode}")
  public void deleteProduct(@PathVariable("itemCode") int itemCode){
    shopService.deleteProduct(itemCode);
  }

  @PutMapping("/{itemCode}")
  public void updateProduct(@PathVariable("itemCode") int itemCode, @RequestBody ShopDTO shopDTO){
    shopDTO.setItemCode(itemCode);
    shopService.updateProduct(shopDTO);
  }
}
