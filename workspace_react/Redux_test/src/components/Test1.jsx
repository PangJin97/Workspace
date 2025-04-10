import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { handleCounter, increase } from "../redux/counterSlice";

const Test1 = () => {
  //store에 저장된 counter 가져옴
  const counter = useSelector((state) => state.counter);

  //store에 등록된 reducer(함수)를 호출 해주는 객체
  const dispatch = useDispatch();

  return (
    <>
      <div>Test1 {counter}</div>
      <button
        type="button"
        onClick={(e) => {
          //dispatch(increase());
          dispatch(handleCounter(5)); //5가 handleCounter함수의 매개변수 action
        }}
      >
        +1 증가
      </button>
    </>
  );
};

export default Test1;
