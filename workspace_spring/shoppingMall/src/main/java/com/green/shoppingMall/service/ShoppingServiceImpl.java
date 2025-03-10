package com.green.shoppingMall.service;

import com.green.shoppingMall.dto.ShoppingDTO;
import com.green.shoppingMall.mapper.ShoppingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingServiceImpl implements ShoppingService{
  private final ShoppingMapper shoppingMapper;

  /*private ShoppingMapper shoppingMapper;

  @Autowired
  public ShoppingServiceImpl(ShoppingMapper shoppingMapper){
    this.shoppingMapper = shoppingMapper;
  }*/

  @Override
  public void insertShopping(ShoppingDTO shoppingDTO) {
    shoppingMapper.insertShopping(shoppingDTO);
  }

  @Override
  public List<ShoppingDTO> getShoppingList() {
    return shoppingMapper.getShoppingList();
  }

  @Override
  public ShoppingDTO getShopping(int itemNum) {
    return shoppingMapper.getShopping(itemNum);
  }

  @Override
  public void updateShopping(ShoppingDTO shoppingDTO) {
    shoppingMapper.updateShopping(shoppingDTO);
  }



}
