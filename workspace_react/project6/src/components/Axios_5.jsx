import React, { useEffect, useState } from "react";
import "./Axios_5.css";
import axios from "axios";

const Axios_5 = () => {
  //서버에서 받는 사람 목록 정보를 저장할 state 변수

  const [personList, setPersonList] = useState([]);
  const [stutendList, setStudentList] = useState([]);

  //res.data 는 항상 새로운 주소값을 가지는 배열이므로 굳이 스프레드를 쓰지 않아도 알아서 react가 자동으로 상태 변환을 인지한다. 

  //서버에서 사람목록 데이터 가져오는 함수
  const changeDataPesron = () => {
    axios
      .get("/api/t4")
      .then((res) => {
        console.log(res.data);
        setPersonList(res.data);
      })
      .catch((error) => {
        console.log("통신오류");
      });
  };

  //서버에서 학생 목록 가져오는 함수 
  const changeDataStudent = () => {
    axios
      .get("/api/t5")
      .then((res) => {
        console.log(res.data);
        setStudentList(res.data);
      })
      .catch((error) => {
        console.log("통신오류");
      });
  };

  return (
    <>
      <h2>Axios_5</h2>
      <table className="t1">
        <colgroup>
          <col width={"50%"} />
          <col width={"50%"} />
        </colgroup>
        <tbody>
          <tr className="t1-tr">
            <td>
              <button
                type="button"
                onClick={(e) => {
                  changeDataPesron();
                }}
              >
                버튼1
              </button>
              <table>
                <thead>
                  <tr>
                    <td>이름</td>
                    <td>나이</td>
                    <td>주소</td>
                  </tr>
                </thead>

                <tbody>
                  {
                 
                 personList.length === 0 ?
                    <tr>
                      <td colSpan={3}>버튼1을 클릭하면 데이터가 조회됩니다.</td>
                    </tr>
                  : 
                    personList.map((person, index) => {
                      return (
                        <tr key={index}>
                          <td>{person.name}</td>
                          <td>{person.age}</td>
                          <td>{person.addr}</td>
                        </tr>
                      );
                    })
                 
                  }
                </tbody>
              </table>
            </td>

            <td>
              <button
                type="button"
                onClick={(e) => {
                  changeDataStudent();
                }}
              >
                버튼2
              </button>

              <table>
                <thead>
                  <tr>
                    <td>이름</td>
                    <td>국어점수</td>
                    <td>영어점수</td>
                    <td>수학점수</td>
                    <td>총점</td>
                  </tr>
                </thead>

                <tbody>
                  {
                  
                  stutendList.length === 0 
                  ? 
                    <tr>
                      <td colSpan={5}>버튼2를 클릭하면 데이터가 조회됩니다.</td>
                    </tr>
                   : 
                    stutendList.map((student, index) => {
                      return (
                        <tr key={index}>
                          <td>{student.name}</td>
                          <td>{student.korScore}</td>
                          <td>{student.engScore}</td>
                          <td>{student.mathScore}</td>
                          <td>
                            {student.korScore +
                              student.engScore +
                              student.mathScore}
                          </td>
                        </tr>
                      );
                    })
                 
                  }
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default Axios_5;
