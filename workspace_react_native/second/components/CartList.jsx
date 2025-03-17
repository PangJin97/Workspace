import { Image, Pressable, StyleSheet, Text, TextInput, View } from "react-native";
import React, { useState } from "react";
import icon_edit from "../assets/icons/edit.png";
// import icon_edit from '@/assets/icons/edit.png'
// =>가끔 import를 직접 만들어야 할때가 있는데 이거 유용
// @ : 최상위에서 찾기 시작하겠다

//사진 삽입 리엑트와 동일
import icon_delete from "@/assets/icons/delete.png";
import { icon } from "../constants/icons";
import { data } from "../data/data";
import Task from "./Task";

const CartList = () => {
  //상품 목록을 저장할 변수
  const [cartList, setCartList] = useState(data);

  //입력한 값을 변수에 저장
  const [newItem, setNewItem] = useState("");

  //각 상품이 수정 상태인지, 수정 상태가 아닌지 판단하는 변수 
  
  //const [isEditing, setIsEditing] = useState(false)
  //여기서 하면 상품 리스트 전부가 안보임.. 그래서 상품을 컴포넌트(task)로 만들고 그 안에서 만듬 


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
          <Task item={item} key={i} cartList={cartList} setCartList={setCartList}/>
          // 여기서 key는 프롭스가 아니다. 
        );
      })}
    </View>
  );
};

export default CartList;

const styles = StyleSheet.create({

  input: {
    borderWidth: 1,
  },
});
