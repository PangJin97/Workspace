import React, { useState } from "react";

const Display = (props) => {
  console.log(props)

  return (
    <>
      <div>
        <p>현재카운트 : </p>
        <p>{props.cnt}</p>
      </div>
    </>
  );
};

export default Display;
