import { createSlice } from "@reduxjs/toolkit";
import { jwtDecode } from "jwt-decode";

const getToken = () =>{
  const token = localStorage.getItem('accessToken')

  //token없으면 null 리턴 후 함수 종료
  if(token === null) return null;

  //토큰의 payload 부분을 해석해서 객체로 리턴
  const decodedToken = jwtDecode(token);

  //현재 날짜 및 시간 (현재 날짜 및 시간을 가져오면 밀리세컨드단위로 가져옴)
  const currenTime = Date.now() / 1000;

  //토큰의 만료시간이 지났으면....
  if(decodedToken.exp < currenTime){
    return null;
  }

  return token;
}

const authSlice = createSlice({

  name : 'auth',
  initialState: {token : getToken()},
  reducers : {
    loginReducer : (state, action) =>{
      state.token = action.payload;
      localStorage.setItem('accessToken', action.payload);
    },
    logoutReducer : (state) =>{
      state.token = null;
      localStorage.removeItem('accessToken');
    }
  }
}
)

export default authSlice;
export const {loginReducer,logoutReducer} =authSlice.actions;