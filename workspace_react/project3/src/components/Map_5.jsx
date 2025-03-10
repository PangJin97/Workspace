import React from "react";
import "./Map_5.css";

const Map_5 = () => {
  const boardList = [
    {
      boardNum: 1,
      title: "첫번째 글",
      writer: "김자바",
      createDate: "2025-01-13",
      readCnt: 5,
    },
    {
      boardNum: 2,
      title: "두번째 글",
      writer: "김자바",
      createDate: "2025-01-17",
      readCnt: 3,
    },
    {
      boardNum: 3,
      title: "세번째 글",
      writer: "이자바",
      createDate: "2025-01-10",
      readCnt: 0,
    },
    {
      boardNum: 4,
      title: "네번째 글",
      writer: "이자바",
      createDate: "2025-01-19",
      readCnt: 10,
    },
    {
      boardNum: 5,
      title: "다섯번째 글",
      writer: "이자바",
      createDate: "2025-01-01",
      readCnt: 1,
    },
  ];

  return (
    <>
      <h2>Map_5</h2>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>글번호</td>
            <td>글 제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
          </tr>
        </thead>
        <tbody>
          {boardList.map((board, index) => {
            return (
              <tr key={index}>
                {/* 행을 반복하면서 매개변수를 통해 받은 boardList의 데이터들을 
                아래 처럼 쓰면서 리턴할게요 */}
                <td>{boardList.length - index}</td>
                {/* No는 데이터가 없다! 반복을 통해 직접 만들어 주었는데 이거 꼭 기억하자 */}
                <td>{board.boardNum}</td>
                <td>{board.title}</td>
                <td>{board.writer}</td>
                <td>{board.createDate}</td>
                <td>{board.readCnt}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default Map_5;
