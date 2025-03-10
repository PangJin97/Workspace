import React from 'react'
import './Test3.css'
import { useState } from 'react'

export const Test3 = () => {
  const [isShow, setIsShow] = useState(true);
  const [btnText, setBtnText] = useState('광고닫기')


  return (
    <>
    <div>Test3풀이</div>

    <button type='button' onClick={()=>{
      setBtnText(btnText === '광고닫기' ? '광고보기' : '광고닫기');
      setIsShow(!isShow);
    }}>{btnText}</button>
    
    {
      isShow ? <div className='banner'>오늘 구매하시면 30% SALL!!!</div> : null
    }
    </>
   
  )
}
export default Test3;
