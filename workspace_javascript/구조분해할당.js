
//배열의 데이터를 다른 변수에 저장하는 일반적 방법.
const arr1 = [1,2,3];

let a = arr1[0];
let b = arr1[1];
let c = arr1[2];

//배열에서의 구조분해할당
let [aa, bb, cc] = arr1; // [1, 2, 3] -> aa=1 bb=2 cc=3
//데이터를 순서대로 넣음

console.log(aa,bb,cc);

let [aaa, bbb] = arr1;
console.log(aaa,bbb) //aaa = 1, bbb = 2 


////////////////////////////////////////////////////////////////////////


//객체에서의 구조분해 할당
 const person = { 
  name : 'kim',
  age : 20,
  hobby : '공부'
 };

 //const {name, age, hobby} = person;
 const {age, name, hobby} = person;
 console.log(age, name, hobby);
 //객체는 배열과 다르게 순서대로 들어오는게 아니라 
 //객체가 가지고 있는 key값과 동일하게 값이 할당된다.

 //새 객체안에 할당할때 key값이 동일해야함
 
 const {name1, age1, hobby1} = person;
 console.log(name1, age1, hobby1)
 //undefined 
 //{}안에 변수명는 person의 key와 일치해야한다. 

 // =>함수에서 많이 씀 

 const student = { 
  name : 'kim',
  age : 30,
  korScore : 80,
  engScore : 70
 }

 //매개변수로 student 객체가 전달되면 해당 학생의 총점을 리턴하는 함수 
 
 //일반적으로 할떄
 function getSum(s){
  let korScore = s.korScore;
  let engScore = s.engScore;
  return korScore + engScore;
}
getSum(student);


//매개변수로 쓸때. 매개변수로 student 객체가 전달되면 해당 학생의 총점을 리턴하는 함수 

//호출할때는 객체를 넣는다.
//{korScore, engScore} = student; 
function getSum1({korScore, engScore}){
    return korScore + engScore;
}
getSum1(student);

const phone = {
  modelName : 's5',
  price : 10000,
}


//매개변수로 phone을 전달하면 폰 객체의 모델명과 가격을 출력하는 함수

//{modelName, price} = phone;
function p({modelName, price}){
  console.log(modelName, price);
}
p(phone);
//'객체에서 구조분해 할당을 쓰면 매개변수의 변수명을 마음대로 바꾸면 안된다.'
//key값과 동일해야한다. 


function p1(p){
  console.log(p.modelName, p.price)
}
p1(phone);

