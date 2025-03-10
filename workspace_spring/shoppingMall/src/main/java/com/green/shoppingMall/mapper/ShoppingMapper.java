package com.green.shoppingMall.mapper;

import com.green.shoppingMall.dto.ShoppingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingMapper {

  public void insertShopping(ShoppingDTO shoppingDTO);

  public List<ShoppingDTO>getShoppingList();

  public ShoppingDTO getShopping(int itemNum);

  public void updateShopping(ShoppingDTO shoppingDTO);
}
