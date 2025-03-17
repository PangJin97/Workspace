import React, { useEffect, useState } from "react";
import styles from "./ToDoListEdit.module.css"

const ToDoListEdit = ({toDoList, doList, setToDoList, setIsEdit}) => {
  //프롭스 배열이나 객체를 받을 수 있다
  //리턴만 베열만 해주는거지
  //다만 구조분해 할당을 통해 바로 뽑아 쓰는 거 쁀


  const[editText, setEditText] = useState('')

  useEffect(()=>{
    setEditText(doList.text)
  },[doList])

  const edit = () => {
    const copyDoList=[...toDoList]
    const foundText = copyDoList.find((doIt) =>{return doIt.id === doList.id});
   foundText.text = editText
   setToDoList(copyDoList)
    setIsEdit(null); // 수정 모드 종료
  };

  return (
    <div className={styles.editContainer}>
      <input type="text" value={editText} onChange={(e)=>{
        setEditText(e.target.value)
      }}/>
      <button type="button" onClick={()=>{
        edit()
      }}>확인</button>
      <button type="button" onClick={(e)=>{
        setEditText(doList.text)
        setIsEdit(null)
      }}>취소</button>
    </div>
  );
};

export default ToDoListEdit;
