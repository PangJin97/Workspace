import React from 'react'
import { Link } from 'react-router-dom';

const Menu = () => {
  

  return (
    <div style={{display:'flex', gap : '30px', marginBottom : '30px'}}>
      <div><Link to={''}>메인화면</Link></div>
      <div><Link to={'/anyone'}>아무나화면</Link></div>
      <div><Link to={'/user'}>인증된회원만</Link></div>
      <div><Link to={'/admin'}>관리자만</Link></div>
    </div>
  )
}

export default Menu