import React from "react";

export const Map_forEach = () => {

  function aaa(){
    console.log(3);
  }

  //반복문 : for, for of, forEach(), map() => 자바스크립트에서의 반복문(자바스크립트 배열)

  const arr = [1,3,5];
  
  //forEach()
  //배열에서만 가능 
  //()안의 내용을 arr.length 만큼 반복한다
  
  //()안의 내용은 함수로.
  //자바스크립트에서의 반복문은 매개변수로 함수가 들어갈 수 있음.
  arr.forEach(aaa);
  
  //통상적으로 ()안에 함수를 만들어 버림
  //그 함수는 매개변수를 2개받는다
 
  arr.forEach((item, index)=> {
    console.log(` a=${item}, b = ${index} `)
   });

  //  for(let i = 0; i< arr.length; i++){
  //  }
  // 여기서의 i가 index

  // for(const e of arr){
  // }
  // 여기서의 e가 item

  // => 2개가 짬뽕 

  //배열에 있는 하나의 데이터 item
  //몇번째 돌고 있습니다, index 

  
  //()안에 있는 내용을 반복실행
  //()안에는 함수가 들어옴
  
  
  //map도 동일한데 다른점이 있다면 
  //forEach는 반복만하고 map은 반복한 값을 retrun해준다.
  
  const result = arr.map((e ,i)=>{
    console.log(`e = ${e}, i = ${i}` )
    return e*2;
    //반복하고 리턴하는 데이터 
  })
  console.log(result);
  //map()안의 화살표 함수의 {}안에다  실행되는 내용 입력 
  //매개변수로 2개의 데이터를 받음 
  //배열에 있는 하나의 데이터 e
  //몇번째 돌고 있습니다, i
  return (
    <>
      <h2>Map_forEach / 콘솔확인</h2>
    </>
  );
};
export default Map_forEach
