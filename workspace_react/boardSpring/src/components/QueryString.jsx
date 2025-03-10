import axios from "axios";
import React from "react";
import { data, useSearchParams } from "react-router-dom";

const QueryString = () => {
  //쿼리 스트링으로 넘어오는 데이터 받기
 const[params, setParams] = useSearchParams();
 //배열의 첫번째 인자 : 쿼리 스트링으로 넘어오는 데이터(객체형식)
 
 //배열의 두번째 인자 : 전달받은 데이터를 변경하는 함수. => 전달받은 데이터를 바꾸는 일이 없어서 형식으로 달려있는거임


 //params는 받은 데이터
 console.log(params);

 const data1 = params.get('age');
 console.log(data1)
 //params로 받은 데이터 중 num을 겟하겠다 

 const data2 = params.get('name')
 console.log(data2)
  //params로 받은 데이터 중 name을 겟하겠다 

  const sendData = () =>{
    axios.get(`/api/replies/test?age=${data1}&name=${data2}`)
        .then()
        .catch()
  }



  return (
    <>
      <div>QueryString 연습</div>
      <button type="button" onClick={(e)=>[
        sendData(e)
      ]}>데이터 전송</button>
    </>
  );
};

export default QueryString;


//데이터 송수신 방법 
// get , delete : pathvariable / 쿼리스트링(@Request Parm) => 데이터 한 두개 받을때 

// => 데이터 여러개 송수신 받을 때 DTO클래스로 받을 수 있다. 


// => PUT, POST : RequestBody 

