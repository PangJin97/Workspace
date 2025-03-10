import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import styles from "./ShopInsert.module.css";

const ShopInsert = () => {
  const nav = useNavigate();

  //입력데이터를 저장 할 변수
  const [insertShop, setInsertShop] = useState({
    itemName: "",
    itemPrice: "",
    seller: "",
    itemIntro: "",
  });

  const changeData = (e) => {
    setInsertShop({
      ...insertShop,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <div className={styles.container}>
      <div className={styles.insertTable}>
        <table>
          <tbody>
            <tr>
              <td>상품명</td>
              <td>
                <input
                  type="text"
                  name="itemName"
                  value={insertShop.itemName}
                  onChange={(e) => [changeData(e)]}
                />
              </td>
            </tr>
            <tr>
              <td>상품가격</td>
              <td>
                <input
                  type="text"
                  name="itemPrice"
                  value={insertShop.itemPrice}
                  onChange={(e) => [changeData(e)]}
                />
              </td>
            </tr>
            <tr>
              <td>판매자</td>
              <td>
                <input
                  type="text"
                  name="seller"
                  value={insertShop.seller}
                  onChange={(e) => {
                    changeData(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <td>상품설명</td>
              <td>
                <textarea
                  name="itemIntro"
                  value={insertShop.itemIntro}
                  onChange={(e) => {
                    changeData(e);
                  }}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <div className={styles.button}>
        <button
          className="btn btn-large"
          type="button"
          onClick={(e) => {
            //truthy, falsy
            if (!(insertShop.itemName && insertShop.itemPrice)) {
              alert("상품명과 가격은 필수입니다");
              return;
            }

            axios
              .post("/api/malls", insertShop)
              .then((res) => {
                console.log(res.data);
                alert("상품 등록 완료");
                nav("/");
              })
              .catch((error) => {
                console.log(error);
              });
          }}
        >
          등록
        </button>
      </div>
    </div>
  );
};

export default ShopInsert;
