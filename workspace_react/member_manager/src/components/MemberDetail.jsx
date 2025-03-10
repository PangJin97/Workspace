import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const MemberDetail = () => {
  const nav = useNavigate();

  //url Parmeter로 보낸 데이터 받기: useParams => 객체타입으로 받는다  
  const { memId } = useParams();
  // - 구조분해 할당 
  console.log(memId)
  
  //const params = useParams(); 
  // params.memId -> 이렇게 일일히 쓰긴 힘드니까 객체 분해 할당방식으로 

  //상세 정보를 저장할 state 변수 
  const [member, setMember] = useState({})

  //상세정보 데이터 가져오기 
  useEffect(() => {
    axios
      .get(`/api/members/${memId}`)
      // '/api/members/java' 
      // '/api/members/kim'
      // =>url파라미터로 받아오기 : useParams
      .then((res) => {
        setMember(res.data);
        console.log(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);



  //회원 삭제 함수 
  const deleteMember = () => {
    //confirm : 확인 -> 리턴 true 
    //confirm : 취소 -> 리턴 false
    
    //취소 누르면 하지마세요~ 
    if(!confirm('정말 삭제할까요??')){
      return;
    }
    
    axios.delete(`/api/members/${member.memId}`)
    .then((res)=>{
      console.log(res.data)
      console.log('통신성공')
      alert('회원이 삭제 되었습니다!')
      nav('/')
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  return (
    <>
  <div>
      <table>
        <thead>
          <tr>
            <td>회원 아이디</td>
            <td>회원 이름</td>
            <td>회원 비밀번호</td>
            <td>회원 전화번호</td>
            <td>회원 상세내용</td>
            <td>회원 가입일</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>{member.memId}</td>
            <td>{member.memName}</td>
            <td>{member.memPw}</td>
            <td>{member.memTel}</td>
            <td>{member.memIntro}</td>
            <td>{member.joinDate}</td>
          </tr>
        </tbody>
      </table>
  </div>

  <button type="button" onClick={(e)=>{nav('/')}}>목록으로 가기</button>
  
  <button type="button" onClick={(e)=>{nav(`/update/${member.memId}`)}}>회원 수정</button>
  
  <button type="button" onClick={(e)=>{
    deleteMember();
  }}>회원 삭제</button>


    </>
  );
};

export default MemberDetail;
