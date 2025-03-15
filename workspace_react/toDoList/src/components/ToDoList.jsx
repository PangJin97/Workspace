import React, { useState } from "react";
import styles from "./ToDoList.module.css";
import { icon } from "../constants/icons";
import { data } from "../data/todoList";
import ToDoListEdit from "./ToDoListEdit";

const ToDoList = () => {
  //할일을 저장한 변수
  const [toDoList, setToDoList] = useState(data);

  //새로운 일을 추가할 변수
  const [newDoIt, setNewDoIt] = useState("");

  //조건부 랜더링
  const [isEdit, setIsEdit] = useState(null);

  //가장 큰 아이디 찾는 함수(Math.max의 활용)
  const maxId = Math.max(
    ...toDoList.map((e, i) => {
      return e.id;
    })
  );

  //새로운 데이터를 가지는 객체 변수
  const newData = {
    id: maxId + 1,
    text: newDoIt,
  };

  //등록 유효성 검사 후 완료하는 함수
  const add = () => {
    if (newData.text === "") {
      alert("빈문자는 입력 불가합니다");
      return;
    } else {
      setToDoList([...toDoList, newData]);
      //배열에 새로운 데이터를 넣을땐 구조 분해 할당하고
      // 새로운 데이터를 추가(,)하고 다시 감싸기
      setNewDoIt("");
      alert(`${newData.text} 등록완료`);
    }
  };

  //filter함수를 이용한 삭제 기능
  const remove = (id) => {
    //confirm : 확인 -> 리턴 true
    //confirm : 취소 -> 리턴 false

    //취소를 누르면 false를 리턴하고 부정연산자에 의해
    //if조건문이 참이 되어 함수내용을 실행하여 삭제 함수 전체를 취소

    //확인을 누르면 true를 리턴하고 부정연산자에의해
    //if조건문이 거짓이 되어 함수 안의 내용을 실행하지 않고
    //다음 내용 진행
    if (!confirm("삭제합니까?")) {
      return;
    }
    setToDoList(
      toDoList.filter((e) => {
        return e.id !== id;
      })
    );
  };

  return (
    <div className={styles.container}>
      <div className={styles.title}>
        <h1>To Do List</h1>
      </div>

      <div className={styles.add}>
        <input
          placeholder="+Add a Task"
          type="text"
          value={newDoIt}
          onChange={(e) => setNewDoIt(e.target.value)}
        />
        <button type="button" onClick={(e) => add()}>
          등 록
        </button>
      </div>

      <div className={styles.jobsContainer}>
        {toDoList.map((doList, i) => {
          return (
            <div key={i}>
              {isEdit === doList.id ? (
                <ToDoListEdit toDoList={toDoList} setToDoList={setToDoList} doList={doList} setIsEdit={setIsEdit}/>
              ) : (
                <>
                  <span className={styles.toDo}>{doList.text}</span>
                  <img
                    src={icon.ICON_EDIT}
                    onClick={(e) => setIsEdit(doList.id)}
                  />
                  <img
                    src={icon.ICON_DELETE}
                    onClick={(e) => remove(doList.id)}
                  />
                </>
              )}
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default ToDoList;
