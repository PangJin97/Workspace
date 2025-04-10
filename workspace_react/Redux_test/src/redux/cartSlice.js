import { createSlice } from "@reduxjs/toolkit";

const cartSlice = createSlice({
  name : "itemList",
  initialState:  [
    {
      cartNum : 1,
      itemName : '청바지',
      price : 10000
    },
    {
      cartNum : 2,
      itemName : '셔츠',
      price : 20000
    },
    {
      cartNum : 3,
      itemName : '맨투맨',
      price : 35000
    }
  ],
  reducers : {
    handleInsertCart : (state,action)=>{
      // 리덕스에서는 일반 변수 바꾸듯이 할 수 있다!
      state.push(action.payload)
      // 또는 return [...state, action.payload]
    }
  }
})

export default cartSlice;
export const {handleInsertCart} = cartSlice.actions;