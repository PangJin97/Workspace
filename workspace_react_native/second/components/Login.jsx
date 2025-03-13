import { SafeAreaView, StyleSheet, Text, TextInput, View } from "react-native";
import React, { useState } from "react";
import MyTextInput from "./MyTextInput";
import MyButton from "./MyButton";

const Login = () => {
  // const [id, setId] = useState("");
  // const [pw, setPw] = useState("");

  // => 여러개 받기 
  const [data,setData]=useState({
    idd: '',
    pww: ''
  })

  //name 속성값이 없기에 매개변수로 받는다
  const changeData = (text, name) =>{
    setData({
      ...data,
      [name] : text 
    })
  }

  return (
    <SafeAreaView>
      <Text>Login</Text>

      <MyTextInput
        placeholder={"Enter Your Id"}
        // onChangeText={(text) => {
        //   setId(text);
        // }}
        onChangeText ={(text)=>{
          changeData(text, 'idd')
        }}
        value={data.idd}
      />

      <MyTextInput
        placeholder={"Enter Your PW"}
        // onChangeText={(text) => {
        //   setPw(text);
        // }}
        onChangeText={(text)=>{
          changeData(text, 'pww')
        }}
        value={data.pww}
        secureTextEntry
      />

      <MyButton
        press={() => {
          alert(`id=${data.idd}, pw=${data.pww}`);
          // alert(`id=${id}, pw=${pw}`);
        }}
        title="데이터 확인"
      />

      <MyButton
        press={() => {
          alert("안녕하세요");
        }}
      />
      {/* 이 버튼을 누르면 안녕하세요 */}
      <MyButton
        size="small"
        press={() => {
          console.log("안녕하세요");
        }}
      />
      {/* console에 안녕하세요 */}
    </SafeAreaView>
  );
};

export default Login;

const styles = StyleSheet.create({});
