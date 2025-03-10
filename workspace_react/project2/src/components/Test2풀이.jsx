import React, { useState } from 'react'

export const Test2풀이 = () => {
  
  const [displayText,setDisplayText] = useState('ON');
  const [btnText, setBtnText] = useState('OFF') 
  return (
    <>
      <div>Test2(풀이)</div>
  
      <div>{displayText}</div>
      <button type ="button" onClick={() => {
        setDisplayText(displayText === 'ON' ? 'OFF' :'ON')
        setBtnText(btnText === 'ON' ? 'OFF' : 'ON');
      }}>{btnText}</button>
    </>
  )
}
export default Test2풀이;
