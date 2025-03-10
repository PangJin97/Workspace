import axios from "axios";
import React, { useEffect, useState } from "react";


const Axios = () => {

  const[item,setItems]=useState({
    itemName : '',
    itemPrice: '',
    itemIntro: ''
  })

  const changeData = (e) => {
    setItems({
      ...item,
      [e.target.name] : e.target.value 
    })
  }

  return (
    <>
    <div>
    <table>
        <tbody>
          <tr>
            <td>상품명</td>
            <td>
              <input type="text" name="itemName" value={item.itemName} onChange={(e)=>{
                changeData(e)
              }} />
            </td>
          </tr>
          <tr>
            <td>상품가격</td>
            <td>
              <input type="text"  name="itemPrice" value={item.itemPrice} onChange={(e)=>{
                changeData(e)
              }}/>
            </td>
          </tr>
          <tr>
            <td>상품 상세 내용</td>
            <td>
              <textarea name="itemIntro" value={item.itemIntro} onChange={(e)=>{
                changeData(e)
              }}></textarea>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <div>
      <button type="button" onClick={(e)=>{
           axios.post("/api/shops", item)
           .then((res)=>{
             console.log('통신성공')
             console.log(res)
           })
           .catch((error)=>{
             console.log(error)
           })
      }}>전송하기</button>
    </div>
      
      

    </>
  );
};

export default Axios;
