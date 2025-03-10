import './App.css'
import Footer from './components/Footer'
// ./ : '현재폴더 기준'으로 app.css를 가져올게요
import SideMenu from './components/SideMenu'
import { StateTest } from './components/StateTest';
// 해석할 수 있어야함. 직접 칠 수도 있음.

function Header(){
  return (
    <div>
      <div>header</div>
    </div>
  )
}

function App() {
  let title = '오늘의 제목';
  let arr = [1,2,3];
  let person = {
    name :'kim',
    age : 20
  };

  //num의 값이 3이상이면 div 보이게
  let num = 3;

  return (
    <>
    {/* 최상위 태그는 하나여야 한다. */}

      <StateTest />
      
      {
        num >= 3 ? <div>3이상입니다</div> : ''
      }
      
      <Header></Header>
      <Header />
      <div>{title}</div>
      {/* 변수쓸 때 {}만 쓴다 */}
      <div>{10 + 20}</div>
      {/* 연산도 {}안에서 쓴다. */}
      <div>{arr}</div>
      {/* 배열은 나오는데 객체는 안나옴 */}
      <div>{person.name}</div>
      {/* 객체를 통으로 넣는것은 안되나 객체의 데이터 하나하나는 출력 가능 */}
      <div className='title'>hello</div>
      {/* css처럼 꾸미고 싶을때 class를 쓸 수 없음 => className을 써야함*/}
      <div>hello</div>
      <SideMenu />
      {/* 컴포넌트 외부에서 가져올려면 파일이 열려 있어야함 */}
      <Footer />
      <img src="" alt="" /> 
      {/* 원래 안닫는 태그도 닫아줘야 한다(이미지 태그, br태그, input태그) */}
    </>
  )
}

export default App
