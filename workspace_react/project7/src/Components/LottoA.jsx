import React, { useState } from "react";
import "./LottoA.css";
import axios from "axios";
import LottoNum from "./LottoNum";

const LottoA = () => {
  //로또의 번호를 저장하는 state 변수 
  const [lotto, setLotto]=useState([0,0,0,0,0,0])
  //project2번 문제 참조 

 
  return (
    <>
      <h2 className="h2">연습2</h2>
      <h2>로또 자동 번호 생성기</h2>
     
      <div className="lotto">
        {
          lotto.map((num, i)=>{
            return(
              //컴포넌트도 map함수를 통해 반복 가능 
              <LottoNum key={i} 
              num = {num} 
              lotto = {lotto}
              setLotto = {setLotto}
              i={i}/>
            )
          })
        }
        
      </div>
    
    </>
  );
};

export default LottoA;
