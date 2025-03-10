import React, { useState } from "react";

const Input_2 = () => {
  //이름을 입력하는 input 태그에 작성한 내용을 저장할 state 변수

  // const[name, setName] = useState('')
  // const[age, setAge] = useState('')
  // const[address, setAddress] = useState('')
  //=>이걸 하나의 객체로


  //모든 input 태그에 저장할 state변수
  const[data, setData] = useState({
    name : '',
    age : '',
    address : ''
  })

  //input 태그의 값이 변경되는 실행시킬 함수.
  
  function changData(e){
     //e를 밖으로 빼왔기 때문에 e를 매개변수로 받아 채운다. 

    setData({
      ...data,
      [e.target.name] : e.target.value

      //객체를 새객체에 복사할떄의 원리 
   
      // [e.target.name(이벤트가 발생한 태그의 name 속성의 값)]  =  e.target.value
     
      //태그의 속성인 name의 속성값을 가져온다는 뜻 
      //그 속성값이 유스스테이트의 초기값인 객체 안에 변수명들과 일치하게 한다. 
      //객체에서 초기화 했던 변수명이 age 이면 속성 name 값도 age로 
      //=> 그렇게 해야 리랜더링 되면서 객체에 있던 키가 중복되어 벨류가 덮어 씌어짐

    
      //키 값을 변수로서 활용하니까 '대괄호' 넣는다 
     
    })
  }
  return (

    <>
    <h2>Input</h2>
      이름 : <input name="name" type="text" value={data.name} onChange={(e)=>{
        changData(e)
        //  setData({
        //   ...data,
        //   name : e.target.value
        //  })
      }
      }/> <br />
      
      나이 : <input name="age" type="text" value={data.age} onChange={(e)=>{
        changData(e)
        //  setData({
        //   ...data,
        //   age : e.target.value
        //  })
        //input 태그의 값이 변경될때마다(input 태그에 입력할 때 마다)
        //input 태그에 작성한 데이터를 age 변수에 저장한다. 
      }}/> <br />
      
      주소 : <input name="address" type="text" value={data.address} onChange={(e)=>{
        changData(e)
         //  setData({
        //   ...data,
        //   address : e.target.value
        //  })
      }} /><br />

    <div>
      입력받은 이름 : {data.name}
    </div>

    <div>
      입력받은 나이 : {data.age}
    </div>

    <div>
      입력받은 주소 : {data.address}
    </div>


    </>
  );
};

export default Input_2;
