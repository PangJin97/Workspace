import axios from "axios";
import React from "react";

const Axios_6 = () => {
  //axsio의 post() 함수의 두번째 매개변수로 자바로 전달할 데이터를 작성할 수 있다
  //자바로 전달할 데이터를 작성할 수 있다.
  //자바로 전달할 데이터는 객체만 가능 

  const student = {
    name : 'kim',
    age : 20,
  }

  axios.post('/api/t6',student)
      .then()
      .catch();
  return (
    <>
      <h2>Axios를 사용하여 데이터 전달하기</h2>
    </>
  )
};

export default Axios_6;
