import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from "./ShopOrder.module.css";
import { useNavigate } from "react-router-dom";

const ShopOrder = () => {

  const nav = useNavigate();

  // 1. 조회할 상품 목록을 저장할 변수
  const [orderInfo, setOrderInfo] = useState([]);

  // 2. 입력한 정보를 저장하는 변수
  const [orderData, setOrderData] = useState({
    itemNum: "",
    price: "상품을 선택하세요",
    //상품 단가 
    //DB에 buyPrice를 어떻게 가져가서 insert할까,,,,
    //일단 상품 단가를 가져간다. 

    buyer: "",
    buyCnt: 1,
  });

  console.log(orderData)

  // 1. 상품 목록 조회
  useEffect(() => {
    axios
      .get("/api/malls")
      .then((res) => {
        setOrderInfo(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  //3. 상품단가(price 찾기)

  //itemNum은 주문db테이블에도 있고 상품정보db테이블에도 있다! 
  const changerOrderData = (e) => {
    if(e.target.name === 'itemNum'){
      //상품을 선택하기(이벤트) 할때 name 속성값이 itemNum일때 
      let itemPrice = 0;
      for(const order of orderInfo){
        //상품 하나를 선택했을 때(이벤트) value 의 속성값과( ex) itemNum=4) 
        //조회한 상품 리스트의 상품 번호와 같은
        //아이템 가격을 상품 단가에 넣겠다
        // 최종목표는 그 상품 단가를 db로 가져가서 구매수량과 곱해 빈값을 채우고 
        // 구매가격을 구하겠다!
        
        //e.target.value은 select에서 선택한 상품의 상품번호
        //order.itemNum은 조회한 상품리스트의 상품번호
        if(e.target.value == order.itemNum){
          itemPrice = order.itemPrice;
        }
      }
      setOrderData({
        ...orderData,
        [e.target.name]: e.target.value,
        price : itemPrice,
      });
    }
    //만약에 일치하는 상품번호가 없다면 그냥 진행 
    else{
      setOrderData({
        ...orderData,
        [e.target.name]: e.target.value
    })}
  };

  const insertOrder = ()=>{
    axios.post('/api/orders', orderData)
          .then((res)=>{
            console.log(res.data)
            nav('/orderList')
          })
          .catch((error)=>{
            console.log(error)
          })
  }

  return (
    <div className={styles.container}>
      <div className={styles.main}>
        <h3>상품주문</h3>
        <table>
          <tbody>
            <tr>
              <td>주문상품</td>
              <td>
                <select
                  name="itemNum"
                  value={orderData.itemNum}
                  onChange={(e) => {
                    changerOrderData(e);
                  }}
                >
                  <option value="">선택</option>
                  {orderInfo.map((order, i) => {
                    return (
                      <option value={order.itemNum} key={i}>
                        {/* 주문하기 => insert 
                          ORDER_INFO테이블에 ITEM_NUM을 넣어야 하니 value값을 order.itemNum으로 */}
                          {/* value값이 중요하다!! 잊지말것 보여주는 건 따로고 value값은 따로다. */}
                        {order.itemName}
                      </option>
                    );
                  })}
                </select>
              </td>
            </tr>
            <tr>
              <td>상품단가</td>
              <td>
                <input type="text" name="price" value={orderData.price}  onChange={(e)=>{
                  changerOrderData(e)
                }} readOnly={true} />
              </td>
            </tr>
            <tr>
              <td>주문자</td>
              <td>
                <input type="text" name="buyer" value={orderData.buyer} onChange={(e) => {
                  changerOrderData(e)
                }} />
              </td>
            </tr>
            <tr>
              <td>주문 수량</td>
              <td>
                <input type="number" name="buyCnt" value={orderData.buyCnt} onChange={(e) => {
                  changerOrderData(e)
                }} />
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <div className={styles.btn}>
        <button className="btn btn-large" type="button" onClick={(e) => {
          insertOrder()
        }}>
          주문하기
        </button>
      </div>
    </div>
  );
};

export default ShopOrder;
