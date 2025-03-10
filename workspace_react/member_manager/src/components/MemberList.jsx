import axios from "axios";
import React, { useEffect, useState } from "react";
import "./MemberList.css";
import { useNavigate } from "react-router-dom";

const MemberList = () => {
  const [memberList, setMemberList] = useState([]);
  const nav = useNavigate();

  useEffect(() => {
    axios
      .get("/api/members")
      .then((res) => {
        setMemberList(res.data);
        console.log(res.data);
      })
      .catch((error) => {
        console.log(error);
        console.log("통신성공");
      });
  }, []);

  return (
    <>
      <table className="table">
        <colgroup>
          <col width={"10%"} />
          <col width={"20%"} />
          <col width={"20%"} />
          <col width={"20%"} />
          <col width={"30%"} />
        </colgroup>
        <thead>
          <tr>
            <td>행번호</td>
            <td>회원아이디</td>
            <td>회원이름</td>
            <td>회원연락처</td>
            <td>가입일</td>
          </tr>
        </thead>
        <tbody>
          {memberList.map((mem, i) => {
            return (
              <tr key={i}>
                <td>{i + 1}</td>
                <td>
                  <span
                    onClick={(e) => {
                      nav(`/detail/${mem.memId}`);
                      //내가 클릭한 회원의 아이디 mem.memId를 url파라미터로 보내줌 
                    }}
                  >
                    {mem.memId}
                  </span>
                </td>
                <td>{mem.memName}</td>
                <td>{mem.memTel}</td>
                <td>{mem.joinDate}</td>
              </tr>
            );
          })}
        </tbody>
      </table>

      <button
        type="button"
        onClick={(e) => {
          nav("/join");
        }}
      >
        회원가입
      </button>

      
    </>
  );
};

export default MemberList;
