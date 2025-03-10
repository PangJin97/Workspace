import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import styles from "./ShopOrderList.module.css";

const ShopOrderList = () => {
  const [orderList, setOrderList] = useState([]);

  //const[totalOrderPrice, setTotalOrderPrice] = useState(0)

  console.log(orderList)

  useEffect(() => {
    axios
      .get("/api/orders")
      .then((res) => {
        setOrderList(res.data);
        console.log(res.data);
       
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  const getTotal = ()=>{
    let sum = 0;
    for(let i = 0; i < orderList.length; i++){
      sum = sum + orderList[i].buyPrice
    }
    return sum;
    //함수는 return할 수 있다. 리엑트에서 return은 화면에 뿌려준다
    //재 랜더링 될때마다 함수를 호출하고 return을 해줘서 
    //화면에 뿌려준다.
  }

  // useEffect(() => {
  //   if(orderList.length !== 0){
  //     getTotal();
  //   }
  // }, [orderList])
  //처음에는 배열이 0이니까 실행안하다가, 리스트의 길이가 0이 아니고  orderList의 값이 변할때 화면에 반영된다. 
  //동기성, 비동기성의 이해

  const sumPrice = orderList.reduce((acc, cur) => {return acc + cur.buyPrice},0);
  console.log(sumPrice);
  //reduce함수 

  return (
    <div className={styles.container}>
     <div className={styles.tableDiv}>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>상품단가</td>
              <td>구매수량</td>
              <td>구매가격</td>
              <td>주문자</td>
              <td>주문일</td>
            </tr>
          </thead>
  
          <tbody>
            {orderList.map((orders, i) => {
              return (
                <tr key={i}>
                  <td>{orderList.length - i}</td>
                  <td>{orders.shoppingDTO.itemName}</td>
                  <td>￦{orders.shoppingDTO.itemPrice.toLocaleString()}</td>
                  <td>{orders.buyCnt}</td>
                  <td>￦{orders.buyPrice.toLocaleString()}</td>
                  <td>{orders.buyer}</td>
                  <td>{dayjs(orders.buyDate).format("YYYY-MM-DD")}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
     </div>

      <div className={styles.sumDiv}>
        <span>총 주문 금액: ￦{getTotal().toLocaleString()}</span>
        {/* <span>￦{totalOrderPrice.toLocaleString()}</span> */}
      </div>
    </div>
  );
};

export default ShopOrderList;
