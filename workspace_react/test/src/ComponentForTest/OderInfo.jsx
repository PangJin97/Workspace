import React, { useState } from "react";
import OrderList from "./OrderList";
import OrderDetail from "./OrderDetail";
import './OrderInfo.css'

const OderInfo = () => {
  const[orderDetail, setOrderDetail] = useState({})
  const[isShow, setIsShow]=useState(false)
  return (
    <>
     <div className="orderContainer">
        <div>
          <OrderList setOrderDetail={setOrderDetail} setIsShow={setIsShow}/>
        </div>
        <div>
          {
            isShow ?  <OrderDetail orderDetail={orderDetail}/> : null
          }
        </div>
     </div>
    </>
  );
};

export default OderInfo;
