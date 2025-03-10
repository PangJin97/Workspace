import { useState } from "react";
import "./App.css";
import { Test1 } from "./components/Test1";
import Test2 from "./components/Test2";
import Test3 from "./components/Test3";
import { Test2풀이 } from "./components/Test2풀이";
import Test4 from "./components/Test4";

function App() {
  return (
    <>
      <h1>useState실습</h1>
      <Test1 />
      <Test2 />
      <Test2풀이 />
      <Test3 />
      <Test4 />
    </>
  );
}

export default App;
