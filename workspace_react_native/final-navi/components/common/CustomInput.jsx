import { StyleSheet, Text, TextInput, View } from "react-native";
import React from "react";
import { colors } from "@/constants/colorConstant";
                              //비밀번호니?
const CustomInput = ({ label, isPw = false, ...props }) => {
  //value, onChangeText 전부 받아오기
  //...props 전부 받기(label, isPw이외 전부 = react에서도 했음 )
  return (
    <View>
      {label && <Text style={styles.label}>{label}</Text>}
      <View style={styles.container}>
        <TextInput
          style={styles.input}
          secureTextEntry={isPw}
          //비밀번호
          {...props}
          //onChangeText, value의 값들
        />
      </View>
    </View>
  );
};

export default CustomInput;

const styles = StyleSheet.create({
  label: {
    fontSize: 12,
    marginBottom: 6,
    color: colors.BLACK,
    //constants안에 있는 색
  },

  container: {
    height: 44,
    borderRadius: 8,
    paddingHorizontal: 10,
    //좌, 우 패딩만
    justifyContent: "center",
    borderColor: colors.ORANGE_600,
    backgroundColor: colors.GRAY_100,
    borderWidth: 1,
  },

  input: {
    fontSize: 16,
    flex: 1,
  },
});
