import { Route, Routes, useNavigate } from "react-router-dom";
import "./App.css";
import MemberList from "./components/MemberList";
import PutMemberList from "./components/MemberInsert";
import MemberDetail from "./components/MemberDetail";
import { useState } from "react";
import MemberUpdate from "./components/MemberUpdate";

function App() {
  const nav = useNavigate();

  return (
    <>
      <div>
        <h1>회원 관리 프로그램</h1>

        <Routes>
          {/* 회원 목록 페이지 */}
          <Route path="" element={<MemberList />} />
          <Route path="/join" element={<PutMemberList nav={nav} />} />
          <Route path="/detail/:memId" element={<MemberDetail />} />
          <Route path="/update/:memId" element={<MemberUpdate />} />
        </Routes>
      </div>
    </>
  );
}

export default App;
