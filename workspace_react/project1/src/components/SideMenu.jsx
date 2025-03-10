//rafce
//React Arrow Function Component Export

import React from "react";

const SideMenu = () => {
  function click(){
    console.log(3);
  }
  // 여러군데에 같은 기능을 쓸거 같으면 함수 만들기.


  return (
    <>
      <div>SideMenu</div>
      <button type="button" onClick={click}>사이드버튼1</button>
      {/* 주의! click()는 안됨! 그냥 함수명만 넣기 */}
      <button type="button" onClick={click}>사이드버튼1</button>
    </>
  );
};

export default SideMenu;
