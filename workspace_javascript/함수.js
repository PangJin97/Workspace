//기본 함수 선언 방식
//리턴타입 작성 안함
function printHello(){
  console.log('hello~');
}

//printHello();


//매개변수로 두 정수를 받아 두 정수의 합을 출력
function printSum(num1, num2){
  console.log(num1+num2);
}

printSum(10,20);

//매개변수로 두 수를 전달받아, 두 수의 곱을 리턴함수 
function getMulti(a, b){
  return a * b;
}

let result = getMulti(2,5);
console.log(result);

//자바스크립트는 함수를 변수에 저장 가능하다. 
//함수도 하나의 자료형을 봄. 


//화살표 함수 : 함수를 간략히 선언! 
function printData(){
  console.log('hello')
}

const printData2 = () => console.log('hello');
//() 매개변수 {}실제 함수 부분 

printData2();


//함수 표현식 
const prinData3 = function (){};
//함수가 변수안에 들어감.


/////////////////////////////////////

function f1(a, b){
  console.log(a+b);
}

//함수 표현식
const f2 = function(a,b){
  console.log(a+b)};

//화살표 함수 
const f3 = (a,b) => console.log(a+b)
