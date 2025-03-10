import axios from "axios";
import React, { useEffect, useState } from "react";
import ShopDetail from "./ShopDetail";
import styles from "./ShopList.module.css";

const ShopList = () => {
   /// const [isShow, setIsShow] = useState(false);
  const [sendItemNum, setSendItemNum] = useState(null);

  //조회한 상품 목록 데이터를 저장할 state변수
  
  const [shopList, setShopList] = useState([]);


  //상품 목록 받아오기
  useEffect(() => {
    axios
      .get("/api/malls")
      .then((res) => {
        setShopList(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div className={styles.container}>
      <div className={styles.main}>
        <h3>상품 목록</h3>
        <table>
          <colgroup>
            <col width={""} />
            <col width={""} />
            <col width={""} />
            <col width={""} />
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>상품가격</td>
              <td>판매자</td>
            </tr>
          </thead>
          <tbody>
            {shopList.map((shop, i) => {
              return (
                <tr key={i}>
                  <td>{shopList.length - i}</td>
                  <td>
                    <span
                      onClick={(e) => {
                        //setIsShow(true);
                        setSendItemNum(shop.itemNum);
                      }}
                    >
                      {shop.itemName}
                    </span>
                  </td>
                  <td>￦{shop.itemPrice.toLocaleString()}</td>
                  <td>{shop.seller}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
        <p>{`총 ${shopList.length}개의 상품이 등록 되었습니다`}</p>
      </div>

      <div className={styles.detail_div}>
        {
           //isShow ? <ShopDetail sendItemNum={sendItemNum} /> : null
           sendItemNum && <ShopDetail sendItemNum={sendItemNum} />
        }
      </div>
    </div>
  );
};

export default ShopList;
