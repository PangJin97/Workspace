import React, { useState } from "react";

  // const pw = 'password';
  //type = {pw} => 비밀번호 처럼 가려져서 나옴 => 타입이 패스워드로 바뀜
  //html의 속성값으로 변수를 줄 수있다 .
const Input_1 = () => {
  //input태그의 value 속성값을 저장할 state 변수
  const [data, setData] = useState('');
  //초기값을 ''빈문자로 준다
  return (
    <>
     <h2>input태그에 데이터 입력받기</h2>
     <input type="text" value={data} onChange={(e)=>{
      //useState의 초기값은 빈문자인데 처음의 value속성의 값도 빈문자로
      //onchange 이벤트가 발생될때마다(입력행위) e.target.value에 적용됨 
      console.log(e.target.value)
      //이벤트가 일어났을 때 태그의 value속성값을 불러온다.( value 속성은 입력한 값을 저장하는 속성 => 즉, 입력한 내용이 나옴)
      setData(e.target.value);
      //키보드에 입력할때 마다 이벤트가 발생한(입력하는) 태그의 value값을 불러온다.
     }} />

     <div>
      input 태그에 입력한 내용 : {data}
     </div>
    </>
  );
};

export default Input_1;

//value가 중요한데 input태그에 입력한 값이 value 속성 값에 들어간다. 
//input태그에 글자를 넣으면 그게 value값 
//input value onchage 는 셋트  

//해석이 굉장히 중요하다!!!!
//한문장씩 해석할 줄 알아야함
//=> useState로 값이 변경되면 리랜더링 된다! 그리고 state변수는  마지막 값을  가진다.
