import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import { COLOR } from "../constants/colors";

//기본값을 normal로
const MyButton = ({ size = "normal", press, title = '버튼'}) => {
  return (
   
    //react는 여러 속성 줄때
    //className={[styles.btnContainer, styles[size]].join('')

    //react native는 join필요없음

    //Pressable은 함수로 만들 수 있는데 버튼 누를때마다 디자인 다르게 하라고 매개변수 e로 true, false 리턴
    //버튼을 눌렀을때 참을 리턴 => 단락평가 활용 => e.pressed && styles.pressed

    // <Pressable style={[styles.btnContainer, styles[size]]}>
    //=>함수로 만들땐  배열 리턴

    <Pressable
      style={(e) => {
        console.log(e);
        return [styles.btnContainer, styles[size], e.pressed && styles.pressed];
      }}
      onPress={press}
      //프롭스를 활용하기
      //각 버튼마다 다르게 적용하기 위해
    >
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  );
};

export default MyButton;

const styles = StyleSheet.create({
  btnContainer: {
    height: 34,
    borderRadius: 6,

    backgroundColor: COLOR.BTN_BACKGROUND_COLOR,
    //contants에서 선언한 상수 호출

    //Text영역 가운데 정렬
    justifyContent: "center",
    alignItems: "center",

    paddingVertical: 2, // '상하'로만 패딩
    paddingHorizontal: 4, // '좌우'로만 패딩
  },

  btn: {
    color: "white",
  },

  normal: {
    width: "30%",
  },

  small: {
    width: "10%",
  },

  pressed: {
    opacity: 0.8,
  },
});
