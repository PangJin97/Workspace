import React from "react";

const Map_3 = () => {
  const locallist = ['경기도', '강원도', '경상도', '전라도']

  //locallist를 사용하여 selectbox에 그리세요


  return (
    <>
    <h2>Map_3</h2>
     <select>
        { 
          locallist.map((local, i) => {
            return( 
              <option key={i}>{local}</option>
            )
          })
        }
     </select>
      
    </>
  );
};

export default Map_3;
