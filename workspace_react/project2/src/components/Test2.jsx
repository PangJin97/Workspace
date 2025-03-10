import React, { useState } from 'react'

export const Test2 = () => {

  const [btn,setBtn] = useState('ON');
  const [btn1,setBtn1] = useState('OFF');

  return (
    <>
    <div>Test2</div>
    <h2>{btn}</h2>

    <button type='button' onClick={() => {
      setBtn(btn1)
      setBtn1(btn);
    }}>{btn1}</button>
  
    </>
  )
}
export default Test2;
