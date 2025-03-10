import axios from "axios";
import React, { useEffect, useState } from "react";

const OrderList = ({ setOrderDetail, setIsShow }) => {
  const [orderList, setOrderList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/orders")
      .then((res) => {
        console.log(res.data);
        setOrderList(res.data);
      })
      .catch((error) => {
        console.log("통신오류");
        console.log(error);
      });
  }, []);

  return (
    <>
      <h2>주문목록</h2>
      <table className="orderList-table">
        <colgroup>
          <col width={"10%"} />
          <col width={"35%"} />
          <col width={"20%"} />
          <col width={"20%"} />
          <col width={"20%"} />
        </colgroup>
        <thead>
          <tr className="list-head">
            <td>NO</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매가격</td>
          </tr>
        </thead>
        <tbody className="list-body">
          {orderList.map((order, i) => {
            return (
              <tr key={i} className="list-body">
                <td>
                  <span
                    onClick={(e) => {
                      {
                        for(let i = 0; i < orderList.length; i++){
                          if(orderList[i].number === order.number){
                            setOrderDetail(orderList[i]);
                          }
                        }
                        setIsShow(true);
                      }
                    }}
                  >
                    {orderList.length - i}
                  </span>
                </td>
                <td>{order.name}</td>
                <td>{`${order.price}원`}</td>
                <td>{order.volume}</td>
                <td>{`${order.price * order.volume}원`}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default OrderList;
