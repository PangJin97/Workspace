import React, { useState } from 'react'
import './Test7.css'

export const Test7 = () => {

  const[isShow,setIsShow]=useState(false);

  return (
    <>
      <h2>Test7</h2>
      <div className='mouseShow' onMouseEnter={(e)=>{
        setIsShow(true);
        //유스스테이트가 true로 바뀌면 재랜더링 된다. 
        //재랜더링 되도 유스스테이트의 마지막값인 true를 지님
      }} onMouseLeave={(e)=>{
        setIsShow(false);
      }}>마우스를 올리면 글자가 보임</div>
      
      
      {
        isShow ? <div className='show'>React</div> : null
      }
      
      {/* jsx안(retrun문)에는 자바스크립트 쓰려면 {}안에 써야한다. 근데 if문 못 써서 삼항연산자로 대체 */}
      {/* 하나의 태그에는 여러가지 이벤트 삽입 가능  */}
      {/* jsx속 {}의 자바스크립트에는 세미클론을 붙이지 않는다. */}
      {/* 자바스크립트는 리턴문 전에! return문(화면에 보여지는)안에 자바스크립트 쓰려면 반드시
      {} */}
    </>
  )
}
export default Test7;
