
import { Route, Routes } from 'react-router-dom'
import './App.css'
import BoardList from './components/BoardList'
import BoardDetail from './components/BoardDetail'
import BoardJoin from './components/BoardJoin'
import BoardUpdate from './components/BoardUpdate'
import QueryString from './components/QueryString'

function App() {

  return (
    <div className='container'>
      <h2>게시판 프로젝트</h2>
     <Routes>
      <Route path="" element={<BoardList />}/>
      <Route path="/join" element={<BoardJoin />}/>
      <Route path='/detail/:boardNum' element={<BoardDetail />}/>
      <Route path='/update/:boardNum' element={<BoardUpdate />}/>
      
      {/* 쿼리스트링 연습 페이지 */}
      <Route path='/test' element={<QueryString />}/>
     </Routes>

     
   
    </div>
  )
}

export default App
