import { Image, StyleSheet, Text, TextInput, View } from "react-native";
import React, { useState } from "react";
import icon_edit from "../assets/icons/edit.png";
// import icon_edit from '@/assets/icons/edit.png'
// =>가끔 import를 직접 만들어야 할때가 있는데 이거 유용
// @ : 최상위에서 찾기 시작하겠다

//사진 삽입 리엑트와 동일
import icon_delete from "@/assets/icons/delete.png";
import { icon } from "../constants/icons";
import { data } from "../data/data";

const CartList = () => {
  //상품 목록을 저장할 변수
  const [cartList, setCartList] = useState(data);

  //입력한 값을 변수에 저장
  const [newItem, setNewItem] = useState("");

  console.log(cartList)

  return (
    <View>
      <Text>CartList</Text>
      {/* <Image source={icon_edit}/>
      <Image source={icon_delete}/>
      
      <Image source={icon.ICON_EDIT}/> */}
      {/* 자주쓰는 아이콘은 상수로 객체를 만들어 호출한다. */}

      <TextInput
        style={styles.input}
        value={newItem}
        onChangeText={(text) => setNewItem(text)}
        //키보드의 enter, 완료 키를 눌렀을때 실행하는 이벤트
        onSubmitEditing={() => {
          //console.log(Math.max())
          // max id + 1 구하기
          let max = cartList[0].id;
          for (const e of cartList) {
            if (e.id > max) {
              max = e.id;
            }
          }
          // 한줄로 줄이면 ....
          // const max1 = Math.max(...cartList.map((e, i) => {return e.id}))

          //저장할 객체를 생성
          const newData = {
            id: max + 1,
            item: newItem,
          };
          setCartList([...cartList, newData]);
          setNewItem('');
        }}
      />

      {cartList.map((item, i) => {
        return (
          <View key={i} style={styles.container}>
            <Text style={styles.title}>{item.item}</Text>
            <Image source={icon.ICON_EDIT} />
            <Image source={icon.ICON_DELETE} />
          </View>
          // 이걸 컴포넌트로 따로 빼서 컴포넌트를 반복돌림
        );
      })}
    </View>
  );
};

export default CartList;

const styles = StyleSheet.create({
  container: {
    borderWidth: 1,
    margin: 12,
    backgroundColor: "#eeeeee",
    borderRadius: 4,
    flexDirection: "row",
    alignItems: "center",
    padding: 10,
    gap: 8,
  },

  title: {
    flex: 1,
    borderWidth: 1,
    fontSize: 18,
  },

  input: {
    borderWidth: 1,
  },
});
