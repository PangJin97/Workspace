import axios from "axios";
import React from "react";

const LottoNum = (props) => {
   
  const getLottoNum = (index) => {
    //버튼 클릭 시 자바에서 1~45의 랜덤한 정수 받아오는 함수
    const copyLotto = [...props.lotto]
    //React는 상태가 바뀌었는지 '배열의 주소'를 보고 판단한다
    //그래서 새로운 배열을 만들어주는 스프레드 연산자가 필요함

    //props.lotto[0] = 45; // 이렇게 직접 바꾸면 React는 모른다 왜? 상태가 바뀌었는지는 배열의 주소를 보고 판단하니까. 
    //props.setLotto(props.lotto); // 상태를 업데이트하려고 해도 React가 감지하지 못함
    // => 데이터 값은 바뀔지언정  주소가 변하지 않았기 때문에, 새로운 주소를 갇는 배열을 만들어야 한다. 

    axios.get('/api/getLottoNum')
          .then((res)=>{
            copyLotto[index] = res.data
            props.setLotto(copyLotto)
          })
          .catch((error)=>{
            console.log('오류발생')
            console.log(error)
          })
    }
 
    return (
    <>
      <div className="num">
        <div className="display">{props.num}</div>
        <div className="btn-div">
          <button type="button" onClick={(e)=>{
            getLottoNum(props.i);
            //map함수의 i는 데이터의 갯수 만큼 반복한다는 의미
            //즉, i는 인덱스
          }}>생 성</button>
        </div>
      </div>
    </>
  );
};

export default LottoNum;

//스프레드 연산자는 일반적으로 아래와 같은 상황에서 사용됩니다:

//1. 배열에 새로운 요소를 추가할 때

//setPersonList((prevList) => [...prevList, newPerson]);

//2. 배열을 복사하면서 일부 요소를 수정할 때

// const updatedList = personList.map(person => 
// person.id === targetId ? { ...person, name: "Updated Name" } : person
// );
// setPersonList(updatedList);

// 스프레드 연산자가 필요한 경우는 '기존 상태를 기반으로 새로운 상태'를 생성해야 할 때입니다.
// 기존의 배열을 유지하면서 새로운 데이터를 추가하거나 수정하고 싶다면 스프레드 연산자가 필요합니다. => 위에서 풀었던 예문의 경우이다!!!!



//res.data 자체가 새로운 객체나 배열로 전달되므로, React는 상태가 변경되었다고 인지합니다.
//따라서, 스프레드 연산자를 추가로 사용할 필요가 없습니다.

//왜 새로운 배열로 간주되는가?
//axios의 .get() 요청이 성공하면, res.data는 항상 새로운 객체(또는 배열)로 반환됩니다.
//이때, 반환된 배열의 참조값이 기존의 personList와 다르기 때문에 React는 상태가 변경되었다고 판단합니다.
