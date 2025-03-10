import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import { BrowserRouter } from "react-router-dom";

createRoot(document.getElementById("root")).render(

    //BrowerRouter 태그 안에 작성한 컴포넌트에는
    //route를 사용할 수 있다
    //route : react페이지 이동과 같은 효과를 주는 기능

  <BrowserRouter>
    <App />
  </BrowserRouter>
);
