import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const BoardUpdate = () => {
  const nav = useNavigate();

  //수정할 글 번호
  const { boardNum } = useParams();
  console.log(boardNum);

  //상세정보를 저장할 state변수
  const [boardDetail, setBoardDetail] = useState({});

  //수정할 게시글의 상세 데이터를 조회
  useEffect(() => {
    axios
      .get(`/api/boards/${boardNum}`)
      .then((res) => {
        console.log(res.data);
        setBoardDetail(res.data);
      })
      .catch(error => 
        console.log(error)
      );
  }, [boardNum]);
  // 화살표 함수의 매개변수가 하나면 ()생략, 
  // 마찬가지로 내용 부 {} 안이 하나면 {} 생략

  const changeData = (e) => {
    setBoardDetail({
      ...boardDetail,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <>
      <div>
        <h2>게시글 수정 페이지</h2>
      </div>

      <div>
        <table>
         <tbody>
            <tr>
              <td>작성일</td>
              <td>{dayjs(boardDetail.regDate).format('YY년 MM월 DD일 HH시 mm분 ss초')}</td>
              <td>작성자</td>
              <td>{boardDetail.writer}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={3}>
                <input
                  type="text"
                  name="title"
                  value={boardDetail.title}
                  onChange={e => 
                    changeData(e)
                  }
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea
                  name="content"
                  value={boardDetail.content}
                  onChange={e => 
                    changeData(e)
                  }
                  cols={50}
                  rows={10}
                ></textarea>
              </td>
            </tr>
         </tbody>
        </table>
      </div>

      <button
        type="button"
        onClick={e => 
          nav(`/detail/${boardNum}`)
        }
      >
        뒤로가기
      </button>

      <button
        type="button"
        onClick={(e) => {
          axios
            .put(`/api/boards/${boardNum}`, boardDetail)
            .then((res) => {
              console.log(res);
              alert("수정완료 되었습니다");
              nav(`/detail/${boardNum}`)
            })
            .catch(error => 
              console.log(error)
            );
        }}
      >
        수정하기
      </button>
    </>
  );
};

export default BoardUpdate;
