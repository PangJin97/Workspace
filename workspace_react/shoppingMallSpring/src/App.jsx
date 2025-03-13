import { Route, Routes, useNavigate } from "react-router-dom";
import "./App.css";
import "./common.css";
import ShopInsert from "./components/ShopInsert";
import ShopList from "./components/ShopList";
import ShopDetail from "./components/ShopDetail";
import ShopOrder from "./components/ShopOrder";
import Header from "./components/Header";
import ShopOrderList from "./components/ShopOrderList";

function App() {
  
  //falsy : false로 판단하는 내용
  //null, undefined, 0, '' 

  //truthy : falsy한 데이터 빼고 전부. 


  const data1= 'java'
  const data2= 'python'
  console.log(data1&&data2)
  //&&는 앞 뒤 전부 해석 => 해석하고 마지막으로 실행된 것이 결과 값으로 출력 
  //python이 출력 

  console.log(data1||data2)
  // 앞에 것이 true니 더 이상 해석안함 => 마지막으로 해석한게 data1이니 
  //java 출력 

  // &는 앞뒤 조건 전부 해석하지만
  // &&는 앞이 거짓이면 뒤에것을 해석조차안함

  return (
    <div>
      <Header />
      
      <Routes>
        <Route path="/insert" element={<ShopInsert />} />
        <Route path="" element={<ShopList />}/>
        <Route path="/order" element={<ShopOrder />}/> 
        <Route path="/orderList" element={<ShopOrderList />}/>
      </Routes>
    
    </div>
  );
}

export default App;
