import React, { useState } from "react";

const Input_last = () => {
  const[info, setinfo] = useState({
    name : '',
    email : '',
    password : '',
    major : '', //학과를 선택하시오, 전체 이런것들은 초기값으로 속성값이 빈게 좋겠지?
    gender : 'male', //남성이 선택된 채로 나오게 하고 싶으니 남성의 value속성값과 일치하도록
    //라디오의 초기값 유의
    intro : ''
  })

  function chageInfo(e){
    setinfo({
      ...info,
      [e.target.name] : e.target.value
    })
  }
  
  return (
    <>
      <h2>마지막 예제 풀이</h2>
      이름 : <input type="text" name="name" value={info.name} onChange={(e)=>{
        chageInfo(e)
      }}/> <br />
     
      이메일 : <input type="text" name="email" value={info.email} onChange={(e)=>{
        chageInfo(e)
      }}/> <br />
      
      비밀번호 : <input type="password" name="password" value={info.password} onChange={(e)=>{
        chageInfo(e)
      }} /> <br />
      
      학과
      <select name="major" value={info.major} onChange={(e)=>{
        chageInfo(e)
      }}>
        <option value="">학과를 선택하세요</option>
        <option value="computer">컴퓨터공학</option>
        <option value="business">경영학과</option>
      </select> 
      <br />

      성별
      <input type="radio" name="gender" value='male' checked={info.gender === 'male'} onChange={(e)=>{
        chageInfo(e)
      }}/>남자
      <input type="radio" name="gender" value='female'checked={info.gender ==='female'} onChange={(e)=>{
        chageInfo(e)
      }}/>여자
      <br />

      자기소개
      <textarea name="intro" value={info.intro} onChange={(e)=>{
        chageInfo(e)
      }} cols="50" rows="5"></textarea>
      <br />

      <div>
        <h3>입력정보</h3>
        이름 : {info.name}<br />
        이메일 : {info.email}<br />
        비밀번호 : {info.password}<br />
        학과 : {info.major} <br />
        성별 : {info.gender}<br />
        자기소개 : {info.intro} <br />
      </div>

    </>
  );
};

export default Input_last;
