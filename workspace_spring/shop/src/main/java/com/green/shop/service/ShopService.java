package com.green.shop.service;

import com.green.shop.dto.ShopDTO;

import java.util.List;

//핵심기능을 정의한 인터 페이스
//핵심기능 : 퀴리작업
//쿼리작업하는 기능을 선언한다
public interface ShopService {

  public int insertProduct(ShopDTO shopDTO);

  public List<ShopDTO> getShop();

  public ShopDTO getProducts(int itemCode);

  //상품을 삭제하는 기능 실행 메서드 정의
  public void deleteProduct(int itemCode);

  public void updateProduct(ShopDTO shopDTO);

}
