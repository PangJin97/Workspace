import React from "react";

const Map_4 = () => {
  const studentList = [
    {
      name: "김자바",
      age: 20,
      korScore: 70,
      engScore: 80,
    },
    {
      name: "이자바",
      age: 30,
      korScore: 90,
      engScore: 90,
    },
    {
      name: "박자바",
      age: 40,
      korScore: 60,
      engScore: 100,
    },
  ];

  //배열안에 객체가 들어가는 형태가 가장많음.

  return (
    <>
      <h2>Map_4</h2>
      <table>
        <thead>
          <tr>
            <td>학생이름</td>
            <td>나이</td>
            <td>국어점수</td>
            <td>영어점수</td>
          </tr>
        </thead>
        <tbody>
          {studentList.map((student, i) => {
            //studentList 를 반복하는데
            //객체가 매개변수로 들어옴
            return (
              //반복하면서 데이터를 리턴한다.
              <tr key={i}>
                {/* 행을 반복하면서 studentList의 데이터를 이렇게
                리턴 받을거야 */}
                <td>{student.name}</td>
                <td>{student.age}</td>
                <td>{student.korScore}</td>
                <td>{student.engScore}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};
//시험에 나온다,
export default Map_4;
