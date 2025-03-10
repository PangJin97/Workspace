import React, { useState } from 'react'

export const Test6 = () => {
  const [count, setCount ] = useState(0);

  const changeCnt = (val) => {
    // setCount(count-1); -1 부분만 바뀐다, (+ -1 = -1)
    setCount(count + val);
  };


  return (
    <>
      <h2>Test6</h2>
      
      <h2>Simple counter</h2>
      <div>
        <p>현재카운트 : </p>
        <p>{count}</p>
      </div>
      
      <div>
        <button type='button' onClick={(e)=>{
          changeCnt(-1);
        }}>-1</button>
        
        <button type='button' onClick={(e) => {
          changeCnt(-10);
        }}>-10</button>
       
        <button type='button' onClick={(e)=>{
          changeCnt(-100);
        }}>-100</button>
        
        <button type='button' onClick={(e)=>{
          changeCnt(100);
        }}>+100</button>
       
        <button type='button' onClick={(e)=>{
          changeCnt(10);
        }}>+10</button>
       
        <button type='button' onClick={(e)=>{
          changeCnt(1);
        }}>+1</button>
      </div>

      {/* 중복된 데이터의 충돌을 막을 수 있으니 최대한 함수로 만들기  */}
    </>
  )
}
export default Test6;
