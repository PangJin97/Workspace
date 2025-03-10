import React from "react";

export const Map_1 = () => {
  const arr1 = [1,2,3,4,5];
  const name = 'kim'

  return (
    <>
      <h2>Map_1</h2>
      {
        arr1.map((num, i)=>{
          //num은 arr1의 하나하나의 데이터
          //반복이 돌때마다 인덱스가 0에서 1씩 증가
          return(
            <div key={i}>안녕하세요</div> 
          )
          //return 넣었으면 소괄호 열고 
          //반복적으로 div 태그가 그려질건데 구분하기 위해 반드시 속성을 부여해야함
          //key는 html에 없는 속성이지만 중복만 안되게 넣어지는 속성, 거기에 i를 넣는다(계속바뀌니까)

        })
      }
     
    </>
  );
};
export default Map_1
