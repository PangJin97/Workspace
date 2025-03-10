import './App.css'
import Board from './Component/Board';
import OderInfo from './ComponentForTest/OderInfo';
import Counter from './Components/Counter';
import Header from './Components/Header';
import LottoA from './Components/LottoA';

function App() {
  
  //구조분해할당(배열,객체에서 사용)
  const arr = [1,2,3];
  const [a, b, c] = arr; 
  //a=1, b=2, c=3 -> 배열에서의 구조분해할당
  //차례대로 넣어주세요 가능

  const person = {
    name : 'kim',
    age : 20,
    addr : '울산'
  }
  
  //const {aaa,bbb,ccc} = person; => 객체는 순서가 없기 때문에 이렇게 못씀.
  
  const {name, age ,addr} = person;
  //객체에 있는 키값과 동일하게 넣는다 
  // const {name, age} = person;

  function aaa({name, age}){ // {name, age} = person; 
    console.log(name)
    console.log(age)
  }


  return (
    <>
      {/* <h2>props</h2>  */}
      {/* <Header name={'react'} age={20} gender={'male'}/> 
       */}
      {/* 속성이 아니다! 비슷하게 생겼지만 props임
          name은 넘어가는 이름, {'값'} 
        let name = react  
        'key 와 value 전달' 
      */}
     
      {/* <Counter />
      <LottoA />  */}
      {/* <Board /> */}
      <OderInfo />
    </>
  )
}

export default App
