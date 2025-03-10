import React, { useState } from "react";

const RadioInput = () => {
  //선택한 라디오의 값을 저장할 state 변수
  const [feel, setFeel] = useState('soso')


  return (
    <>
    <h2>RadioInput</h2>

     {/* 여러 선택지 중에 무조건 하나만 선택 */}
     {/* 라디오의 name속성값을 동일하게 작성하게 짝지가 됨 */}
     {/* useState 최초의 값을 체크 해두고 싶은 곳의 value값과 일치하도록(이거는 select과 동일*/}
     {/* cheaked는 다 넣어줘야 한다 useState에서 설정한 초기값과 value 속성값이 일치하다면 선택된채로 나오도록 하는 것(select과의 차이점*/}
     
     {/* select과 radio 둘다 value속성의 값에 유의 */}
    <input type="radio" name="aaa" value='bad' checked={feel === 'bad'}
      onChange={(e)=>{
        setFeel(e.target.value)
        //이벤트(체크하기)에 의해 value속성값이 bad로 바뀌고(e.target.value) checked={feel === 'bad'} 가 만족되면서 체크가 된다. 
      }}
    /> 나쁨
   
    <input type="radio" name="aaa" value='soso' checked={feel==='soso'}
      onChange={(e)=>{
        setFeel(e.target.value)
      }}
    /> 보통
   
    <input type="radio" name="aaa" value='good' checked={feel==='good'} onChange={(e)=>{
      setFeel(e.target.value)
    }}
    /> 좋음

    <br />
    선택한 값: {feel}
    </>
  );
};

export default RadioInput;
