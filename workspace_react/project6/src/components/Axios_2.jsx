import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios_2 = () => {
  //서버에서 받은 데이터를 저장할 state변수
  const[person,setPerson]=useState({
    // name : '',
    // age : 0 ,
    // addr: ' '
    //빈객체로 초기화(껍데기만)
  });
  //객체로 전달 받을때는 빈 객체 
  //배열로 데이터 전달 받을때 유스스테이트 초기값 빈배열
  
  useEffect(()=>{
   //http://localhost:8080/t3 
    axios.get('/api/t3').
          then((res)=>{
            //console.log(res.data)
           
            //  setPerson({
            //    ...res.data
            //  })
            //스프레드 연산자 쓸필요 없이 그냥 넣어도 된다.
            //초기값이 빈껍데기니까 바로 넣어도 된다.
            
            //어차피 res.data 자체가 객체이기 때문에. 
            setPerson(res.data)
          }).
         
          catch((error)=>{
            console.log('통신 중 오류발생');
            console.log(res.data);
          });
  },[])

  return (
   <>
      <h3>데이터 받기</h3>
      <p>받은 데이터: {`${person.name}, ${person.age}, ${person.addr}`}</p>
      {/* 객체는 통으로 출력하면 안됨  */}
      {/* 처음에는 undefied로 나오지만 useEffect를 거치면 값이 나옴 */}
      {/* 처음에는 데이터 받지 않은 상태로 그림을 그리고 서버에서 데이터를 받으면 그림을 다시 그림 =>그림을 총2번 그림. => 흐름을 잘 파악해야 한다.*/}
   </>
  )
}

export default Axios_2