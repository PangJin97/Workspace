import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_3 = () => {
  //useEffect는
  //컴포넌트의 특정 생애주기에 기능을 구현할때 쓰는거
  //서버에서 데이터 받을 때 오래 걸리기 때문에 -> 그림 다 그린 후 마지막에 실행

  //다만!

  //버튼을 누를때만 서버에서 데이터 받아온다면??

  //버튼이 있다는 건 이미 버튼이 그려져있기 때문에 서버에서 데이터 받아올때 useEffect를 쓸 필요가 없다. => useEffect는 그림을 다 그린 뒤에 실행되니까

  //'클릭'할때만 실행 되기때문에 생태주기에 따른 useEffect를 쓸 필요없다.

  //axios는 별개의 기능이다! 필요에 따라 useEffect를 씌우거나 함수에 넣거나
  //이벤트에 넣거나 결정! 

  ////////////////////////////////////////////////////////////////////////


  //const person = {}; => 일반 변수로 두면 안된다!
  // 서버에서 받아온 화면에 보여주려면 반드시 useState!

  const [person, setPerson] = useState({});
  //서버에서 넘어오는 데이터를 저장할 변수의 초기값은
  //'최종적으로 받는 데이터의 자료형과 일치시켜서 만들어줌'

  //서버에서 데이터를 받아 person에 저장하는 함수
  const getPersonData = () => {
    //서버에서 데이터 받기

    //get : 데이터를 받아올 서버의 주소(url)
    //http://locolhost:8080/t3
    axios
      .get("/api/t3")

      //서버와 통신 성공 시 실행할 내용 작성
      //res : 통신 성공한 모든 데이터를 객체 형태
      //우리가 서버에서 받은 데이터 : res.data
      .then((res) => {
        console.log("통신 성공");
        console.log(res.data);
        //받아온 데이터를 콘솔에 출력해보자! => 받아온 데이터가 객체네?
        //=>받아온 데이터를 화면에 반영해 주려면? : useStae!
        setPerson(res.data);
      })
      //서버와 통신 실패 시 실행할 내용 작성
      // error : 통신 실패에 대한 모든 데이터를 객체 형태
      .catch((error) => {
        console.log("통신실패");
        console.log(error);
      });
  };

  return (
    <>
      <h2>Axios_3</h2>
      <input type="button" value={"버튼"} onClick={(e) => {
        getPersonData();
      }} />
      <div>
        <p>이름: {person.name}</p>
        <p>나이: {person.age}</p>
        <p>주소: {person.addr}</p>
      </div>
    </>
  );
};

export default Axios_3;
