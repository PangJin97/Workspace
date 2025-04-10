import { createSlice } from "@reduxjs/toolkit";

//숫자를 저장하고 있는 state 변수를 만들었음
//const [counter, setCounter] = useState(5); 랑 비슷한 느낌이다 

const counterSlice = createSlice({
  name : "counter", //변수의 이름
  initialState : 5, //변수의 초기값
  reducers : {
    increase : (state) => {
      //state : 변수의 초기값(현재 들고 있는 값)
      return state + 1;
      //return되는 데이터로 state 값을 변경  
    }, 
    decrease : (state) => {
      return state - 1;
    },
    
    //매개변수로 들어온 데이터 만큼 counter값을 증가
    //매개변수 state, action이라고 정해져 있음
    
    //action 상태의 변화를 일으키기 위한 정보를 가지고 있는 객체 
    //state를 action만큼 변화시킨다.
    
    //다만 action은 값만 가지고 있는게 아니라 변화를 일으키는 모든 정보를 가지고 있기 때문에 
    //값만 가져오려면 action.payload 
    handleCounter : (state, action) => {
      return state + action.payload
    }

  }
  //reducer => 변수의 값을 변경(업데이트)하는 함수(useState의 set함수라 생각)
});

// => '공용'으로 쓸 데이터인 silce를 만들었음 -> store에 넣어줘야 쓸 수 있다. 

export const {increase, decrease, handleCounter} = counterSlice.actions;
//counterSlice 안에 있는 reducers 안에 있는 모든 변경 함수 = actions 
//{}안에는 빼서 쓰고 싶은 함수 
export default counterSlice;