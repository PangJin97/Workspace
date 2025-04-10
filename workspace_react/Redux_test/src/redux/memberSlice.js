import { createSlice } from "@reduxjs/toolkit";

const memberSlice = createSlice({
  name : "member",
  initialState : {
    memId : 'hong',
    memAge : 20,
  },
  reducers : {
    handleMemberId : (state, action) => {
      //return {...state, memId:'java'}
      state.memId = action.payload; //reducer는 일반 변수 바꾸듯이 가능함 다만, return이 필요없음.
    }
  }
});


export default memberSlice;
export const {handleMemberId} = memberSlice.actions;