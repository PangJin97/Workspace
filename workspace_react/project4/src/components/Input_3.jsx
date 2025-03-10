import React, { useState } from "react";

const Input_3 = () => {
  //셀렉트박스에서 선택한 데이터를 저장하기 위한 state변수
  
  //초기값은 여러 option들 중에 최초로 화면에 표현하고 싶은
  //option태그의 'value 속성값'으로 지정 => input이든 select든 radio든 value값이 가장중요하다 
  const[fruit, setFruit] = useState('banana');
  //value에 있는 banana를 지닌 바나나


  return (
    <>
    <h2>Select</h2>
      <select value={fruit} onChange={(e)=>{
        setFruit(e.target.value);
        //사과 바나나 오렌지가 선택될때(이벤트, onchange) 그때의 value의 값이(e.target.value)  => apple, bananan, ornge로 바뀐다, 
      }}>
        <option value="apple">사과</option>
        <option value='banana'>바나나</option>
        <option value="orange">오렌지</option>
      </select>
    </>
  )
};

export default Input_3;
