
import { Link, Links, Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import Axios from './Component/Axios'
import Header from './Component/Header'
import Login from './Component/Login'
import BoardList from './Component/BoardList'
import BoardDetail from './Component/BoardDetail'

function App() {
  // useNavigate(); => 페이지 이동 기능을 제공하는 함수 리턴 
  const nav = useNavigate();

  return (
    <>
      {/* <Axios /> */}

      <Header />

      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='' element={<BoardList />} />

        {/* 게시글 상세 페이지 */}
        <Route path='/detail/:num/:age' element={<BoardDetail />} />


        {/* 게시글 등록 페이지 */}
        {/* 게시글 수정 페이지 */}
        
        
        {/* 로그인 페이지 */}
        <Route path='/login' element={<Login />} />
          
          
        {/* 마이페이지 */}
        <Route path='/my-page' element={<div>마이페이지 입니다</div>} />
        
      </Routes>


        {/* 버튼 클릭시 페이지 이동 */}
        <button type="button" onClick={(e)=>{
          nav('/my-page');
        }}>마이페이지로 이동</button>

    </>
  )
}

export default App
