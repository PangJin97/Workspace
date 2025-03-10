import React from "react";

//const Header = ({name, age}) => {console.log
// console.log(name)
// console.log(age)
//} 
// 객체이기 때문에 구조분해 할당 가능

  const Header = (props) => {
    console.log(props) // 'name = react'를 props로 전달받음 => props는 객체타입 즉 객체로
    
    console.log(props.name)
    console.log(props.age)
  

  return (
    <>
      <div>Header</div>
    </>
  );
};

export default Header;
