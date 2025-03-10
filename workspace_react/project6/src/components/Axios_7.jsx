import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_7 = () => {
  const phone = {
    brand: "samsung",
    price: 1000,
    color: "red",
  };

  axios.post('/api/t7', phone).then().catch()

  ////////////////////////////////////////////
   //실습문제 1 
  //아래 코드의 결과 전달되는 데이터를 자바에서 받은 후
  //전달된 국, 영, 수 점수의 총점을 다시 리액트로 가져와서
  //react 화면에 총점을 보여주세요

  const student = {
    name: "kim",
    korScore: 80,
    engScore: 70,
    mathScore: 90,
  };

  const [score, setScore] = useState('0');

  useEffect(()=>{
    axios
    .post("/api/t8", student)
    .then((res) => {
      setScore(res.data);
      console.log(res.data)
    })
    .catch((error) => {
      console.log("통신불량");
    });
  },[])

  //값보내기 post에서도 then에서 리턴 값을 받을 수 있다. 

  //무한반복 도는걸 막기위해 useEffect를 씌었다. 
  //앵간하면 무한반복 되니까 이벤트핸들링이 아닌이상 
  //useEffect 안에 넣는게 맞음(그래서 주로 같이 많이 쓴다 함)

  //다만 같이 많이 쓴다는 거지 짝지가 아니라 별개의 기능이라걸 인지 


  return (
    <>
      <h2>Axios_7, 리엑트에서 새로고침하면 자바콘솔에 전송된 
        데이터 나옴
      </h2>
     
      <h2>데이터 전달하기 실습1</h2>
      <div>총점 : {score}</div>
    </>
  );
};

export default Axios_7;
