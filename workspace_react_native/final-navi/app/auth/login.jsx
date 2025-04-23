import { StyleSheet, Text, View } from "react-native";
import React, { useState } from "react";
import CustomInput from "../../components/common/CustomInput";
import CustomButton from "../../components/common/CustomButton";
import { api_join, api_login } from "../../apis/memberApis";

const LoginScreen = () => {
  const [loginData, setLoginData] = useState({
    memEmail: "",
    memPw: "",
  });

  const handleLoginData = (text, name) => {
    setLoginData({
      ...loginData,
      [name]: text,
    });
  };

  const login = () => {
    api_login(loginData).then(res => {alert(11)
      const token = res.headers.authorization;
      console.log(token)
    }).catch(error => console.log(error))
  }

  return (
    <>
      <View>
        <CustomInput
          value={loginData.memEmail}
          onChangeText={(text) => {
            handleLoginData(text, "memEmail");
          }}
          label={"아이디"}
        />
        <CustomInput
          value={loginData.memPw}
          onChangeText={(text) => {
            handleLoginData(text, "memPw");
          }}
          label={"비밀번호"}
          isPw={true}
        />
        <CustomButton label={"로그인"} onPress={()=>{login()}} />
      </View>
    </>
  );
};

export default LoginScreen;

const styles = StyleSheet.create({});
