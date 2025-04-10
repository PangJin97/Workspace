import { configureStore } from "@reduxjs/toolkit";
import counterSlice from "./counterSlice";
import nameSlice from "./nameSlice";
import memberSlice from "./memberSlice";
import cartSlice from "./cartSlice";

//slice 들을 관리한 공용 저장소 
export const store = configureStore({
  reducer : {
      counter : counterSlice.reducer,
      myName : nameSlice.reducer,
      member : memberSlice.reducer,
      itemList : cartSlice.reducer
  }
});

