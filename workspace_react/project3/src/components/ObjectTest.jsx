import React, { useState } from "react";

// 객체를 useState를 써서 변경하기
export const ObjectTest = () => {
  const [monitor, setMonitor] = useState({
    brand : 'samsung',
    price : 10000,
    color : 'black'
  })
  // 초기값(객체)
  // const monitor = {brand : 'samsung',
  // price : 10000,
  // color : 'black'} 


  return (
    <>
      <h2>ObjectTest</h2>
      {/* {monitor} 배열과 다르게 객체는 쌩으로 넣으면 오류가 난다(콘솔 확인) 객체안에 있는 데이터 하나 하나는 접근 가능*/}
      브랜드: {monitor.brand} <br />
      가격: {monitor.price} <br />
      색상: {monitor.color} <br />
      <button type="button" onClick={()=>{
        // monitor.brand = 'LG' 안된다!! 반드시 변경된 값을 화면에 반영하려면 유스테이스를 써야한다.
        
        // setMonitor(monitor); '참조자료형'이기 때문에 유스테이트를 써도 리랜더링 되지 않는다.

        //새로운 객체 생성!
       
        // const copyMonitor = monitor; 이러면 안됨 주소만 복사되니 데이터를 복사하려면 스프레드 연산자
        
        //const copyMonitor = ...monitor => 껍질 빠지면 데이터가 3개가 따로 따로 있는 거임. 데이터는
        // 따로 따로 못쓰니 다시 객체로 만든다 

        // const copyMonitor = {...monitor};
        // copyMonitor.brand = 'Lg'
        //값을 변경한 뒤 복사한 개체를 set에 넣는다 
        // setMonitor(copyMonitor);
        //배열도 똑같다.
        
        //더 쉬운 방법 
        setMonitor({
          ...monitor,
          //껍질까서 넣어줘 데이터 3개만 전달된다.
          // brand : 'samsung',
          // price : 10000,
          // color : 'black'
            brand : 'Lg'
            //키가 중복되네? 그럼 마지막으로 선언한 중복된 키 값의 마지막 데이터가 저장됨
            //바꾸고 싶은 키를 넣는다. 
            //brand 키의 마지막 값은 lg니까 삼성이 엘지로 바뀜
        });
        

      }}>버튼</button>
    </>
  );
};
export default ObjectTest;
