import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import { colors } from "../../constants/colorConstant";

//기본 크기는 large
const CustomButton = ({ label = "버튼", size = "large", ...props}) => {
  return (
    //style을 함수로 만들 수 있다 
    <Pressable style={({ pressed }) => [
      styles.container, 
      styles[size],
      pressed && styles.pressed
      //클릭하면 pressed가 참이되고 누르면 opacity가 적용
      ]}
      {...props}
      >
      {/*size를 변수로 사용 : [] */}
      <Text>{label}</Text>
    </Pressable>
  );
};

export default CustomButton;

const styles = StyleSheet.create({
  container: {
    borderRadius: 8,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: colors.ORANGE_600,
  },

  large: {
    width: "100%",
    height: 44,
  },

  normal: {
    width: "70%",
    height: 44,
  },

  pressed: {
    opacity: 0.8,
  },
});
