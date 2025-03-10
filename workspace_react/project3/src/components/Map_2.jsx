import React from 'react'

const Map_2 = () => {
  const arr = ['짜장면', '짬뽕', '탕수육']
  return (
   <>
       <h2>Map_2</h2>
      <ul>
        {
          arr.map((food, i)=>{
            //arr 배열의 food(음식)이 index(0,1,2 => 3번) 반복될 동안
            return(
              <li key={i}>{food}</li>
              //리턴하는 데이터
            ) 
          })
        }
      </ul>
   </>
  )
}

export default Map_2