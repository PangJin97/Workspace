import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styles from "./BoardDetail.module.css";

const BoardDetail = () => {
  const nav = useNavigate();

  const [cnt, setCnt] = useState(0);
  //즉각 화면 반영
  //useEffect에 [cnt] : 마운트 될때와 cnt값이 변경될때도 실행 

  const { boardNum } = useParams();

  console.log(boardNum);


  //상세 정보 삭제 함수 
  const chagneDelet = () => {
    if (!confirm("정말 삭제할까요?")) {
      return;
      //취소를 누르면 함수 끝
    }
    //확인을 누르면 함수 계속
    axios
      .delete(`/api/boards/${boardNum}`)
      .then((res) => {
        console.log(res.data);
        alert("회원이 삭제되었습니다");
        nav("/");
      })
      .catch((error) => {
        console.log(error);
      });
  };

  
  //상세 정보를 가져오기 위한 변수
  const [boardDetail, setBoardDetail] = useState({});

  
  // insert한 댓글 가져오기 위한 변수
  const [getReplies, setGetReplies] = useState([]);

  // useEffect(() => {
  //   //상세 정보 조회
  //   axios
  //     .get(`/api/boards/${boardNum}`)
  //     .then((res) => {
  //       setBoardDetail(res.data);
  //       console.log(res.data);
  //     })
  //     .catch((error) => {
  //       console.log(error);
  //     });

  //   // 댓글 조회하기
  //   axios
  //     .get(`/api/replies/${boardNum}`)
  //     .then((res) => {
  //       setGetReplies(res.data);
  //       console.log(res.data);
  //     })
  //     .catch((error) => {
  //       console.log(error);
  //     });
  // }, [boardNum, cnt]);

  //의존성 배열에 boardNum이 바뀌는 순간 다시 조회하겠다.
  //다만 안 넣는 이유는 의미가 없기 때문에 넣지 않는다.

  dayjs().format();
  //날짜 표현하는 형식을 내가 지정할 수 있다.
  console.log(dayjs(boardDetail.regDate).format("YYYY-MM-DD HH:mm:ss"));


  //조회 쿼리 여러개 실행
  //댓글 목록 조회, 마운트 될때 boardNum, cnt 값이 변경될때
  //다시 댓글 목록을 조회해서 보여준다 
  //단!   cnt 값이  유스스테이스 값이여야함 
  useEffect(() => {
    axios
      .all([
        axios.get(`/api/boards/${boardNum}`),
        axios.get(`/api/replies/${boardNum}`),
      ])
      .then(
        axios.spread((res1, res2) => {
          setBoardDetail(res1.data);
          setGetReplies(res2.data);
        })
      )
      .catch((error) => console.log(error));
  }, [boardNum, cnt]);
  //의존성 배열안에 있는 값이 변할때마다 useffect가 실행되어 재 랜더링


  // 댓글 등록(Insert하기- post)
  //등록할 댓글 정보를 저장할 변수
  const [replies, setReplies] = useState({
    writer: "",
    content: "",
    boardNum: boardNum,
  });

  const changeReply = (e) => {
    setReplies({
      ...replies,
      [e.target.name]: e.target.value,
    });
  };

  const apiInsert = () => {
    axios
      .post("/api/replies", replies)
      .then((res) => {
        console.log(res);
        alert('댓글 등록 성공!')
        setCnt(cnt + 1);
        //cnt의 값이 변경되면 재랜더링되어 useffect가 의존성배열에 의해 
        //화면에 다시 뿌림
        
        setReplies({
          ...replies,
          writer : '',
          content : ''
        }); // => 댓글 등록 입력 칸 초기값으로 돌려놓기 
      })
      .catch((error) => {
        console.log(error);
      });
  };

  // -----------------------상세정보 영역---------------------//

  return (
    <div className={styles.detail_container}>
      <h2>게시글 상세 정보 페이지</h2>

      <div className={styles.table_div}>
        <table className={styles.detail_table}>
          <colgroup>
            <col width={"10%"} />
            <col width={"*"} />
            <col width={"10%"} />
            <col width={"15%"} />
            <col width={"10%"} />
            <col width={"15%"} />
          </colgroup>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>
                {dayjs(boardDetail.regDate).format("YYYY-MM-DD HH:mm:ss")}
              </td>
              <td>작성자</td>
              <td>{boardDetail.writer}</td>
              <td>조회수</td>
              <td>{boardDetail.readCnt}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5} className={styles.left_text}>
                {boardDetail.title}
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={5} className={styles.left_text}>
                {boardDetail.content}
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <div className={styles.btn_div}>
        <button
          type="button"
          onClick={(e) => {
            nav("/");
          }}
        >
          목록가기
        </button>

        <button
          type="button"
          onClick={(e) => {
            nav(`/update/${boardNum}`);
          }}
        >
          수정
        </button>

        <button
          type="button"
          onClick={(e) => {
            chagneDelet();
          }}
        >
          삭제
        </button>
      </div>



      {/*--------------- ---------댓글 영역----------.............--*/}
    
    
      <div className={styles.reg_reply_div}>
        <input
          type="text"
          placeholder="작성자"
          name="writer"
          value={replies.writer}
          onChange={(e) => {
            changeReply(e);
          }}
        />
        <input
          type="text"
          placeholder="댓글 내용 입력"
          name="content"
          value={replies.content}
          onChange={(e) => {
            changeReply(e);
          }}
        />
        <button
          type="button"
          onClick={(e) => {
            apiInsert();
          }}
        >
          댓글등록
        </button>
      </div>


      {/* 댓글 목록 영역*/}
    
      <div className={styles.reply_list_div}>
        {getReplies.map((getReply, i) => {
          return (
            <div className={styles.reply} key={i}>
              <span>{getReply.writer}</span>
              <span>{dayjs(getReply.regDate).format("YYYY.MM.DD")}</span>
              <div>
                <p>{getReply.content}</p>
                <button
                  type="button"
                  onClick={(e) => {
                    const result = confirm('삭제?')

                    if(!result){
                      return;
                    } 

                    axios
                      .delete(`/api/replies/${getReply.replyNum}`)
                      .then((res) => {
                        console.log(res.data);
                        setCnt(cnt + 1)
                        //다시 (바로) 댓글 목록을 조회(리랜더링 => useEffect를 재 실행 => 의존성 배열 안의 값 변경)
                      })
                      .catch((error) => {
                        console.log(error);
                      });
                  }}
                >
                  삭제
                </button>
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default BoardDetail;
