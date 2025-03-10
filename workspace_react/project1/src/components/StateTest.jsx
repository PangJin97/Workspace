import React, { useState } from "react";

export const StateTest = () => {
  console.log(3);
  //state 변경 함수가 실행되면 state 변수가 선언된 컴포넌트가 리렌더링된다. 리덴더링이란 컴포넌트를 다시 읽어 화면을 새로 그린다는 의미이다
  //리렌더링이 되더라도 state변수의 값은 초기화되지 않고, 마지막 데이터를 저장하고 있다

  // useState는 실행 후 두 개의 데이터를 갖는 배열을 리턴 한다.
  
  //배열의 (0번째 요소)첫번째 데이터는 소괄호 안에 작성된 데이터를 리턴 한다. 
  //  => state 변수  
 
  //배열의 두번째 데이터로 전달되는 것은 함수다 
  // => state 변경 함수 
  
  //구조분해 할당을 쓴다.
  //두번째로 리턴되는 함수는 변수의 값을 변경하는 기능을 가진 함수(자바에서의 setter매서드)
  let [hobby, setHobby] = useState('잠자기');

  //구조분해 할당에 의해 잠자기가 hobby로 들어가고(초기값), setHobby함수로 값을 변경 

  return (
    <>
      <div>{hobby}</div>
      <button type="button" onClick={() => {
        setHobby('밥먹기');
      }}>취미변경</button>
    </>
  );
};
export default StateTest;
