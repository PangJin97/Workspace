import { createSlice } from "@reduxjs/toolkit";

//const [name, setName] = useState('hong')

const nameSlice = createSlice({
  name : 'name',
  initialState : {data : 'hong'}, //'hong' 
  reducers :{
    //changeName : (state, action) =>{return state + action.payload;}
    changeName : (state, action) =>{state.data = state.data + action.payload;}
  }
});
//객체나 배열 처럼 return을 안써도 되니 문자열도 그냥 객체로 만들어서 만든다

export default nameSlice;