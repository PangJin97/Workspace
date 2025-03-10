package com.green.shop.service;

import com.green.shop.dto.ShopDTO;
import com.green.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//핵심기능을 구현
//핵심 기능을 쿼리 실행이라고 생각
//-=> 쿼리 실행을 위해서는 ShopMapper에 객체 생성하고 호출
@Service
public class ShopServiceImpl implements ShopService {
  private ShopMapper shopMapper;

  @Autowired
  public ShopServiceImpl(ShopMapper shopMapper){
    this.shopMapper = shopMapper;

  }

  @Override
  public int insertProduct(ShopDTO shopDTO) {
    System.out.println("상품의 재고를 확인한다");
    System.out.println("상품에 이상이 없는지 확인한다");
    System.out.println("상품이 잘 등록됐는지 확인한다.");
    return shopMapper.insertProduct(shopDTO);
  }

  @Override
  public List<ShopDTO> getShop() {
    return shopMapper.getShop();
  }

  @Override
  public ShopDTO getProducts(int itemCode) {
    return shopMapper.getProducts(itemCode);
  }

  //상품을 삭제하는 기능 실행
  @Override
  public void deleteProduct(int itemCode) {
     shopMapper.deleteProduct(itemCode);
  }

  @Override
  public void updateProduct(ShopDTO shopDTO) {
     shopMapper.updateProduct(shopDTO);
  }
}
