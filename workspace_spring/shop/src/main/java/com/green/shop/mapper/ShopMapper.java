package com.green.shop.mapper;

import com.green.shop.dto.ShopDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//메소드의 리턴타입 : 쿼리 실행 전체 결과를 가져올 자료형
// 매개변수에는 빈값을 채워주는 값
@Mapper
//객체생성 + 해당 파일에 퀴리를 실행시킬 메서드가 정의되어 있다는 걸 인지
public interface ShopMapper {

  public int insertProduct(ShopDTO shopDTO);

  public List<ShopDTO> getShop();

  public ShopDTO getProducts(int itemCode);

  //상품을 삭제하는 쿼리 실행 메서드
  public void deleteProduct(int itemCode);

  //update 쿼리 실행 메서드
  public void updateProduct(ShopDTO shopDTO);
  // #{itemCode}, #{itemName}  #{itemPrice}  #{itemIntro}
  // 빈값을 채울 데이터가 4개
}
