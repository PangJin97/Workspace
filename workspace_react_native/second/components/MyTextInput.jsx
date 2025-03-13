import { StyleSheet, Text, TextInput, View } from 'react-native'
import React from 'react'

// 자주쓰는 input 태그 (공통 컴포넌트 개념)
const MyTextInput = ({placeholder = '', ...props}) => {
  return (
    <TextInput 
    style={styles.input} 
    placeholder={placeholder}
    //속성의 값을 프롭스로 받는다!

    //secureTextEntry       // type = 'password'
    
    returnKeyType='next'  // 자판 UI의 완료를 -> 다음으로 변경 
    autoCapitalize='none' // 자동 대문자 변환 비활성화 
    spellCheck={false}    // 맞춤법 검사 비활성화 
    autoCorrect={false}   // 맞춤법 자동 수정 비활성화 
    {...props}            // name value     onChange 한꺼번에 프롭스로 받을게
    />
  )
}

export default MyTextInput

const styles = StyleSheet.create({
  input : {
    borderWidth : 1 
  }
})