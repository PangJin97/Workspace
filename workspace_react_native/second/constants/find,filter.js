const data = [
  {
    id: 1,
    item: "달걀 한 판",
  },
  {
    id: 2,
    item: "라면 한 묶음",
  },
  {
    id: 3,
    item: "주방 세제",
  },
];

 //cartList에서 id가 2인 데이터 찾기
  // e : 배열에 있는 데이터 하나 하나
  // find : retrun에 작성한 조건문과 일치하는 데이터만 리턴 해준다.
  const a = cartList.find((e) => {return e.id === 2}); // 수정
  // a =  {
  //   id: 2,
  //   item: "라면 한 묶음",
  // },
  const a1 = cartList.find(e => e.id === 2); // 수정
  //return은 중괄호와 같이 생략 가능 
  
 
  //filter 함수 
  //리턴에 작성한 조건과 일치하는 데이터는 걸러낸다. // 삭제 
  const b = cartList.filter((e) => {return e.id === 2});
  // a2 =  {
  //   id: 1,
  //   item: "달걀 한 판",
  // },
  // {
  //   id: 3,
  //   item: "주방 세제",
  // },
  const b1 = cartList.filter(e => e.id === 2);

