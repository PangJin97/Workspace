import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import styles from "./BoardList.module.css";
import dayjs from "dayjs";

const BoardList = () => {
  const nav = useNavigate();
 

  // 쿼리 스트링 실습--------------------------
  const [query, setQuery] = useState({
    age: "",
    name: "",
  });

  const changeData = (e) => {
    setQuery({
      ...query,
      [e.target.name]: e.target.value,
    });
  };
  //----------------------------------------------


  const [boards, setBoard] = useState([]);

  useEffect(() => {
    axios
      .get("/api/boards")
      .then((res) => {
        setBoard(res.data);
        console.log("통신성공");
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);




  //검색창에 입력한 데이터를 저장할 변수
  const [searchData, setSearchData] = useState({
    searchKeyword: "TITLE",
    searchValue: "",
  });

  //검색창 내용 변경 시 실행되는 함수
  const changeSearchData = (e) => {
    setSearchData({
      ...searchData,
      [e.target.name]: e.target.value,
    });
  };

  console.log(searchData);

  //검색버튼 클릭 시 실행함수

  const searchList = () => {
    axios
      .get(
        `/api/boards?searchKeyword=${searchData.searchKeyword}&searchValue=${searchData.searchValue}`
      )
      .then(res => setBoard(res.data) )
      .catch(error => console.log(error));
  };

  return (
    <>
      <div className="container">
        <div className="title">
          <h2>자유게시판</h2>
        </div>

        {/* 검색 영역 */}
        <div className={styles.searchDiv}>
          <select
            value={searchData.searchKeyword}
            name="searchKeyword"
            onChange={(e) => {
              changeSearchData(e);
            }}
          >
            <option value="TITLE">제목</option>
            <option value="WRITER">작성자</option>
            {/* value값을 자바로 가져가야한다. */}
          </select>
          <input
            type="text"
            name="searchValue"
            value={searchData.searchValue}
            onChange={(e) => {
              changeSearchData(e);
            }}
          />
          <button
            type="button"
            onClick={(e) => {
              searchList();
            }}
          >
            검색
          </button>
        </div>
        
        {/* 게시글 목록 영역 */}
        <div className={styles.tableDiv}>
          <table>
            <colgroup>
              <col width={"10%"} />
              <col width={"30%"} />
              <col width={"15%"} />
              <col width={"30%"} />
              <col width={"15%"} />
            </colgroup>
            <thead>
              <tr>
                <td>NO</td>
                <td>제목</td>
                <td>작성자</td>
                <td>작성일</td>
                <td>조회수</td>
              </tr>
            </thead>
            <tbody>
              {boards.map((board, i) => {
                return (
                  <tr key={i}>
                    <td>{boards.length - i}</td>
                    <td>
                      <span
                        onClick={(e) => {
                          nav(`/detail/${board.boardNum}`);
                        }}
                      >
                        {board.title}
                      </span>
                    </td>
                    <td>{board.writer}</td>
                    <td>{dayjs(board.regDate).format("YYYY년 MM월 DD일")}</td>
                    <td>{board.readCnt}</td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>

        <div className={styles.buttonDiv}>
          <button
            type="button"
            onClick={(e) => {
              nav("/join");
            }}
          >
            글쓰기
          </button>
        </div>


        {/* 쿼리스트링 연습 */}

        {/* 아래 나이, 이름, 입력값을 Query String 방식으로 
          버튼 클릭 시 /test url로 전달하세요 
        */}
        <div>Query String 실습</div>

        <div>
          나이 :{" "}
          <input
            type="text"
            name="age"
            value={query.age}
            onChange={(e) => {
              changeData(e);
            }}
          />
        </div>
        <div>
          이름 :{" "}
          <input
            type="text"
            name="name"
            value={query.name}
            onChange={(e) => {
              changeData(e);
            }}
          />
        </div>
        <button
          type="button"
          onClick={(e) => {
            nav(`/test?age=${query.age}&name=${query.name}`);
          }}
        >
          Query String 실행
        </button>
      </div>
    </>
  );
};

export default BoardList;
