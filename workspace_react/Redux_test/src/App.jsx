import { useSelector } from "react-redux";
import "./App.css";
import Test1 from "./components/Test1";
import Test2 from "./components/Test2";
import Test3 from "./components/Test3";

function App() {
  //store에 저장된 데이터 가져오기 
  //state => store가 가지고 있는 모든 데이터 
  
  //const data = useSelector((state)=>{return state})
  //store에 있는 모든 데이터 리턴해줘(모든 데이터 빼버리기)
  const data = useSelector(state => state)

  //store에 있는 counter만 리턴
  const counter = useSelector(state => state.counter)

  console.log(counter)
  
  return (
    <div>
      run~ app({counter})
      {/* 공용변수이기 때문에 Test1컴포넌트에서 상태가 변해도 여기서도 변함 */}
      <div>
        <Test1 />
        <Test2 />
        <Test3 />
      </div>
    </div>
  );
}

export default App;
