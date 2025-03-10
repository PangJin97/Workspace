package com.green.shoppingMall.service;

import com.green.shoppingMall.dto.ShoppingDTO;

import java.util.List;


public interface ShoppingService {

  public void insertShopping(ShoppingDTO shoppingDTO);

  public List<ShoppingDTO> getShoppingList();

  public ShoppingDTO getShopping(int itemNum);

  public void updateShopping(ShoppingDTO shoppingDTO);

}
