
// 문제 1번
const arr =[1,2,3,4,5]

function even(arr){
  for(let i =0; i < arr.length; i++){
    if(arr[i]%2===0){
      console.log(arr[i])
    }
  }
}
even(arr)

//문제 2번
const arr1 = [1,2,3,4,5]
const arr2 = [1,2,3,4,5]

let sum = 0;

const avg = function(arr1, arr2){
  const arr3 = [...arr1, ...arr2]
  for(let i = 0; i < arr3.length; i++){
     sum = sum + arr3[i]
  }
  return sum;
}

console.log(avg(arr1, arr2)/(arr1.length + arr2.length))



//문제3번
const str = ['Tenka','Saria','Penance']

let maxLen = str[0];

const length = (str)=>{
  for(let e of str){
    if(maxLen.length < e.length){
      maxLen = e;
    }
  }
  return maxLen
}

console.log(length(str))


//문제 4번
const newArr = []
const array = (num1,num2)=>{
  for(let i = 1; i < num2+1; i++){
   newArr.push(num1*i)
  }
  return newArr;
}
console.log(array(3,5))

//자바에서 값 넣드시 
// for(let i = 1; i < num2+1; i++){
//   newArr[i] = num1*i
//  }
// 0번째 요소가 애매해져 
// 그냥 js에서 값넣을 때는 .push넣는다 생각

//문제 5번
const emp = {
  name : 'tenka',
  dept : '개발부',
  sal : 30000,
  grade : '대리'
}

const emp2 = {
  name : 'saria',
  dept : '인사부',
  sal : 20000,
  grade : '부장'
}

// 5-2번
const deptPrint = (emp)=>{
  emp.dept === '개발부' ? console.log(emp.sal) : console.log('부서가 잘못되었습니다')
}
  
deptPrint(emp)


// 5-3번
const namePrint = function(emp,emp2){
  return emp.sal > emp2.sal ? emp.name : emp2.name;
}

console.log(namePrint(emp,emp2))



//문제 6번

const foodList = [
  {
  name : '김치찌개',
  price : 12000,
  type : '한식',
  material : ['김치','두부', '돼지고기']
  }, 
  {
  name : '짜장면',
  price : 8000,
  type : '중식',
  material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
  name : '불고기',
  price : 15000,
  type : '한식',
  material : ['소고기','양파', '대파']
  }, 
  {
  name : '탕수육',
  price : 25000,
  type : '중식',
  material : ['돼지고기','밀가루']
  }
 ];

 // 6-1번
 const printAllName = (foodList) =>{
  for(let e of foodList){
    console.log(e.name)
  }
 }
 printAllName(foodList)


 // 6-2번
 let sum1 = 0;
 const korFoodSal = function(foodList){
  for(let e of foodList){
    if(e.type === '한식'){
      sum1 = sum1 + e.price
    }
  }
  console.log(sum1)
 }
 // 여기선 왜 retrun으로 안끝내??
 // 다 돌면서 합을 구해야 하잖아
 // 특정 값만 찾는게 아니야...

 korFoodSal(foodList)

 //6-3번
 
 const foodArr =[]
 const materialLen = (foodList)=>{
  for(let food of foodList){
    if(food.material.length >= 3){
      foodArr.push(food.material)
    }
  }
  return foodArr;
 }
 console.log(materialLen(foodList))


 //6-4번 
 
const printAllMaterial = (foodList, foodName)=>{
  for(let food of foodList){
    if(food.name === foodName){
      console.log(food.material)
      return;
    }
  }
  console.log('정보없음')
  // else{console.log('정보없음')} 이런식으로 하면 안되영
  //반복문 아니라 정보없음 계에속 출력됨 
}

console.log(printAllMaterial(foodList,'불고기'))

/////////////////////////////////////////////////////////////////////

//매개변수로 5보다 큰 숫자가 들어올때면 안녕 출력
function aaa(num){
  if(num > 5){
    console.log('안녕')
  }
}

//return 키워드 작성 후 데이터를 작성하지 않으면 retrun을 만나면 함수 종료.
function bbb(num){
  if(num < 5){
    return ; 
  }
  console.log('안녕')
}
//만약 3이 들어오면 참이라도 안녕도 출력 안시키고 그냥 종료.





//1. 언제 break를 써야 하나요?
//찾는 조건을 만족하면 더 이상 반복할 필요가 없을 때

//예: 배열이나 리스트에서 '특정 값'만을 찾는 경우.
//찾고자 하는 값을 찾았으면 더 이상 반복문을 돌 필요가 없으니 멈춥니다.

//for (let i = 0; i < numbers.length; i++) {
 // if (numbers[i] === target) {
  //  console.log(`찾았다! ${target}은 배열의 ${i}번째 요소입니다.`);
  //  break; // 찾았으니 반복문을 종료합니다.





 // 2. 언제 break를 쓰지 않아야 하나요?
//리스트 전체를 꼭 다 확인해야 할 경우

//예: 평균값 계산, 데이터 집계.
//모든 데이터를 처리해야 하기 때문에 중간에 반복문을 멈추면 안 됩니다.

//조건 없이 반복문을 무조건 다 돌아야 하는 경우

//예: 특정 작업을 반복해서 수행해야 하는 경우.
