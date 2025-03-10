import React from "react";
import { useState } from "react";
import './Test4.css'

export const Test4 = () => {

  // const[num1,setNum1] = useState(0);
  // const[num2,setNum2] = useState(0);
  // const[num3,setNum3] = useState(0);

  const [numArr, setArr] = useState([0, 0, 0]);
  //배열로 유스테이트 쓰려면 주의해야할 점. 
  
  //const numArr = [num1,num2,num3];
  //새 배열을 만들고 스프레드를 쓰고 거기에 복사를 한다.

  function changeDate(index){
    const copyArr = [...numArr];
    copyArr[index] = copyArr[index] + 1;
    setArr(copyArr)
     
        // ...numArr // 0, 0, 0
        // [...numArr] // [0, 0, 0] 
        // => 흩뿌린다음에 다시 배열로 감싸면
        //데이터가 복사가됨 
       
        //스프레드 연산자 => 배열 값을 복사하려고 씀
      

        // const copyArr = numArr;
        // copyArr[0] = copyArr[0] + 1;
        // setArr(copyArr);
        // 값이 바뀌는 건 맞는데 실제 '주소값'은 바뀌지 않아서 데이터에 변화가 없다. 
  }

  return (
    <>
      <div>Test4</div>
      <span onClick={()=>{
         changeDate(0);
      }}>{numArr[0]}</span>
      
      <span onClick={() => {
        changeDate(1);
      }}>{numArr[1]}</span>
      
      <span onClick={() => {
        changeDate(2);
      }}>{numArr[2]}</span>
    </>
  );
};
export default Test4;
