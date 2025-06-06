import React, { useEffect, useState } from "react";

const Effect_1 = () => {
  const[cnt1, setCnt1] = useState(0);
  const[cnt2, setCnt2] = useState(0);
  
  //useEffect의 두번째 매개변수를 의존성 배열이라 부름.
  //의존성 배열을 어떻게 작성하냐에 따라 useEffect의 리렌더링 시점의
  //실행 여부를 결정.

  
  //의존성 배열을 빈배열로 선언하면 
  //useEffect의 내용은 mount될때만 실행!
  useEffect(()=>{
    console.log(5);
  }, []);


  //의존성 배열에 cnt1변수를 작성하면
  //mount될 때 실행 한 뒤, cnt1값이 '변경되서 리랜더링' 될 때만 
  //useEffect 실행'
  useEffect(()=>{
    console.log('cnt1값 변경');
  }, [cnt1]);


  //mount될 때 실행 한 뒤, cnt2 값이 '변경되서 리랜더링' 될 때만
  //useEffect 실행
  useEffect(()=>{
    console.log('cnt2값 변경');
  }, [cnt2]);

  //mount될 때 실행 한뒤
  //cnt1 혹은 cnt2 둘 중 하나라도(or) 변경되어 리랜더링 될 때 실행
  useEffect(()=>{
    console.log('값 변경');
  }, [cnt1, cnt2]);
  //배열안에 변수가 많아도 그 중 하나라도 변경되면 리랜더링 된다.
  
  
  
  return (
    <>
      <div>Effect_1</div>
      <button type="button" onClick={(e)=>{
        setCnt1(cnt1 + 1)
      }}>cnt1 변경 버튼 : {cnt1}</button>

      <button type="button" onClick={(e)=>{
        setCnt2(cnt2 + 1)
      }}>cnt2 변경 버튼 : {cnt2}</button>
    </>
  );
};

export default Effect_1;
