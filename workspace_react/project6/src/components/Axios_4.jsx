import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_4 = () => {
  //서버에서 넘어오는 데이터를 저장하기 위한 state 변수 생성

  const[personList, setPersonList] = useState([])
  //유스스테이트 : 받아온 데이터로 setPersonList를 통해 변경하고 그 변경한 값을 리랜더링을 통해 personList에 넣는다.

  useEffect(()=>{
    axios.get('/api/t4')
    .then((res)=>{
      console.log(res.data)
      //받아온 데이터가 배열이다. 유스스테이트의 초기값도 빈배열로 
      setPersonList(res.data)
      //빈 배열에 res.data 넣어서 리랜던링을 통해personList에 저장하기 
    })
    .catch((error)=>{
      console.log('통신오류')
    })
    // axios는 별개의 기능이다. 필요에 따라 useEffect에 감싸거나 이벤트에 넣거나 함수안에 넣는것 

    //먼저 데이터를 받아오고 useEffect에 넣을지 이벤트 함수에 넣을지
    //함수로 감쌀지 정하기

    //받아온 데이터를 화면에 반영하기 위해서는 useState 
    //setPersonList에 의해 값이 변경되면 리랜더링 되면서 personList에 저장됨 => 해석과 흐름이 중요하다

    },[])
    //.마운트 될때 값이 회면에 보여야 하니까 useEffect 의존성 배열 빈배열 


  return (
    <>
      <h2>Axios_4 데이터 받아오기 연습</h2>
      <table border={1}>
        <thead>
          <tr>
            <td>이름</td>
            <td>나이</td>
            <td>주소</td>
          </tr>
        </thead>
        <tbody>
          {
            personList.map((person, i)=>{
              return(
              <tr key={i}>
                <td>{person.name}</td>
                <td>{person.age}</td>
                <td>{person.addr}</td>
              </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  );
};

export default Axios_4;

// private String name;
// private int age;
// private string add; 자바(스프링) 객체를 

//자바 스트립트는 키로받는다! 
//  { 
//     name;
//     age;
//     addr;
//  }

//스프링 자바에서 객체생성해서 그 객체에 값을 넣어주고(생성자 초기화) 리턴해준다 

//리턴해준 데이터를 react에서 받는다 