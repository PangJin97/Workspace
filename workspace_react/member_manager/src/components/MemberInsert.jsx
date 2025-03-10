import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const PutMemberList = ({ nav }) => {
  const [insertMem, setInsertMem] = useState({
    memId: "",
    memName: "",
    memPw: "",
    memTel: "",
    memIntro: "",
    pwConfrim : ''
  });

  const chageDate = (e) => {
    setInsertMem({
      ...insertMem,
      [e.target.name]: e.target.value,
    });
  };


  const validateInsertMem = () =>{
     //데이터 유효성 검사(validation 처리)
     let isValid = true;
     if (insertMem.memId === "") {
      alert("ID는 필수 입력입니다!");
      isValid = false;
      return isValid;
    }

    if (insertMem.memName === "") {
      alert("이름은 필수입력입니다!");
      isValid = false;
      return isValid;
    }
    if (insertMem.memPw !== insertMem.pwConfrim) {
      alert("입력한 비번을 확인하세요");
      isValid = false;
      return isValid;
    }
    
    return isValid;
  }

  return (
    <>
      <div>
        <div>
          <span>회원 ID : </span>
          <input
            type="text"
            name="memId"
            value={insertMem.memId}
            onChange={(e) => {
              chageDate(e);
            }}
          />
        </div>
        <div>
          <span>회원 이름 : </span>
          <input
            type="text"
            name="memName"
            value={insertMem.memName}
            onChange={(e) => {
              chageDate(e);
            }}
          />
        </div>
        <div>
          <span> 회원 비밀번호 : </span>
          <input
            type="password"
            name="memPw"
            value={insertMem.memPw}
            onChange={(e) => {
              chageDate(e);
            }}
          />
        </div>

        <div>
          <span>비밀번호 확인 : </span>
          <input type="password" name="pwConfrim" value={insertMem.pwConfrim} onChange={(e)=>{
            chageDate(e)
          }}/>
        </div>

        <div>
          <span>회원 연락처 : </span>
          <input
            type="text"
            name="memTel"
            value={insertMem.memTel}
            onChange={(e) => {
              chageDate(e);
            }}
          />
        </div>
        <div>
          <span>회원 소개 : </span>
          <input
            type="text"
            name="memIntro"
            value={insertMem.memIntro}
            onChange={(e) => {
              chageDate(e);
            }}
          />
        </div>
      </div>
      <div>
        <button
          type="button"
          onClick={(e) => {

            if(!validateInsertMem()){
              return;
            }
            
            axios
              .post("/api/members", insertMem)
              .then((res) => {
                console.log("통신완료");
                console.log(res.data);
                nav("/");
                alert(`${insertMem.memId}님 가입을 축하합니다`);
              })
              .catch((error) => {
                console.log("통신에러");
                console.log(error);
              });
          }}
        >
          가입완료
        </button>

        <button
          type="button"
          onClick={(e) => {
            nav("");
          }}
        >
          목록으로 돌아가기
        </button>
      </div>
    </>
  );
};

export default PutMemberList;
