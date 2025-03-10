import React, { useState } from "react";

const Input_prac2 = () => {
  const [data, setData] = useState({
    name: "",
    email: "",
    pw: "",
    major: "",
    male: "Man",
    introduce: "",
  });

  const changData = (e) => {
    setData({
      ...data,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <>
      <h2>Input_prac2</h2>
      
      이름 :{" "}
      <input
        name="name"
        type="text"
        value={data.name}
        onChange={(e) => {
          changData(e);
        }}
      />{" "}
     
      <br />
     
      이메일 :{" "}
      <input
        name="email"
        type="text"
        value={data.email}
        onChange={(e) => {
          changData(e);
        }}
      />{" "}
    
      <br />
     
      비밀번호 :{" "}
      <input
        name="pw"
        type="password"
        value={data.pw}
        onChange={(e) => {
          changData(e);
        }}
      />
      
      <br />
      
      학과 :
      <select
        name="major"
        value={data.major}
        onChange={(e) => {
          changData(e);
        }}
      >
        <option value="">학과를 선택하세요</option>
        <option value="국어">국어</option>
        <option value="영어">영어</option>
        <option value="수학">수학</option>
      </select>
      
      <br />
     
      <input
        type="radio"
        value={"Man"}
        name="male"
        checked={data.male === "Man"}
        onChange={(e) => {
          changData(e);
        }}
      />
      남자
      <input
        type="radio"
        name="male"
        value={"Women"}
        checked={data.male === "Women"}
        onChange={(e) => {
          changData(e);
        }}
      />
      여자
      
      <br />
      
      <span>자기소개</span>
      <textarea
        name="introduce"
        value={data.introduce}
        //textarea도 마찬가지 초기값이 ''빈문장인데 
        rows="8"
        cols="30"
        onChange={(e) => {
          changData(e);
        }}
        //입력(이벤트 onchange)할 때 그 입력된 문장들이 e.target.value의 속성값에 반영되어 나타난다.
      ></textarea>
      <br />
      <div>
        <p>이름: {data.name}</p>
        <p>이메일: {data.email}</p>
        <p>비밀번호: {data.pw}</p>
        <p>학과: {data.major}</p>
        <p>성별: {data.male}</p>
        <p>자기소개: {data.introduce}</p>
      </div>
    </>
  );
};

export default Input_prac2;
