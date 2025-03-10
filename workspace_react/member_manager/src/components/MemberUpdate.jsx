import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const MemberUpdate = () => {
  const nav = useNavigate(); 
  const {memId}= useParams();
  console.log(memId)

  //수정할 회원의 모든 정보를 저장할 state변수
  const [memberInfo, setMemberInfo] = useState({})
  
  //기존 정보 받아오는 axios
  useEffect(()=>{
    axios.get(`/api/members/${memId}`).then((res)=>{
      setMemberInfo(res.data)
      console.log(res.data)
    }).catch((error)=>{
      console.log(error)
    })
  },[])


  const chagneData = (e) =>{
    setMemberInfo({
      ...memberInfo,
      [e.target.name] : e.target.value 
    })
  }
  
  console.log(memberInfo) // 입력할때마다 값이 변경된다 콘솔창 확인
 
  // 원래는 하나의 state 변수에서 데이터를 보내는건 위험함 일단 배우기 전이니 이렇게 
  return (
    <>
      <div>
        회원 수정 페이지
      </div>
      
      <div>
        <span>회원 이름 수정 : </span>
        <input type="text" name="memName" value={memberInfo.memName} onChange={(e)=>{
          chagneData(e)
        }}/>
      </div>

      <div>
        <span>회원 비밀번호 수정 : </span>
        <input type="text" name="memPw" value={memberInfo.memPw} onChange={(e)=>{
           chagneData(e) 
        }}/>
      </div>

      <div>
        <span>회원 전화번호 수정 : </span>
        <input type="text" name="memTel" value={memberInfo.memTel} onChange={(e)=>{
          chagneData(e)
        }}/>
      </div>

     <div>
        <span>회원 소개 수정</span>
        <input type="text" name="memIntro" value={memberInfo.memIntro} onChange={(e)=>[
          chagneData(e)
        ]}/>
     </div>
      
   <div>
        <button type="buttond" onClick={(e)=>{
          axios.put(`/api/members/${memId}`, memberInfo)
          .then((res)=>{
             console.log(res.data)
             console.log('통신성공')
             alert('회원정보가 수정되었습니다')
             nav(`/detail/${memId}`)
          })
         .catch((error)=>{
           console.log('통신오류')
           console.log(error)
         })
        }}>수정확인</button>
   </div>

   <div>
    <button type="button" onClick={(e)=>{
      nav('/')
    }}>목록으로 돌아가기</button>
   </div>
    </>
  );
};

export default MemberUpdate;
