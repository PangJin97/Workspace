import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from './ShopDetail.module.css'
import dayjs from "dayjs";



const ShopDetail = ({ sendItemNum }) => {
  const [ShopDetail, setShopDetail] = useState({});

  useEffect(() => {
    axios
      .get(`/api/malls/${sendItemNum}`)
      .then((res) => {
        setShopDetail(res.data);
        console.log(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, [sendItemNum]);

  const changeData = (e) => {
    setShopDetail({
      ...ShopDetail,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <div className={styles.container}>
    
     <div className={styles.list_table}>
        <h3>상품 상세 정보</h3>
        <table>
          <tbody>
            <tr>
              <td>상품번호</td>
              <td>
                <input type="text" className="my-input wide" value={ShopDetail.itemNum} readOnly />
              </td>
            </tr>
            <tr>
              <td>상품명</td>
              <td>
                <input
                  className="my-input wide"
                  type="text"
                  name="itemName"
                  value={ShopDetail.itemName}
                  onChange={(e) => {
                    changeData(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <td>상품가격</td>
              <td>
                <input
                  className="my-input wide"
                  type="text"
                  name="itemPrice"
                  value={ShopDetail.itemPrice}
                  onChange={(e) => {
                    changeData(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <td>판매자</td>
              <td>
                <input className="my-input wide" type="text" readOnly value={ShopDetail.seller} />
              </td>
            </tr>
            <tr>
              <td>판매시작일</td>
              <td>
                <input className="my-input wide" type="text" readOnly value={dayjs(ShopDetail.regDate).format('YYYY-MM-DD HH:mm:ss')} />
              </td>
            </tr>
            <tr>
              <td>상품 설명</td>
              <td>
                <textarea
                  className="my-input wide"
                  name="itemIntro"
                  value={ShopDetail.itemIntro}
                  onChange={(e) => {
                    changeData(e);
                  }}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
     </div>

     <div className={styles.btn}>
        <button
          className="btn btn-large"
          type="button"
          onClick={(e) => {
            axios
              .put(`/api/malls/${sendItemNum}`, ShopDetail)
              .then((res) => {
                console.log(res.data);
              })
              .catch((error) => {
                console.log(error);
              });
          }}
        >
          수정
        </button>
     </div>
    </div>
  );
};

export default ShopDetail;
