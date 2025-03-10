import "./App.css";

//리턴문 안에 html은 반드시 하나의 태그에 감싸져야 한다.
function Header() {
  return (
    <div>
      <h3>header</h3>
    </div>
  );
}
//컴포넌트는 반드시 대문자로 시작해야한다!!!!!.(자바스크립트의 함수와 구분하기 위해 꼭 지켜야줘야 한다.)

//컴포넌트는 화살표 함수로도 가능
const Footer = () => {
  return (
    <div>
      <h3>footer</h3>
    </div>
  );
};

function App() {
  return (
    <>
      <Header />
      <div>
        <h3>content</h3>
      </div>
      <Footer />
      {/* 열자마자 닫는다 */}
    </>
  );
}

export default App;
