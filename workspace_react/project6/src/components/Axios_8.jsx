import axios from "axios";
import React, { useState } from "react";
import "./Axios_8.css";

const Axios_8 = () => {
  const [data, setData] = useState({
    food: "",
    bowls: 1,
    toping: "토핑추가",
    extraNeed: "",
    days: "",
  });

  const changeData=(e)=>{
    //이벤트가 일어난 모든 정보가 담긴 객체를 매개변수로 받아온다.
    setData({
      ...data,
      [e.target.name] : e.target.value
      // e.target.value == 이벤트가 발생한 태그의 벨류 속성 값  
      // e.target.name 이벤트가 발생한 태그의 네임(bowls) 속성 값  
      //bowls = 3 => 이거를 data에 넣음 그러면 키값이 중복 되면서 마지막에 넣은 bowls = 3으로 바뀜
      
      //그러니 name 속성 값을 data 객체의 키값과 일치 하도록 
    })
  }
  
  return (
    <>
      <h2>연습 문제</h2>

      <table>
        <tbody>
          <tr>
            <td>음식선택</td>
            <td>
              <select name="food" value={data.food} onChange={(e)=>{
                changeData(e)
              }}>
                <option value="">선택</option>
                <option value="치킨">치킨</option>
                <option value="피자">피자</option>
                <option value="족발">족발</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>수량</td>
            <td>
              <input name="bowls" type="number" value={data.bowls} onChange={(e)=>{
                changeData(e);
              }}/>
            </td>
          </tr>
          <tr>
            <td>추가선택</td>
            <td>
              <input type="radio" name="toping" value={'토핑추가'} checked={data.toping === "토핑추가"} onChange={(e)=>{
                changeData(e)
              }}/> 토핑추가
             
              <input type="radio" name="toping" value={'음료추가'}
              checked={data.toping === '음료추가'} onChange={(e)=>{
                changeData(e)
              }} /> 음료추가
              
              <input type="radio" name="toping" value={'공기밥추가'} checked={data.toping === '공기밥추가'} onChange={(e)=>{
                changeData(e)
              }}/> 공기밥추가
            </td>
          </tr>
          <tr>
            <td>요청사항</td>
            <td>
              <textarea name="extraNeed" value={data.extraNeed} onChange={(e)=>{
                changeData(e)
              }} cols={30} rows={5}></textarea>
            </td>
          </tr>
          <tr>
            <td>주문일시</td>
            <td>
              <input name="days" value={data.days} onChange={(e)=>{
                changeData(e)
              }} type="date" />
            </td>
          </tr>
        </tbody>
      </table>
      
      <div>
        <button type="button" onClick={(e)=>{
              axios.post('/api/t9', data)
              .then((res)=>{
                console.log(res)
                //스프링 자바에서 리턴이 없기 때문에 res.data가 ""로 나옴 
                alert('서버로 데이터를 전송했습니다') 
                //의미없을지 몰라도 then()은 무조건 실행 되니
                //깔끔하게 완성 지어야 한다. 
              })
              //보내는 것만 아니라 받는 것도 깔끔하게 하기
             .catch((error)=>{
              console.log('통신오류')
             })
        }}>전송</button>
      </div>
    </>
  );
};

export default Axios_8;
