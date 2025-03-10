import React, { useState } from "react";
import Display from "./Display";
import Controller from "./Controller";

const Counter = () => {
   const[cnt, setCnt] = useState(0);
   //props는 함수도 전달할 수 있다 setCnt는 함수 
 
    return (
    <>
      <h2>연습1</h2>
      <h2>Simple Counter</h2>
      <Display cnt={cnt}/>
      {/* 통상적으로 키값의 이름은 넘기고 싶은 데이터와 동일하게 */}
      <Controller cnt={cnt} setCnt={setCnt} />
    </>
  );
};

export default Counter;
