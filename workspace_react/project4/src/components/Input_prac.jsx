import React, { useState } from "react";

const Input_prac = () => {
  const[data,setData]= useState({
    //모든 입력정보를 저장할 state변수
    name : '',
    tel : '',
    email: '',
    study: '국어'
  });

  function changData(e){
    setData({
      ...data,
      [e.target.name] : e.target.value 
      //태그의 속성인 name의 속성값을 가져옴
      //그 속성값이 유스스테이트의 초기값 객체의 변수 명들과 일치하게 한다. 
      //위가 tel 이면 속성 값도 tel로 
    })
  }
  //모든 input태그의 값이 변경될 때 실행할 함수 
  //input태그에 입력한 정보를 data에 저장(변경)하는 기능 

  return (
    <>
      <h2>prac</h2>
      <h3>회원가입</h3>
      이름: <input name ="name" type="text" value={data.name} onChange={(e)=>{
        //이벤트가 실행될때 전달된 객체 e를 매개변수로
        //changeDate함수에  넣는다
        changData(e)
      }}/> <br />
     
      연락처: <input name="tel" type="text" value={data.tel} onChange={(e)=>{
        changData(e)
      }}/> <br />
      이메일: <input name="email" type="text" value={data.email}
      //value의 초기값은 data.email 인데 onchange 이벤트(입력할때마다)
      //입력된 value속성 값은 => e.target.value
     
      // e(이벤트가 발생될 때 객체).target.value와 그냥 target.value와 다름  

      //e.target.value =>현재 이벤트가 발생된 value속성값을 가져와라
      //즉, 입력된(이벤트) 값(value 속성값)을 가져와라 
      
      onChange={(e)=>{
        changData(e)
      }} /> <br />
     
      희망강의:
       <select name="study" value={data.study} onChange={(e)=>{
        changData(e);
       }}>
        <option value="국어">국어</option>
        <option value="영어">영어</option>
        <option value="수학">수학</option>
      </select>


      <div>
        <h4>작성내용</h4>
        <p>이름 - {data.name}</p>        
        <p>연락처 - {data.tel}</p>        
        <p>이메일 - {data.email}</p>        
        <p>희망과목 - {data.study}</p>        
      </div>
      
    </>
  );
};

export default Input_prac;

//onchange => 