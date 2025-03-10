import React from "react";

const Controller = ({cnt,setCnt}) => {
    
  return (
    <>
      <div>
        <button type="button" onClick={(e)=>{
          setCnt(cnt-1)
        }}>-1</button>
        
        <button type="button" onClick={(e)=>{
          setCnt(cnt-10)
        }}>-10</button>

        <button type="button" onClick={(e)=>{
          setCnt(cnt-100) 
        }}>-100</button>
      </div>
    </>
  );
};

export default Controller;
