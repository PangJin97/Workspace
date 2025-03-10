import React, { useState } from 'react'

export const Test5 = () => {
  const [person, setPerson] = useState({
    name : '김자바',
    age : 20,
    address : '울산시'
  })

  return (
    <>
      <h2>test5</h2>
      <h3>이름 : {person.name}</h3>
      <h3>나이 : {person.age}</h3>
      <h3>주소 : {person.address}</h3>
      {/* $쓰지 않고 그냥 쓰면 된다. html */}
      
      <button id ='aaa' className='bbb' type='button' onClick={(e) => {
        //이벤트 함수에 비슷한 경우가 많을 때, 이벤트 객체를 쓴다 
       
        //이벤트 발생 시 실행코드로 작성하는 함수의 매개변수로는
        //이벤트 객체를 전달 받을 수 있습니다.
        //이벤트 객체는 이벤트와 관련된 모든 정보를 객체 형태로 갖고 있다.
       
        console.log(e);
        console.log(e.target);
         //이벤트가 발생한 태그 => 많이 씀
        console.log(e.target.type);
        //이벤트가 발생한 태그의 타입 속성값
        console.log(e.target.id);
        console.log(e.target.className);
       
      }}>이름을 홍길동으로 변경</button>
      
      
      <button type='button' onClick={() => {
        setPerson({
          ...person,
          age : 30
        })

      }}>나이를 30으로 변경</button>
      
     
      <button type='button' onClick={() => {
        setPerson({
          ...person,
          address : '서울시'
        })
      }}>주소를 서울시로 변경</button>


    </>
  )
}
export default Test5;
