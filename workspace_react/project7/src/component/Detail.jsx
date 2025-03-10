import React, { useState } from "react";

const Detail = ({board}) => {
  //게시글 하나의 정보를 담을 state 변수 => 바뀐것이 화면에 반영되려면 스테이트 변수로 
  
  return (
    <>
    <div>
      <table className="detail-table">
        <colgroup>
          <col width={'20%'}/>
          <col width={'30%'}/>
          <col width={'20%'}/>
          <col width={'20%'}/>
        </colgroup>
        <tbody>
          <tr>
            <td>글번호</td>
            <td>{board.boardNum}</td>
            <td>작성자</td>
            <td>{board.writer}</td>
          </tr>
          <tr>
            <td>글제목</td>
            <td>{board.title}</td>
            <td>조회수</td>
            <td>{board.redCnt}</td>
          </tr>
          <tr>
            <td>글내용</td>
            <td colSpan={3}>{board.content}</td>
          </tr>
        </tbody>
      </table>
    </div>
    </>
  );
};

export default Detail;
