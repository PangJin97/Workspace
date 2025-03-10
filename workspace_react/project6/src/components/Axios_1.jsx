import axios from "axios";
import React from "react";
import { useEffect } from "react";
import { useState } from "react";

const Axios_1 = () => {
  //서버에서 받은 데이터를 저장할 state 변수
  
  //서버에서 받는 데이터가 숫자면 초기값을 0
  //서버에서 받는 데이터가 문자면 ''
  //배열이면 [] 껍데기만
  //객체면 {} 껍데기만
  //리스트면 []껍데기만

  //서버에서 넘어오는 데이터를 저장할 변수의 초기값은
  //'최종적으로 받는 데이터의 자료형과 일치시켜서 만들어줌'
  
  const [num, setNum] = useState(0);

  //마운트 될때만 서버에서 데이터를 받기 위해 useEffect 사용.
  //
  useEffect(() => {
  //서버에서 데이터 받기
  //서버에서 데이터 받는 건 오래 걸리기 때문에 useEffect를 주로 쓴다.
  //useEffect는 먼저 그림을 그리고 맨 나중에 실행

  //get 안에는 데이터를 요청한 url을 작성 
  // '/api/t2' === http://localhost:8080/t2
  axios.get('/api/t2').
     
      //통신 성공 후 실행 내용 작성 
      //res는 통신 성공에 대한 모든 정보가 담겨 있는 객체
        then((res)=>{
          setNum(res.data)
          // 자바에서 실제로 받아온 데이터 === res.data
          //통신 성공 시 num변수에 서버에서 받아온 데이터를 저장 
        }).
     
      //통신 실패 시 실행내용 작성 
      //예를들어 => http://localhost:8080/t2 가 오타가 났다거나 서버가 꺼져 있거나 
      //error는 통신 실패에 대한 모든 정보가 담겨있는 객체
        catch((error)=>{});
  },[]);


  return (
    <>
      <h3>데이터 받기</h3>
      <p>받은 데이터: {num}</p>
    </>
  );
};

export default Axios_1;
