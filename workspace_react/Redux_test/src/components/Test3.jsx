import React, { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { handleInsertCart } from "../redux/cartSlice";

const Test3 = () => {
  const itemList = useSelector((state) => state.itemList);

  const dispatch = useDispatch();

  const [newCart, setNewCart] = useState({
    cartNum: "",
    itemName: "",
    price: "",
  });

  const changeData = (e) => {
    setNewCart({
      ...newCart,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <>
      <h2>장바구니 목록 조회</h2>
      {itemList.map((item, i) => {
        return (
          <div key={i}>
            <p>상품번호: {item.cartNum}</p>
            <p>상품이름: {item.itemName}</p>
            <p>상품가격: {item.price}</p>
          </div>
        );
      })}
      
      <h2>상품등록</h2>
      <input
        type="text"
        name="cartNum"
        value={newCart.cartNum}
        onChange={(e) => {
          changeData(e);
        }}
      />
      상품번호
      <input
        type="text"
        name="itemName"
        value={newCart.itemName}
        onChange={(e) => {
          changeData(e);
        }}
      />
      상품명
      <input
        type="text"
        name="price"
        value={newCart.price}
        onChange={(e) => {
          changeData(e);
        }}
      />
      상품가격
      <button
        type="button"
        onClick={(e) => {
          dispatch(handleInsertCart(newCart));
        }}
      >
        상품등록
      </button>
    </>
  );
};

export default Test3;
