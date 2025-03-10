import React from "react";
import './Header.css'
import { Link, useNavigate } from "react-router-dom";

const Header = () => {
   const nav = useNavigate(); 
  
  return (
    <>
      <div className="header">
        <Link to={''}>게시판 </Link>
        <div>
          <Link to={'/login'}>LOGIN</Link>
          {/* join글자 클릭시 로그인 페이지로 이동 */}
          <span onClick={(e)=>{
            nav('/login');
          }}>JOIN</span>
        </div>
      </div>
    </>
  );
};

export default Header;
