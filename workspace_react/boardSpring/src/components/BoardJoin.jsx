import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import styles from './BoardJoin.module.css';

const BoardJoin = () => {
  const nav = useNavigate();

  const [insertBoard, setInsetBoard] = useState({
    title: "",
    writer: "",
    content: "",
  });

  const changeData = (e) => {
    setInsetBoard({
      ...insertBoard,
      [e.target.name]: e.target.value,
    });
  };

  const validateInsertBoard = () => {
    let isValid = true;
    if (insertBoard.title === "") {
      alert("제목은 필수 입력입니다");
      isValid = false;
      return isValid;
    }

    if (insertBoard.writer === "") {
      alert("작성자는 필수 입력입니다");
      isValid = false;
      return isValid;
    }

    return isValid;
  };

  return (
    <>
      <div>
        <h2>게시글 작성 페이지</h2>
      </div>

      <div className={styles.insertDiv}>
        <table>
          <colgroup>
            <col width={"20%"} />
            <col width={"80%"} />
          </colgroup>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input
                  type="text"
                  name="title"
                  value={insertBoard.title}
                  onChange={(e) => {
                    changeData(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
              <td>
                <input
                  type="text"
                  name="writer"
                  value={insertBoard.writer}
                  onChange={(e) => {
                    changeData(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td>
                <textarea
                  name="content"
                  cols={100}
                  rows={10}
                  value={insertBoard.content}
                  onChange={(e) => {
                    changeData(e);
                  }}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <div className={styles.insertButton}>
        <button
          type="button"
          onClick={(e) => {
            if (!validateInsertBoard()) {
              return;
            }

            axios
              .post("/api/boards", insertBoard)
              .then((res) => {
                console.log(res.data);
                alert("등록되었습니다");
                nav("/");
              })
              .catch((error) => {
                console.log(error);
              });
          }}
        >
          글 등록
        </button>
      </div>
    </>
  );
};

export default BoardJoin;
