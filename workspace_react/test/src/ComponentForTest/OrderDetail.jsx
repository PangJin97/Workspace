import React, { useState } from "react";

const OrderDetail = ({ orderDetail }) => {
  return (
    <>
      <h2>주문상세정보</h2>
      <table className="orderDetail-table">
        <colgroup>
          <col width={"25%"} />
          <col width={"25%"} />
          <col width={"25%"} />
          <col width={"25%"} />
        </colgroup>
        <tbody className="detail-body">
          <tr>
            <td>상품번호</td>
            <td>{orderDetail.number}</td>
            <td>상품명</td>
            <td>{orderDetail.name}</td>
          </tr>
          <tr>
            <td>가격</td>
            <td>{`${orderDetail.price}원`}</td>
            <td>수량</td>
            <td>{orderDetail.volume}</td>
          </tr>
          <tr>
            <td>주문자ID</td>
            <td>{orderDetail.id}</td>
            <td>구매금액</td>
            <td>{`${
              orderDetail.price * orderDetail.volume
            }원`}</td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default OrderDetail;
