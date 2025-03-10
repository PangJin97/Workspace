
const arr1 = [1,2,3];
const arr2 = [4,5];
//[1,2,3,4,5] 로 만들고 싶다.
const arr3 = [1,2,3,...arr2];
//... : 스프레드 연산자 => arr2의 박스를 벗겨 

//[1, 4, 5, 2, 3]
const arr4 = [1, ...arr2, 2, 3]


//배열 기본.
//arr1[3] = 5; // [1,2,3,5] 
//자바스크립트는 추가

//arr1.push(6);
//배열의 마지막에 6추가 //[1,2,3,5,6]

//배열에 배열이 들어감 
//arr1[3] = arr2; //[1, 2, 3, [4, 5]]
//arr1.push(arr2); //[1, 2, 3, [4, 5]]


//////////////////////////////////////////////////////////


//객체에서의 스프레드. 

const person = { 
  name : 'kim',
  age : 20
};

const score = { 
  korScore : 80,
  mathScore : 100
};


const student = {
  ...person,
  ...score
}
//박스를 벗긴다. 

const student1 = {
  person,
  score
}
//껍떼기가 같이 온다.